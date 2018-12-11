public class DigitListRunner {
    public static void main(String[] args) {
        Digits digits1 = new Digits(7);
        System.out.println(digits1.isStrictlyIncreasing()); // → true

        Digits digits2 = new Digits(65310);
        System.out.println(digits2.isStrictlyIncreasing()); // → false

        System.out.println(new Digits(1356).isStrictlyIncreasing()); // → true
        System.out.println(new Digits(1336).isStrictlyIncreasing()); // → false
        System.out.println(new Digits(1536).isStrictlyIncreasing()); // → false

        System.out.println(digits2.getDigitList());
    }
}