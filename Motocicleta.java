public class Motocicleta extends Vehiculo {
    
    private String tipoGasolina; 
    private short cilindraje;
    private float pesoKg;
    private boolean incluyeCascoXtrong;

    public Motocicleta(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, String tipoGasolina, short cilindraje, float pesoKg, boolean incluyeCascoXtrong) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoGasolina = tipoGasolina;
        this.cilindraje = cilindraje;
        this.pesoKg = pesoKg;
        this.incluyeCascoXtrong = incluyeCascoXtrong;
    }

    public Motocicleta(String marca, int anioFabricacion, double precioBase, String tipoGasolina, short cilindraje, float pesoKg, boolean incluyeCascoXtrong) {
        super(marca, anioFabricacion, precioBase);
        this.tipoGasolina = tipoGasolina;
        this.cilindraje = cilindraje;
        this.pesoKg = pesoKg;
        this.incluyeCascoXtrong = incluyeCascoXtrong;
    }


    public Motocicleta(String marca, int anioFabricacion, String tipoGasolina, short cilindraje, float pesoKg, boolean incluyeCascoXtrong) {
        super(marca, anioFabricacion);
        this.tipoGasolina = tipoGasolina;
        this.cilindraje = cilindraje;
        this.pesoKg = pesoKg;
        this.incluyeCascoXtrong = incluyeCascoXtrong;
    }
