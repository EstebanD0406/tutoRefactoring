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
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }

    /**
     * isDateBetween
     *
     * @param startingDate
     * @param endingDate
     * @param now
     */
    public static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        LocalDate date = now;
        return date.isAfter(startingDate) && date.isBefore(endingDate);
    }

    /**
     * isDateOutside
     *
     * @param date
     * @param startingDate
     * @param endingDate
     * @return
     */
    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return !isDateBetween(date, startingDate, endingDate);
    }
}