import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Pa_63_GregorianCalendar_class {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Calendar : " + cal.getTime());
        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());

        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
