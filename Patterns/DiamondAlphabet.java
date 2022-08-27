public class DiamondAlphabet {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){

        char alphabet = 65;
        int space = n-1;
        int row = 1;
        for(int i =1 ; i<=2*n-1;i++){
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            if(i<n){
                space--;
            }else{
                space++;
            }

            for(int k =1;k<=(2*row)-1;k++){
                if(k==1 || k == 2*row-1){
                    System.out.print(alphabet);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<n){
                row++;
                alphabet++;
            }else{
                row--;
                alphabet--;
            }
        }
    }
}
