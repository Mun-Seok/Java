// TemporalAdjuster 인터페이스를 구현해 날짜 계산하는 예제
import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;
class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}
public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth()));
        p(today.with(firstDayOfMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(firstInMonth(TUESDAY)));
        p(today.with(lastInMonth(TUESDAY)));
        p(today.with(previous(TUESDAY)));
        p(today.with(previousOrSame(TUESDAY)));
        p(today.with(next(TUESDAY)));
        p(today.with(nextOrSame(TUESDAY)));
        p(today.with(dayOfWeekInMonth(4, TUESDAY)));
    }

    static void p(Object obj) { // 라인 길이 줄이기 위한 메서드
        System.out.println(obj);
    }
}
