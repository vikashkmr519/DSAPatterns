public class AlphbetA {
    public static void main(String[] args) {
        print(7);
    }

    public static void print(int n){
        //print one extra line
        for(int i =0;i<=n;i++){
            if(i==0){
                System.out.print("* *");
            }else if(i == n/2){
                System.out.print("* * *");
            }else{
                System.out.print("*   *");
            }
            System.out.println();
            System.out.println();

        }
    }
}
