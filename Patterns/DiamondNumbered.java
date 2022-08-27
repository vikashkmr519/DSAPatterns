public class DiamondNumbered {

    public static void main(String[] args) {
        print(4);
    }

    public static void print(int n){
        int space= n-1;
        int row = 1;
        for(int i =1;i<=(2*n)-1;i++){
            for(int s = 1;s<=space;s++){
                System.out.print("  ");
            }
            if(i<n){
                space--;
            }else{
                space++;
            }

            int val = row;
            for(int k = 1;k<=(2*row)-1;k++){
                System.out.print(val+" ");
                if(k<=(2*row-1)/2){
                    val--;
                }else{
                    val++;
                }
            }

            if(i<n){
                row++;
            }else{
                row--;
            }
            System.out.println();
        }
    }
}


