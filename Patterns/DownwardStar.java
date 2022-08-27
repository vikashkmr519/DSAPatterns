public class DownwardStar {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        for(int i = 1 ;i <=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
