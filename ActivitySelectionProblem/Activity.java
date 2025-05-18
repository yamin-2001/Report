class Activity implements Comparable<Activity> {
    int start, end;

    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Activity other) {
        return this.end - other.end;
    }
}
