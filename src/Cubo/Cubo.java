package Cubo;

//import java.util.Scanner;

public class Cubo {
    // Atributos
    // ancho int
    // alto int
    // Profundo int

    // Se definen los atributos que se utilizaran en el programa
    public int ancho;
    public int alto;
    public int profundo;
    // public int vol;

    // Constructor cubo vacio+
    public Cubo() {
        System.out.println("Ejecutando Contructor");
    }
    //Se utiliza para crear el cubo

    // Contructor Cubo con los tres atributos
    public Cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        
    }

    // Método vacio que se utilizara para la realizacion de la operacion
    public void resultadoCubo() {
                
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Profundo: " + profundo);
        int vol = this.alto * this.ancho * this.profundo;

        System.out.println("Resultado Volumen: " + vol);

    }

}
