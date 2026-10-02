package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
            }
        }


	// b)
	public static String tilStreng(int[][] matrise) {
            String resultat = "";

            for (int[] rad : matrise) {
                for (int tall : rad) {
                    resultat += tall + " ";
                }
                resultat += "\n";
            }
            return resultat;
        }


	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
    }

	// d)
	public static boolean erLik(int[][]mat1, int[][] mat2)  {
        if (mat1.length != mat2.length) {
            return false;
        }

        for (int i = 0; i < mat1.length; i++) {

            if (mat1[i].length != mat2[i].length) {
                return false;
            }
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

	// e)
	public static int[][] speile(int[][] matrise) {
            int[][] ny = new int[matrise.length][matrise[0].length];

            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[i].length; j++) {
                    ny[i][j] = matrise[i][matrise[i].length - 1 - j];
                }
            }
            return ny;
    }

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
        int[][] resultat = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultat;
    }



}
