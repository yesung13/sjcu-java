#!/usr/bin/env bash
#20932172 윤예성
start() {
  vendingMachine
}

# 자판기 잔액 총 합 함수
function getAllCoinSum() {
  declare -i sum=0
  for (( i = 0; i < 5; i++ )); do
    let res=coinTypes[i]*coinCnt[i]
    ((sum+=res))
  done
  echo "$sum"
}

# 잔돈 생성 함수
function setCharge() {
  local pay=$1
  local menuNum=$2

  let charge=${pay}-${prices[menuNum - 1]}
  echo "잔돈 : $charge"
}

# 잔돈 갯수 출력 함수
function getCharge() {
  declare -i charge=$1      # 전달받은 인자값 저장 지역변수
  declare -i residualCoin=0 # 잔여코인 변수

  allCoinSum=$(getAllCoinSum)
  echo -n ">> "
  for ((i = 0; i < ${#coinTypes[@]}; i++)); do
    declare -i recharge=charge

    let coin=${charge}/${coinTypes[i]}
    ((charge %= coinTypes[i]))
    ((residualCoin = coinCnt[i] - coin))

    if ((allCoinSum < recharge)); then
      echo -e "[ERROR]\n 자판기의 잔액이 부족합니다. 관리자에게 문의하세요. (총 잔액:${allCoinSum}원)"
      exit 1 # 스크립트 강제종료
    fi

    if ((coinCnt[i] < coin)); then
      echo -n -e "[${coinTypes[i]}]원: ${coinCnt[i]}개 "
      let val=${coinCnt[i]}*${coinTypes[i]}
      ((charge = recharge - val))
      coinCnt[i]=0
      continue

    elif ((coinCnt[i] >= coin && coin != 0)); then
      echo -n -e "[${coinTypes[i]}]원: ${coin}개 "
      coinCnt[i]=${residualCoin} # 자판기 잔액 변경(잔여코인 갯수로 값 변경)

    fi

  done
}

function vendingMachine() {

  # 변수 선언
  declare -a rn                                 # 메뉴번호 배열
  declare -a menuNms=("콜라" "사이다" "환타" "생수") # 메뉴명 배열
  declare -a prices=(850 800 750 500)           # 가격 배열
  declare -a coinTypes=(1000 500 100 50 10)     # 자판기내 지폐/동전 타입
  declare -a coinCnt=(5 10 10 10 30)            # 자판기내 저장된 지폐/동전 갯수
  declare -i charge                             # 잔돈
  declare -i pay                                # 입력한 금액
  declare -i menuNum                            # 입력한 메뉴번호

  # 무한루프 생성
  while true; do

    # 자판기 메뉴 출력
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

    echo -n -e "메뉴를 선택하세요 : "
    read -r num
    menuNum=num

    # 메뉴 입력 잘못한 경우
    if [ ${menuNum} -le 0 ] || [ ${menuNum} -gt ${#rn[@]} ]; then
      echo "메뉴를 잘못 선택하셨습니다."
      continue
    fi

    # 입력한 금액이 충분한지 확인
    if ((pay >= prices[menuNum - 1])); then
      setCharge $pay $menuNum # 지불한 금액으로 잔돈 생성하여 출력
      getCharge $charge       # 잔돈 계산하여 출력
      echo

      # 자판기내 잔액 출력
      echo "자판기 잔액 현황"
      echo -n ">> "
      for ((i = 0; i < ${#coinCnt[@]}; i++)); do
        echo -n "[${coinTypes[i]}]원: ${coinCnt[i]}개 "
      done
      echo

    else
      echo -e "\n금액이 부족합니다!"
    fi



  done
}

start
