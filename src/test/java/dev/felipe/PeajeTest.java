package dev.felipe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PeajeTest {

    @Test
    public void testRegistrarCoche() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad A");
        Vehiculo coche = new Coche("ABC123");

        peaje.registrarVehiculo(coche);
        assertEquals(100.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testRegistrarMoto() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad A");
        Vehiculo moto = new Moto("XYZ789");

        peaje.registrarVehiculo(moto);
        assertEquals(50.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testRegistrarCamion() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad A");
        Vehiculo camion = new Camion("LMN456", 4);

        peaje.registrarVehiculo(camion);
        assertEquals(200.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testValorTotalRecolectadoConVariosVehiculos() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad A");
        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("XYZ789");
        Vehiculo camion = new Camion("LMN456", 3);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);

        assertEquals(300.0, peaje.getValorTotalRecolectado());
    }

    @Test
    public void testImprimirResumen() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad A");
        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("XYZ789");

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);

        assertEquals(150.0, peaje.getValorTotalRecolectado());
        
        peaje.imprimirResumen(); 
    }
}
