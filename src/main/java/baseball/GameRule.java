package baseball;

import java.util.regex.Pattern;

public class GameRule {
    /**
     * 숫자 야구 게임의 규칙 및 예외 사항들 모아 놓은 Util class
     */
    static final Pattern digitPattern = Pattern.compile("^[0-9]{3}$");

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


    public static void isCheckNumberOfDigit(String num) {
        if (!digitPattern.matcher(num).find()) {
            throw new IllegalArgumentException("3자리를 입력해주세요");
        }
    }

}
