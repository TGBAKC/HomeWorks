package Arrays;

public class array {
    public static void main(String[] args) {



        int[][] matris = {
                {5, 6 , 7},
                {8, 9 , 10}
        };

   int n = matris.length;


   int m = matris[0].length;
        int[][] transpoz = new int[m][n];

   for(int i=0; i<n;i++) {

    
       for (int j = 0; j < m; j++) {


           transpoz[j][i] = matris[i][j];


       }



   }
        System.out.println("Transpoz:");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

    }
}



