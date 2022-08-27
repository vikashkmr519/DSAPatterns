public class PascalNumberTriangle {
    public static void main(String[] args) {
        print(5);

    }

    public static void print(int n){

        int space = n-1;

        for(int i =1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            int num = 1;
            for(int k = 1;k<=(i);k++){
                System.out.print(num+" ");
                num = num*(i-k)/k;
            }
            System.out.println();
        }
    }
}
