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
    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public boolean isIncluyeCascoXtrong() {
        return incluyeCascoXtrong;
    }

    public void setIncluyeCascoXtrong(boolean incluyeCascoXtrong) {
        this.incluyeCascoXtrong = incluyeCascoXtrong;
    }

    @Override
    public String toString() {
        return "MOTOCICLETA -> " + super.toString() + 
               " | Gasolina: " + tipoGasolina + 
               " | Cilindraje: " + cilindraje + "cc" + 
               " | Peso: " + pesoKg + "kg" + 
               " | Casco Xtrong: " + (incluyeCascoXtrong ? "Sí" : "No");
    }
}
