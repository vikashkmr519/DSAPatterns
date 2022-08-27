public class KshapeAlphabet {

    public static void main(String[] args) {
        print(6);
    }

    public static void print(int n){


        int col = n;

        for(int i =1;i<=2*n;i++){
            char alphabet = 65;
            for(int k = 1;k<=col;k++ ){
                System.out.print(alphabet+" ");
                alphabet++;
            }
            if(i<=n){
                if(i!=n){
                    col--;
                }
            }else{
                col++;
            }
            System.out.println();
        }
    }
}
