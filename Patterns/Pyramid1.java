public class Pyramid1 {

    public static void main(String[] args){
        print(5);

    }

    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j =n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
