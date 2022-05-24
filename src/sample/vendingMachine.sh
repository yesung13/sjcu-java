#!/usr/bin/env bash
#20932172 윤예성
start() {
  login
}
function login() {
    read -sp "자판기를 실행하려면 패스워드를 입력하세요 : " pw
    echo
    if [ ${pw} -eq 20932172 ]; then
        init
        vendingMachine
    else
      echo -e "\n패스워드가 틀렸습니다. 종료합니다."
      return 1
    fi
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
      echo -n -e "$((${i} + 1)).${menuNms[i]} ${prices[i]}원\t"
      ((rn[i] = i + 1))
    done

    echo -e "\n============================================================"

    echo -n -e "금액을 입력하세요 : " # -n:줄바꿈 사용 안함 -e:이스케이프 문자 사용
    read input
    pay=input

    if [ ${pay} -eq -1 ]; then
      echo "종료"
      break
    fi

    echo -n -e "메뉴를 선택하세요 : "
    read num
    menuNum=num

    if [ ${menuNum} -le 0 ] || [ ${menuNum} -ge ${#rn[@]} ]; then
      echo "메뉴를 잘못 선택하셨습니다."
      continue
    fi

    #돈이 충분한가?
    #if [ ${pay} >= ${prices[${menuNum-1}]} ]; then
    if ((${pay} >= ${prices[menuNum - 1]})); then
      let charge=${pay}-${prices[menuNum - 1]}

      echo -e "잔돈 : ${charge}"

      for ((i = 0; i < ${#moneyBox[@]}; i++)); do

        let coin=charge/moneyBox[i]
        ((charge %= moneyBox[i]))

        if [[ $coin != 0 ]]; then
          echo -n -e "${moneyBox[i]}원: ${coin}개 "
        fi

      done
      echo

    else
      echo -e "\n잔액이 부족합니다!"
    fi

  done
}

start
