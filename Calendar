import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY",
            "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1];
    }
}

public class Calendar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(Result.findDay(month, day, year));

        sc.close();
    }
}
