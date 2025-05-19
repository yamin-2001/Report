import java.util.*;
class HuffmanComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode n1, HuffmanNode n2) {
        return Integer.compare(n1.freq, n2.freq);
    }
}
