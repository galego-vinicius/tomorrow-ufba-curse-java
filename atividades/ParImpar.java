package atividades;

public class ParImpar {
    private boolean par;

    public ParImpar(boolean par) {
        this.par = par;
    }

    public void imprimirNumeros(int limite, int tipoLaco) {
        if (tipoLaco < 1 || tipoLaco > 3) {
            System.out.println("Opção inválida para o tipo de laço.");
            return;
        }

        if (par) {
            System.out.println("Números pares:");
            if (tipoLaco == 1) {
                for (int i = 0; i <= limite; i += 2) {
                    System.out.println(i);
                }
            } else if (tipoLaco == 2) {
                int i = 0;
                while (i <= limite) {
                    System.out.println(i);
                    i += 2;
                }
            } else if (tipoLaco == 3) {
                int i = 0;
                do {
                    System.out.println(i);
                    i += 2;
                } while (i <= limite);
            }
        } else {
            System.out.println("Números ímpares:");
            if (tipoLaco == 1) {
                for (int i = 1; i <= limite; i += 2) {
                    System.out.println(i);
                }
            } else if (tipoLaco == 2) {
                int i = 1;
                while (i <= limite) {
                    System.out.println(i);
                    i += 2;
                }
            } else if (tipoLaco == 3) {
                int i = 1;
                do {
                    System.out.println(i);
                    i += 2;
                } while (i <= limite);
            }
        }
    }
}
