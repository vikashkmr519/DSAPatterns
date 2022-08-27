public class BinaryNumberPattern {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        for(int i = 1;i<= n;i++){
            int num = i%2==0 ? 0 : 1;
            for(int j = 1;j<=n;j++){

                System.out.print(num +" ");
                num = num==0? 1: 0;

            }
            System.out.println();
        }
    }
}
