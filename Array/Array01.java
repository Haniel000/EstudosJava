import java.util.Scanner; //Importando a função de "Inserir".

public class Array01{
    public static void main(String[] args) {

        // Classe de Scanner declarando "sc" como o leitor de entrada de informações que o usuário vai inserir.
        Scanner sc = new Scanner(System.in);

        // Declarando e reservando um espaço de índice 3 (inteiros) para memória (Caso não tenha valor inserido, será apenas reference.)
        int [] idades = new int[3];
        // Reference '''''' Objeto;

        // Inserindo os valores nos indices com base no valor escolhido acima.
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 40;

        // Imprimindo os valores no terminal de acordo com índice (0 = 20; 1 = 30; 2 = 40;)
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        // Fechando scanner para evitar vazamentos.
        sc.close();
    }
}
