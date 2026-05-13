public class Array04Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[2]; // Criando uma referencia e ja declarando o valor
        int[] numeros2 = { 1, 2, 3, 4, 5 }; // Criando a Array já definindo o tamanho só de inserir os valores
        int[] numeros3 = new int[] { 5, 4, 3, 2, 1 }; // Uma junção dos dois acima.
        System.out.println(numeros[0]);
        System.out.println(numeros2[0]);
        // Foreach
        // É uma forma simplificada e melhorada de se escrever :
        // int num = nuemros3[0];
        // System.out.println(num);
        for (int num : numeros3) {
            System.out.println(num);
        }
    }

}
