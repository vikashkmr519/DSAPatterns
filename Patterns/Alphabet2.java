public class Alphabet2 {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        char alphabet = 65;

        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(alphabet+" ");
            }
            alphabet++;
            System.out.println();
        }

    }
}
