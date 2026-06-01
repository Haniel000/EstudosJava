package Orientado02.DAO;
import Orientado02.DAO.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Chevrolet Onix Hatch LT 1.0 Flex";
        carro.ano = 2023;
        carro.modelo = "2004";

        System.out.println("O nome do carro é: " + carro.nome + " do ano de: " + carro.ano + " modelo: " + carro.modelo);
    }
}
