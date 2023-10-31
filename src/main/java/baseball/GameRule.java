package baseball;

import java.util.Arrays;
import java.util.regex.Pattern;

public class GameRule {
    /**
     * 숫자 야구 게임의 규칙 및 예외 사항들 모아 놓은 Util class
     */
    static final Pattern digitPattern = Pattern.compile("^[1-9]{3}$");

    private GameRule() {
    }

    public static void isCheckNegativeNum(int num) {
        if (isNegativeNum(num)) {
            throw new IllegalArgumentException("음수를 입력하셨습니다.");
        }
    }

    private static boolean isNegativeNum(int num) {
        return num < 0;
    }


    public static void isCheckNumberOfDigit(String num) {
        if (!digitPattern.matcher(num).find()) {
            throw new IllegalArgumentException("3자리를 입력해주세요.");
        }
    }

    public static void isCheckDuplicateNum(String num) {
        if (isDuplicateNum(num)) {
            throw new IllegalArgumentException("중복된 값을 입력했습니다.");
        }
    }

    public static boolean isDuplicateNum(String num) { // integer 연산
        return Arrays.stream(num.split("")).distinct().count() < 3;
    }

}
