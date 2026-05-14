public class Array06Multidimensionais02 {
    public static void main(String[] args) {
        // Criei um arrayInt com tamanho definindo como 3 e outro array Vazio
        int[][] arrayInt = new int[3][];
        // Usando o tamanho do Array ([3] 0,1,2) e dizendo que eles tem (0=2; 1=3; 2=6)
        // de tamanho
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        // Caso queira inicializar direto (usando esses array de cima de base)
        int[][] arrayInt2 = { { 0, 0 }, { 1, 2, 3, }, { 1, 2, 3, 4, 5, 6, } };

        // Pegando a primeira linha dos arrays [3] pra depois pegar os numeros dentro
        // [3][]
        for (int[] arrayBase : arrayInt) {
            System.out.println(" \n---------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}