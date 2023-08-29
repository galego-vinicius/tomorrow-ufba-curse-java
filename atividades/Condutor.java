package atividades;

public class Condutor {
    private String nome;
    private String identificacao;
    private CarteiraDeMotorista carteira;

    public Condutor(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.carteira = null;
    }

    public void atribuirCarteira(CarteiraDeMotorista carteira) {
        this.carteira = carteira;
    }

    public void modificarCategoria(char novaCategoria) {
        if (carteira != null) {
            carteira.modificarCategoria(novaCategoria);
        }
    }

    public void adicionarPontos(int quantidade) {
        if (carteira != null) {
            carteira.adicionarPontos(quantidade);
        }
    }

    public int consultarPontos() {
        return (carteira != null) ? carteira.consultarPontos() : 0;
    }

    public boolean verificarCarteiraCancelada() {
        return (carteira != null) && carteira.estaCancelada();
    }
}


