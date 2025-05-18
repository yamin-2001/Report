import java.util.*;
public class ActivitySelection {

    public static void selectActivities(List<Activity> activities) {
        Collections.sort(activities);
        System.out.println("Selected Activities:");

        int lastEnd = -1;
        for (Activity activity : activities) {
            if (activity.start >= lastEnd) {
                System.out.println("Start: " + activity.start + ", End: " + activity.end);
                lastEnd = activity.end;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        List<Activity> activities = new ArrayList<>();
        System.out.println("Enter start and end times of activities:");
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities.add(new Activity(start, end));
        }

        selectActivities(activities);
    }
}
