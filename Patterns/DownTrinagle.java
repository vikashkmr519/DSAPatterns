public class DownTrinagle {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        int space = 0;
        for(int i =n;i>=1;i--){

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(int k = 1;k<=(2*i)-1;k++){
                if(i==n || k==1 || k==(2*i)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
