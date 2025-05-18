class Item {
    int weight, value;
    double ratio;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}
