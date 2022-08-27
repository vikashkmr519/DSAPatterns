public class TriangleStar {
    public static void main(String[] args) {
        print2(4);
    }

    public static void print2(int n){

        int space = n-1;
        for(int i =1;i<=n;i++){
            for(int k =1;k<=space;k++){
                System.out.print(" ");
            }
            space--;
            for(int k =1;k<=(2*i)-1;k++){
                if(k==1 || k==(2*i)-1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
