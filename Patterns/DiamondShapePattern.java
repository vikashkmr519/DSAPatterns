public class DiamondShapePattern {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        for(int i =1;i<=n;i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =n-1;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
