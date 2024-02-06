import java.time.LocalDate;

public class DateUtils {
    /**
     * isNowBetween
     *
     * @param startingDate
     * @param endingDate
     */
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate date = LocalDate.now();
        return date.isBefore(endingDate) && date.isAfter(startingDate);
    }

    /**
     * isDateBetween
     *
     * @param startingDate
     * @param endingDate
     * @param now
     */
    static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        LocalDate date = now;
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }
}