package atividades;

public class TV{

private String marca;
private boolean power;
private int canal = 100;
private boolean smart;
private String senha;


    public TV(String marca){
        this.marca = marca;
        this.smart = true;    
    }

    public boolean ligar(){
        return(this.power = true);
    }


    public boolean ligar(int canal){
        this.canal = canal;
        return (this.power = true);
    }

    public boolean ligar (int canal, String senha){
        if (smart && this.senha.equals(senha)){
            this.canal = canal;
                return (this.power = true);
        } else {
            return false;
        }
    }
}
