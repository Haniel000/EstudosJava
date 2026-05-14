import DAO.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Carlos";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
