public class Rhombus_Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {


            // Print leading spaces
            for (int j = 4; j >=n-i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
