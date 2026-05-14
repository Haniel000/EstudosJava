public class Array05Multidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30 Dias
        // Vamos lá tentar explicar, Array Multidimensionais é Matriz (um Quadro de
        // dimensão 3x3 (maior ou menor) onde acontece o seguinte, [][] (Primeiro
        // Colchetes: Quanto tem dentro desse primeiro array (0), segundo definindo o
        // valor DENTRO do Array em si). Ou seja:
        // Posição 0, linha 1 [0][1], e por ai em diante.)
        int[][] meses = new int[3][3];
        meses[0][0] = 0;
        meses[0][1] = 1;
        meses[0][2] = 2;
        System.out.println(meses[0][0]);
        System.out.println(meses[0][1]);
        System.out.println(meses[0][2]);
        System.out.println("-----------------------------------");
        meses[1][0] = 10;
        meses[1][1] = 11;
        meses[1][2] = 12;

        System.out.println(meses[1][0]);
        System.out.println(meses[1][1]);
        System.out.println(meses[1][2]);
        System.out.println("-----------------------------------");

        // Pegando primeiro valor da posição (i, o primeiro colchetes[]), em seguida
        // pegando a linha (j, o segundo colchetes[])
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                System.out.println("Posição [" + i + "][" + j + "] = " + meses[i][j]);
            }
        }

        System.out.println("-------------------------");

        // Caso seja necessário fazer usando Foreach
        // Resumindo, arrBase pra pegar os valores da Posição 0, 1, 2. E usando o num
        // pra pegar a linha 0, 1, 2, dentro da posição x
        for (int[] arrBase : meses) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

    }
}
