// import Triangulo.Triangulo;
import atividades.Clientes;
// import livros.Livro;
import atividades.ParImpar;
import atividades.TV;
import atividades.CarteiraDeMotorista;
import atividades.Condutor;

public class Main {
    public static void main(String[] args) {

    // atributos
    // construtores
    // métodos

    // Triangulo triangulo = new Triangulo(3, 5, 7); 

    // System.out.println("O trianguo é equilatero? " + triangulo.etriangulo());

    // Livro livro1 = new Livro("Crime e Castigo", 3);

    // System.out.println("Eu gostaria de pegar um livro. " + livro1.emprestar());   

        Clientes cliente1 = new Clientes("vinicius", 24);
        System.out.println("Ingresso com valor de: R$" + cliente1.calculoDoIngresso("Sexta"));
// ______________________________________________________________________________________//
        ParImpar parImpar = new ParImpar(true);
        parImpar.imprimirNumeros(10, 1); // Tipo de laç pode ser 1, 2 ou 3.
// ______________________________________________________________________________________//
        TV tv1 = new TV("samsung");
        System.out.println(tv1.ligar());
// ______________________________________________________________________________________//
        CarteiraDeMotorista carteiraJoao = new CarteiraDeMotorista("12345", 'B');
        Condutor joao = new Condutor("João da Silva", "123456789");

        joao.atribuirCarteira(carteiraJoao);
        joao.modificarCategoria('C');
        joao.adicionarPontos(20);

        System.out.println("Pontos de João: " + joao.consultarPontos());
        System.out.println("Carteira de João cancelada? " + joao.verificarCarteiraCancelada());
    }
}