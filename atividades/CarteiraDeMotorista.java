package atividades;

public class CarteiraDeMotorista {
    private String numero;
    private boolean ativa;
    private char categoria;
    private int pontos;

    public CarteiraDeMotorista(String numero, char categoria) {
        this.numero = numero;
        this.categoria = categoria;
        this.ativa = true;
        this.pontos = 0;
    }

    public void modificarCategoria(char novaCategoria) {
        this.categoria = novaCategoria;
    }

    public void adicionarPontos(int quantidade) {
        this.pontos += quantidade;
        if (this.pontos > 30) {
            this.ativa = false;
        }
    }

    public int consultarPontos() {
        return pontos;
    }

    public boolean estaCancelada() {
        return !ativa;
    }
}
