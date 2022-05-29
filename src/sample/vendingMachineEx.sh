#!/usr/bin/env bash
# 자판기 예제 샘플
start() {
  #  login
#  init
  vendingMachine
}
function login() {
  read -rsp "자판기를 실행하려면 패스워드를 입력하세요 : " pw
  echo
  if [ "${pw}" -eq 20932172 ]; then
    init
    vendingMachine
  else
    echo -e "\n패스워드가 틀렸습니다. 종료합니다."
    return 1
  fi
}

#function init() {
#  # 자판기 돈 액수 배열 정의
#  moneyType[0]=1000
#  moneyType[1]=500
#  moneyType[2]=100
#  moneyType[3]=50
#  moneyType[4]=10
#
#  # 자판기 지폐/동전 수 배열 정의
#  moneyCnt[0]=5
#  moneyCnt[1]=5
#  moneyCnt[2]=5
#  moneyCnt[3]=10
#  moneyCnt[4]=30
#}

function ABS() {
  declare -i num=$1

  if [ $num -lt 0 ]; then
    let num=-$num
    return $num
  elif [ $num -gt 0 ]; then
    return $num
  else
    return $num
  fi
}

# 잔돈 생성 함수
function setCharge() {

  local pay=$1
  local menuNum=$2

  let charge=${pay}-${prices[menuNum - 1]}
  echo "잔돈 : $charge"
}

function getCharge() {
  declare -a tempArr
  declare -i charge=$1
  declare -i cnt=0
  declare -i residualCoin=0 # residualCoin: 잔여코인 변수


#  echo -n ">> "
  for ((i = 0; i < ${#coinTypes[@]}; i++)); do

#    let money=${charge}/${moneyType}
    let coin=${charge}/${coinTypes[i]} # 잔돈 동전 갯수
    ((charge %= coinTypes[i]))
    ((residualCoin = coinCnt[i] - coin))

    if ((coinCnt[i] < 0 || coinCnt[i] < coin)); then
      ABS residualCoin
      local rtn=$?
      echo -e "[${coinTypes[i]}]원이 ${rtn}개 부족합니다. 관리자에게 문의하세요."
    fi

    if ((coinCnt[i] >= coin && coin != 0)); then
      echo -n -e "[${coinTypes[i]}]원: ${coin}개 "
      coinCnt[i]=${residualCoin} # 자판기 잔액 변경(잔여코인 갯수로 값 변경)
    fi

  done
}

function vendingMachine() {

  # 변수 선언
  declare -a rn
  declare -a menuNms=("콜라" "사이다" "환타" "생수")
  declare -a prices=(850 800 750 500)
  declare -a coinTypes=(1000 500 100 50 10)  # 자판기 내 동전박스
  declare -a coinCnt=(5 10 10 10 30)    # 자판기 저장된 동전갯수
  declare -i moneyType=1000            # 자판기 내 지폐박스
  declare -i moneyCnt=5               # 자판기 저장된 지폐갯수
  declare -i charge
  declare -i pay
  declare -i menuNum

  # 무한루프 생성
  while true; do

    echo "============================================================"
    echo -e "\t\t\t[자판기]"
    for ((i = 0; i < ${#menuNms[@]}; i++)); do
      echo -n -e $((i + 1))".${menuNms[i]} ${prices[i]}원\t"
      ((rn[i] = i + 1))
    done
    echo -e "\n============================================================"

    echo -n -e "금액을 입력하세요 : " # -n:줄바꿈 사용 안함 -e:이스케이프 문자 사용
    read -r input
    pay=input

    #    if [ ${pay} -eq -1 ]; then
    #      echo "종료"
    #      break
    #    fi

    echo -n -e "메뉴를 선택하세요 : "
    read -r num
    menuNum=num

    if [ ${menuNum} -le 0 ] || [ ${menuNum} -gt ${#rn[@]} ]; then
      echo "메뉴를 잘못 선택하셨습니다."
      continue
    fi

    #돈이 충분한가?
    if ((pay >= prices[menuNum - 1])); then
      setCharge $pay $menuNum # 지불한 금액으로 잔돈 생성하여 출력
      getCharge $charge       # 잔돈 계산하여 출력
      echo

    else
      echo -e "\n금액이 부족합니다!"
    fi

    echo "자판기 잔액 현황"
    echo -n ">> "
#    echo -n "[${moneyType}]원: ${moneyCnt}개 "본
    for ((i = 0; i < ${#coinCnt[@]}; i++)); do
      echo -n "[${coinTypes[i]}]원: ${coinCnt[i]}개 "
    done
    echo

  done
}

start
