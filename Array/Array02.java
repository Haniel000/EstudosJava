public class Array02 {
    public static void main(String[] args) {
        // tipos primitos byte, short, int, long, float, double sempre serão retornados como 0
        
        byte[] bites = new byte[1];
        System.out.println("Imprimindo bytes: " + bites[0]);
        
        short[] curto = new short[1];
        System.out.println("Imprimindo short: " + curto[0]);
        
        int[] inteiro = new int[1];
        System.out.println("Imprimindo int: " + inteiro[0]);
        
        long[] longo = new long[1];
        System.out.println("Imprimindo long: " + longo[0]);
        
        float[] flutuante = new float[1];
        System.out.println("Imprimindo float: " + flutuante[0]);
        
        double[] duplo = new double[1];
        System.out.println("Imprimindo double: " + duplo[0]);
        
        //boolean será retornado como false
        boolean[] booleano = new boolean[1];
        System.out.println("Imprimindo boolean: " + booleano[0]);
        
        //String será retornado como null
        String[] texto = new String[1];
        System.out.println("Imprimindo String: " + texto[0]);
        
        // char será retornado como '\u0000 ou ' ' '
        char[] caractere = new char[1];
        System.out.println("Imprimindo char: " + caractere[0] + "----");
        
    }
}
