public class pyramidfull {
    public static void main(String args[]){

        pyramid(7);
    }

    static void pyramid(int n){

        for(int i=0;i<2*n;i++){
            int noofcolumn=i;



            if(noofcolumn >= 2*n/2){
                noofcolumn=(2*n)-i;
            }


            int nofspace=n-noofcolumn;

            for(int c=0;c<nofspace;c++){
                System.out.print(" ");
            }

            for(int j=0;j<noofcolumn;j++){
                System.out.print(" *");
            }

            System.out.println();



        }

    }


}
