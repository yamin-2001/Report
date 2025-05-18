import java.util.*;
public class HuffmanCoding {

    public static void buildCodes(HuffmanNode root, String code, Map<Character, String> codes) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            codes.put(root.ch, code);
        }

        buildCodes(root.left, code + "0", codes);
        buildCodes(root.right, code + "1", codes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] chars = new char[n];
        int[] freqs = new int[n];

        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        System.out.println("Enter frequencies:");
        for (int i = 0; i < n; i++) {
            freqs[i] = sc.nextInt();
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(new HuffmanComparator());

        for (int i = 0; i < n; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode merged = new HuffmanNode('-', left.freq + right.freq);
            merged.left = left;
            merged.right = right;

            pq.add(merged);
        }

        HuffmanNode root = pq.peek();
        Map<Character, String> huffmanCodes = new HashMap<>();
        buildCodes(root, "", huffmanCodes);

        System.out.println("Huffman Codes:");
        for (char ch : huffmanCodes.keySet()) {
            System.out.println(ch + ": " + huffmanCodes.get(ch));
        }
    }
}
