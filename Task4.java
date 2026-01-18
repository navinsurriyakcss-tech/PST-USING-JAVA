import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        // 1. Sort events chronologically
        events.sort(Comparator.comparing(e -> e.date));

        // Print sorted events
        for (Event e : events) {
            System.out.print(e.name + " ");
        }
        System.out.println();

        // 2. Earliest and latest events
        System.out.println(events.get(0).name);
        System.out.println(events.get(events.size() - 1).name);

        // 3. Events in given month
        List<Event> monthEvents = events.stream()
                .filter(e -> e.date.getMonthValue() == month)
                .collect(Collectors.toList());

        for (Event e : monthEvents) {
            System.out.print(e.name + " ");
        }

        sc.close();
    }
}
