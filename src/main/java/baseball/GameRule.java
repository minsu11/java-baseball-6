package baseball;

public class GameRule {
    /**
     * 숫자 야구 게임의 규칙 및 예외 사항들 모아 놓은 Util class
     */

    private GameRule() {
    }

    public static void isCheckNegativeNum(int num) {
        if (isNegativeNum(num)) {
            throw new IllegalArgumentException("음수를 입력하셨습니다");
        }
    }

    private static boolean isNegativeNum(int num) {
        return num < 0;
    }


}
