import java.util.Scanner;

public class Array03Length {
    public static void main(String[] args) {
        // A ideia dessa aula na qual estudei, era apenas aprender sobre o uso do length
        // Que lê o tamanho do índice (index), porém, realizei um "mini sistema" onde
        // O usuário digitará o número do indice, será inserido dentro de um for int
        // Que passará da posição 0 até X, exibindo em ordem de fila
        // O objetivo foi fazer algo diferente do que está sendo realizado durante a
        // aula
        // Desenvolvendo melhor o raciocinio e explorando as funções.
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do índice do Array");
        int index = sc.nextInt();
        String[] nomes = new String[index];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira um nome: ");
            String inserir = sc.nextLine();
            nomes[i] = inserir;
            System.out.println("Nome: " + nomes[i] + " está na posição: " + (i + 1) + " da fila");
        }

        sc.close();
    }
}
