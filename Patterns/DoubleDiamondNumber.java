public class DoubleDiamondNumber {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {

        int space=0;
        int col = n;
        int start= 1;
        for(int i = 1;i<=(2*n)-1;i++){
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            if(i<n){
                space++;
            }else{
                space--;
            }
            int val = start;
            for(int k =1;k<=col;k++ ){
                System.out.print(val+ " ");
                val++;
            }
            if(i<n){
                start++;
                col--;
            }else{
                start--;
                col++;
            }
            System.out.println();
        }
    }
}
