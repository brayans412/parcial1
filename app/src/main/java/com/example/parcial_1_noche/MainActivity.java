package com.example.parcial_1_noche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

public class Main {
    public static void main(String[] args) {
        int numero = 64; // Puedes cambiar este número por el que desees
        dividirConstantemente(numero);
    }

    public static void dividirConstantemente(int numero) {
        if (numero <= 0) {
            System.out.println("El número ingresado debe ser mayor que 0.");
            return;
        }
        System.out.println(numero);
        if (numero == 1) {
            return;
        } else {
            dividirConstantemente(numero / 2);
        }
    }
}

interface vehiculo {
    void arrancar();
    double frenar();
}


abstract class carro implements vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public carro(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public void arrancar() {
        System.out.println("El vehiculo: ");
    }
}


class auto extends carro {
    private int velocidad;


    public auto(String marca, String modelo, int año, int velocidad) {
        super(marca, modelo);
        this.velocidad = velocidad;
    }


    public double frenar() {
        return velocidad * 1.2;
    }
}


class camion extends carro {
    private int velocidad;


    public camion(String marca, String modelo, int año, int capacidad) {
        super(marca, modelo);
        this.capacidad = capacidad;
    }


    public double calcularSalario() {
        return capacidad * 100;
    }
}

public class GestionAutos {
    public static void main(String[] args) {

        vehiculo auto = new auto("Chevrolet", "Camaro", 2024, 100);
        vehiculo camion = new camion("Chevrolet", "Kodiac", 2000, 10);


        auto.arrancar();
        System.out.println("El vehiculo " + auto.frenar());

        camion.arrancar();
        System.out.println("El vehiculo " + camion.frenar());
    }
}