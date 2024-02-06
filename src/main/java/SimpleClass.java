import java.time.LocalDate;

/**
 * SimpleClass
 *
 * @author Esteban Dujardin (este22pro@gmail.com)
 */
public class SimpleClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        new SimpleClass().add(1, 2);
    }

    /**
     * Adds firstNumber and b
     *
     * @param firstNumber the first number
     * @param b the second number
     */
    public int add(int firstNumber, int b) {
        return firstNumber + b;
    }

    /**
     * isNowBetween
     * @param startingDate
     * @param endingDate
     * @return
     */
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate)
    {
        LocalDate now = LocalDate.now();
        return isDateBetween(startingDate, endingDate, now);
    }

    private static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate) && now.isBefore(endingDate);
    }
}