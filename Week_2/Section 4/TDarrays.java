import java.util.Arrays;

public class TDarrays {
    
    public static void main(String[] args) {
        
        /*
         * 1 2 3 4
         * 2 3 4 5 
         * 3 4 5 6
         */

        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };  // primeiro numero representa as linhas segundo numero representa as colunas
       
        /*1 forma de preencher a matriz
        new int[3][4];

        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;*/

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));
    
        System.out.println("\n");//imprimindo os valores utilizando cada index
        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);
    }

}
