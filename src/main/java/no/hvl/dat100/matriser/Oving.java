package no.hvl.dat100.matriser;

public class Oving {
    public static void main(String[] args){
        int[][] matrise = {
                { 2,3},
                {4,5},
                {4,3},
                {3,4}};
        skrivUt(matrise);
    }
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }
}
