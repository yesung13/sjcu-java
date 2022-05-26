#!/usr/bin/env bash
#20932172 윤예성
start() {
  init
  vendingMachine
}

function init() {
  # 자판기 돈 액수 배열 정의
  moneyBox[0]=1000
  moneyBox[1]=500
  moneyBox[2]=100
  moneyBox[3]=50
  moneyBox[4]=10

  # 자판기 지폐/동전 수 배열 정의
  moneyCnt[0]=5
  moneyCnt[1]=10
  moneyCnt[2]=10
  moneyCnt[3]=10
  moneyCnt[4]=30
}

# 잔돈 생성 함수
function setCharge() {
  local pay=$1
  local menuNum=$2

  let charge=${pay}-${prices[menuNum - 1]}
  echo "잔돈 : $charge"
}

function getCharge() {
  local charge=$1

  for ((i = 0; i < ${#moneyBox[@]}; i++)); do
    local reCharge=${charge}

    let coin=${charge}/${moneyBox[i]}
    ((charge %= moneyBox[i]))
    ((residualCoin = moneyCnt[i] - coin)) # residualCoin: 잔여코인 변수

    if ((moneyCnt[i] < coin && coin != 0)); then
      echo "loading 1"
      let re=${reCharge}/${moneyBox[i + 1]}
      ((reCharge %= moneyBox[i + 1]))
      echo -n -e "${moneyBox[i]}원: ${re}개/잔여:${residualCoin}개 "
    fi

    if ((moneyCnt[i] >= coin && coin != 0)); then
      echo "loading 2"
      echo -n -e "${moneyBox[i]}원: ${coin}개/잔여:${residualCoin}개 "
    fi

  done
}

function vendingMachine() {

  # 변수 선언
  declare -a rn
  declare -a menuNms=("콜라" "사이다" "환타" "생수")
  declare -a prices=(850 800 750 500)
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
      echo -e "\n잔액이 부족합니다!"
    fi

  done
}

start
