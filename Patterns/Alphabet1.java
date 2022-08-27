public class Alphabet1 {


    
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        for(int i=1;i<=n;i++){
            char alphabet = 65;

            for(int j = 1;j<=i;j++){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
