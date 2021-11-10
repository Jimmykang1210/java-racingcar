# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 구현 목록
* "자동차 대수는 몇 대 인가요?" 출력
* 자동차 대수 입력 -> (입력값이 1`MIN_INPUT_NUMBER`보다 크거나 같은 정수인지 Validation Check)
* "시도할 회수는 몇 회 인가요?" 출력
* 시도할 회수 입력 -> (입력값이 1`MIN_INPUT_NUMBER`보다 크거나 같은 정수인지 Validation Check)
* 시도 회수 반복문 START
    * 자동차 대수 반복문 START
        * 전진 조건 생성, 0`MIN_RANDOM_VALUE`에서 9`MAX_RANDOM_VALUE` 사이에서 random 값
        * 전진 조건 체크, 4`MIN_FORWARD_VALUE` 이상인 경우 1칸("-", `MOVE_FORWARD`) 이동
  * 자동차 대수 반복문 END
* 시도 회수 반복문 END
* 시도 회수별로 자동차 이동시, 라인별 `-`을 추가하는 형식으로 출력