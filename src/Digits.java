import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digits(int num) {
        this.digitList = new ArrayList<>();
        digitList.add(num % 10);
        while (num > 9) {
            num /= 10;
            digitList.add(0, num % 10);
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1))
                return false;
        }
        return true;
    }
}