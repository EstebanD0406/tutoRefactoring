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
        DateUtils.isNowBetween(LocalDate.MIN, LocalDate.MAX);
        DateUtils.isDateBetween(LocalDate.of(2019, 1, 1), LocalDate.MIN, LocalDate.MAX);
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

}