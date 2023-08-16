package atividades;

public class Clientes {
    private String nome;
    private int idade;

    public Clientes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public double calculoDoIngresso(String diaDaSemana){
       double valorDoIngresso = 0;

        if (diaDaSemana.equals("Segunda") || diaDaSemana.equals("Terça") || diaDaSemana.equals("Sexta") || diaDaSemana.equals("Sabado") || diaDaSemana.equals("Domingo")){
            if (idade >= 14 && idade <= 65){
                valorDoIngresso = 12;
            } else {
                valorDoIngresso = 6;
            }
        } else if (diaDaSemana == "Quarta" || diaDaSemana == "Quinta"){
            valorDoIngresso = 6;
        }
        return valorDoIngresso;
        }
}
