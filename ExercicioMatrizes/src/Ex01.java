public class Ex01 {
    public static void main(String[] args){
        char[][] a = {
                {'a','b','c','d','e'},
                {'f','g','h','i','j'},
                {'l','m','n','o','p'},
                {'q','r','s','t','u'}
        };
        for (char[] linha : a) {
            for (char c :linha ){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println();


        int [][] b = {
                {19,25,100,99},
                {10,7,25,14},
                {32,2,47,74}
        };
        for (int[] linha : b ){
            for (int n : linha ){
                System.out.print(n + " ");
            }
            System.out.println();

        }
        System.out.println();

        double [][] c = {
                {1.9,2.5,10.0},
                {1.0,7.8,2.5},
                {3.5,2.2,4.7}
        };
        for (double[] linha : c ){
            for (double n : linha ){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
