public class TriangleAlphabet {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=space;k++){
                System.out.print(" ");
            }
            space--;
            char alphabet = 65;
            for(int k = 1;k<=i;k++){
                System.out.print(alphabet+ " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
