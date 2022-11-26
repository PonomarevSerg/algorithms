public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romToInt("MCMXCIV"));
    }
    public static int romToInt (String s) {
        int result = 0, num = 0, prev = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            if (num < prev) {
                result -= num;
            }
            else {
                result += num;
            }
            prev = num;
        }
        return result;
    }
}
