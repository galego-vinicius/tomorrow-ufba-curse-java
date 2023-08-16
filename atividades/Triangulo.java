package atividades;
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

// CONSTRUTORES

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

// GETTERS --> Consultar AND SETTERS

    public double getLado1(){
        return this.lado1;
    }
        public double getLado2(){
        return this.lado2;
    }
        public double getLado3(){
        return this.lado3;
    }

        public void setLado1(double lado1){
            this.lado1 = lado1;
    }
        public void setLado2(double lado2){
            this.lado2 = lado2;
    }
        public void setLado3(double lado3){
            this.lado3 = lado3;
    }

    public boolean etriangulo(){
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3){
            return true;
        }
        return false;
    }
}


