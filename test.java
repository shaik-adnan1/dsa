
public class test {
    public static void nForest(int n) {
        // Write your code here
        String row = "";
        for (int i = 0; i < n; i++) {
            row += "* ";
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        nForest(3);

    }
}