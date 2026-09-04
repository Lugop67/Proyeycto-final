public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   CONCESIONARIO DE VEHÍCULOS - INVENTARIO");
        System.out.println("=========================================\n");

        System.out.println("--- VEHÍCULOS GENERALES ---");

        Vehiculo v1 = new Vehiculo(
            "BMW Serie 3", 2024, 180000000.0, true
        );

        Vehiculo v2 = new Vehiculo(
            "Audi A4", 2025
        );
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());

        System.out.println("\n--- VEHÍCULOS ESPECIALIZADOS ---");

        Carro a1 = new Carro(
       "Mazda 3", 2023, 85000000.0, true, 
            "Automática", (byte)4, 450.5f, true
        );
        Carro a2 = new Carro(
            "Renault Logan", 2026, 
            "Manual", (byte)4, 510.0f, true
        );
        //moto
        Motocicleta m1 = new Motocicleta(
            "Honda CB125F", 2022, 6500000.0, true, 
            "Corriente", (short)125, 117.0f, true
        );
        Motocicleta m2 = new Motocicleta(
            "Yamaha MT09", 2024, 55000000.0, 
            "Extra", (short)890, 189.5f, false
        );
        //camioneta
        Camioneta c1 = new Camioneta(
            "Toyota Hilux", 2024, 210000000.0, 
            "4x4", 1000L, 'C', true
        );
        
        Camioneta c2 = new Camioneta(
            "Ford Ranger", 2025, 195000000.0, false, 
            "4x4", 950L, 'C', true
        );
        //camiones
        Camion cam1 = new Camion(
            "Chevrolet FVR", 2023, 320000000.0, true, 
            "Estacas", (byte)2, 12.5, true
        );

        Camion cam2 = new Camion(
            "Kenworth T800", 2025, 
            "Cisterna", (byte)3, 24.0, true
        );







    }