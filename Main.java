// import Triangulo.Triangulo;
import atividades.Clientes;
// import livros.Livro;
import atividades.ParImpar;

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

        ParImpar parImpar = new ParImpar(true);

         parImpar.imprimirNumeros(10, 1); // Tipo de laç pode ser 1, 2 ou 3.

    }
}