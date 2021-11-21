package study.racingcar;

import study.racingcar.model.RacingGame;
import study.racingcar.strategy.MoveStrategy;
import study.racingcar.strategy.RandomMoveStrategy;
import study.racingcar.view.InputView;
import study.racingcar.view.ResultView;

/**
 * 기능 요구사항
 *  - 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
 *  - 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
 *  - 자동차 이름은 쉼표(,)를 기준으로 구분한다.
 *  - 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
 */
public class RacingMain {

    public static void main(String[] args) {
        String carNames = InputView.requestCarNames();
        int tryCount = InputView.requestTryCount();
        MoveStrategy moveStrategy = new RandomMoveStrategy();
        RacingGame racingGame = new RacingGame(carNames, tryCount);

        ResultView.printInitResult();

        while(racingGame.moreRound()){
            racingGame.playRound(moveStrategy);
            ResultView.printResult(racingGame.getResult());
        }

        ResultView.printWinners(racingGame.getWinners());
    }
}
