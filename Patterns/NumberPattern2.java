public class NumberPattern2 {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        int num = 1;
        for(int i =1 ;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
