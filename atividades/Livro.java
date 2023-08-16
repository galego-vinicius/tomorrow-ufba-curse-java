package atividades;

public class Livro{

    private String titulo;
    private int QntDeExemplares;
    private int QntEmprestada;

    // Construtor 
    public Livro(String titulo, int QntDeExemplares){
        this.titulo = titulo;
        this.QntDeExemplares = QntDeExemplares;
        this.QntEmprestada = QntEmprestada;
    }

    // Get e Set

    public String getTitulo(){
        return this.titulo;
    }

    public int getQntDeExemplares(){
        return this.QntDeExemplares;
    }

        public int getQntEmprestada(){
        return this.QntEmprestada;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setQntDeExemplares(int QntDeExemplares){
        this.QntDeExemplares = QntDeExemplares;
    }

    public void setQntEmprestada(int QntEmprestada){
        this.QntEmprestada = QntEmprestada;
    }

    public String emprestar(){
        if (this.QntEmprestada < this.QntDeExemplares) {
        this.QntEmprestada ++;
        return "Livro emprestado";
    }
    return "Não pode emprestar livro";
    }

}