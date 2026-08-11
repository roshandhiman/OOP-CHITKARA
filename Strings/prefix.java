public class prefix {
    public static void main(String[] args) {
        String[] arr = {"this", "thin", "that", "though", "thought"};
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println("Common Prefix: " + prefix);
    }
}