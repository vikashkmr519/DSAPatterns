public class RightDownMirrorStar {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
