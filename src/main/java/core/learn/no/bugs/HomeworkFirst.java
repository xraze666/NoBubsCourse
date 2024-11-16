package core.learn.no.bugs;

import java.util.stream.IntStream;

public class HomeworkFirst {
    public static void main(String[] args) {
        System.out.println("#1 Делимость на 5 и 7");
        System.out.println(isDivided(5));
        System.out.println(isDivided(7));
        System.out.println(isDivided(35));

        System.out.println("#2 Принадлежность интервалу от 10 до 20 вкл.");
        System.out.println(isBelong(6));
        System.out.println(isBelong(14));

        System.out.println("#3 Квадраты");
        System.out.println("3 и 6 " + isSquare(3, 6));
        System.out.println("2 и 4 " + isSquare(2, 4));
        System.out.println("4 и 2 " + isSquare(4, 2));
        System.out.println("100 и 0 " + isSquare(100, 0));
        System.out.println("-3 и 9 " + isSquare(-3, 9));


        System.out.println("#4 Последняя цифра числа 5");
        System.out.println("15 " + isLastDigitOfNumberFive(15));
        System.out.println("55555 " + isLastDigitOfNumberFive(55555));
        System.out.println("5 " + isLastDigitOfNumberFive(5));
        System.out.println("3 " + isLastDigitOfNumberFive(3));
        System.out.println("55550 " + isLastDigitOfNumberFive(55550));
        System.out.println("10 " + isLastDigitOfNumberFive(10));
        System.out.println("9995 " + isLastDigitOfNumberFive(9995));

        System.out.println("#5 Четность суммы цифр в числе");
        System.out.println("10 " + isSumOfDigitsEven(10));
        System.out.println("0 " + isSumOfDigitsEven(0));
        System.out.println("1 " + isSumOfDigitsEven(1));
        System.out.println("1234 " + isSumOfDigitsEven(1234));
        System.out.println("-120 " + isSumOfDigitsEven(-120));

        System.out.println("#6 Два числа по модулю равны ");
        System.out.println("-10 и 10 " + isNumbersEqualsByModule(-10, 10));
        System.out.println("10 и -10 " + isNumbersEqualsByModule(10, -10));
        System.out.println("-0 и 0 " + isNumbersEqualsByModule(-0, 0));
        System.out.println("-3 и 33 " + isNumbersEqualsByModule(-3, 33));

        System.out.println("#7 Проверка знака числа");
        System.out.println("5 " + sign(5));
        System.out.println("-5 " + sign(-5));
        System.out.println("0 " + sign(0));

        System.out.println("#8 Делимость на 2 или 3");
        System.out.println("2 " + isDividedByThreeOrTwo(2));
        System.out.println("3 " + isDividedByThreeOrTwo(3));
        System.out.println("6 " + isDividedByThreeOrTwo(6));
        System.out.println("7 " + isDividedByThreeOrTwo(7));
        System.out.println("-10 " + isDividedByThreeOrTwo(-10));

        System.out.println("#11 Четность и кратность 10 суммы двух чисел");
        System.out.println("10 и 0 " + isEvenAndDivisibleBy10(10, 0));
        System.out.println("10 и 3 " + isEvenAndDivisibleBy10(10, 3));
        System.out.println("17 и 3 " + isEvenAndDivisibleBy10(17, 3));
        System.out.println("10 и 5 " + isEvenAndDivisibleBy10(10, 5));
        System.out.println("5 и 3 " + isEvenAndDivisibleBy10(5, 3));

        System.out.println("#13 Палиндром");
        System.out.println("121 " + isPalindrome(121));
        System.out.println("1 " + isPalindrome(1));
        System.out.println("12 " + isPalindrome(12));
        System.out.println("11 " + isPalindrome(11));
        System.out.println("11111 " + isPalindrome(11111));
        System.out.println("1211 " + isPalindrome(1211));
    }


