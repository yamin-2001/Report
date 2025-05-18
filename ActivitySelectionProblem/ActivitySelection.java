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
