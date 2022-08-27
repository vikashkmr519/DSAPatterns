public class NumberPattern3 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n ){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