    /**
     * #1. Вывести true, если число делится на 5 и 7 одновременно, иначе false
     */
    public static boolean isDivided(int value) {
        return value % 5 == 0 & value % 7 == 0;
    }

    /**
     * #2. Вывести true, если число входит в интервал [10,20], иначе false
     */
    public static boolean isBelong(int value) {
        return value >= 10 & value <= 20;
    }

    /**
     * #3. Вывести true, если одно из чисел является квадратом другого, иначе false
     */
    public static boolean isSquare(int a, int b) {
        return a * a == b || b * b == a;
    }

    /**
     * #4. Вывести true, если последняя цифра числа 5, иначе false
     */
    public static boolean isLastDigitOfNumberFive(int value) {
        String stringValue = String.valueOf(value);
        return stringValue.lastIndexOf('5') == stringValue.length() - 1;
    }

    /**
     * #5. Вывести true, если сумма всех цифр числа четная, иначе false
     */
    public static boolean isSumOfDigitsEven(int value) {
        int sum = 0;

        while (Math.abs(value) > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum % 2 == 0;
    }

    /**
     * #6. Вывести true, если два числа по модулю равны, иначе false
     */
    public static boolean isNumbersEqualsByModule(int a, int b) {
        //return Math.abs(a) == Math.abs(b);
        return (a < 0 ? -a : a) == (b < 0 ? -b : b);
    }

    /**
     * #7. Вернуть Positive, если a>0, вернуть Negative, если a<0, вернуть Zero, если a=0
     */
    public static String sign(int a) {
        if (a > 0) {
            return "Positive";
        } else if (a < 0) {
            return "Negative";
        } else return "Zero";
    }

    /**
     * #8. Вывести true, если число делится на 2 или на 3, иначе false
     */
    public static boolean isDividedByThreeOrTwo(int a) {
        return a % 2 == 0 || a % 3 == 0;
    }

    /**
     * #9. Вывести true, если сумма двух чисел четная, иначе false
     */
    public static String isSumEven(int a, int b) {
        return (a + b) % 2 == 0 ? "Even" : "Odd";
    }

    /**
     * #10. Вывести true, если число делится на 4 и на 6 одновременно, иначе false
     */
    public static boolean isDividedByFourAndSix(int value) {
        return value % 4 == 0 && value % 6 == 0;
    }

    /**
     * #11. Вывести Even and Divisible by 10, если сумма четная и делится на 10,
     * Even but not Divisible by 10, если сумма четная, но не делится на 10,
     * Odd если сумма нечетная
     */
    public static String isEvenAndDivisibleBy10(int a, int b) {
        int sum = a + b;
        if (sum % 10 == 0) {
            return "Even and Divisible by 10";
        } else if (sum % 10 != 0 && sum % 2 == 0) {
            return "Even but not Divisible by 10";
        } else return "Odd";
    }

    /**
     * #12. Вывести максимум из трех чисел
     */
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * #13. Вывести true, если число палиндром, иначе false
     */
    public static boolean isPalindrome(int value) {
        char[] charArray = String.valueOf(value).toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * #14. Два числа, если оба кратны 3, вернуть сумму
     * Если одно из них кратное, вернуть квадрат второго числа
     * Если ни одно не кратно, вернуть null
     */

    public static Integer isDividedByThree(int a, int b) {
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return b * b;
        } else return null;
    }

    /**
     * #15. Вернуть Child - до 12 лет,
     * вернуть teenager - от 13 до 17 лет,
     * вернуть Adult - от 18 до 64 лет,
     * вернуть Senior - от 65 и старше
     */

    public static String identifyCategory(int age) {
        if (age < 12) {
            return "Child";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else if (age >=18 && age <= 64) {
            return "Adult";
        } else return "Senior";
    }

    /**
     * #16. Вернуть true, если первое число делится на второе с остатком равным 2, иначе false
     */
    public static boolean isDividedWithRemainder(int a, int b) {
        return a % b == 2;
    }
}
