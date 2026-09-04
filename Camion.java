public class Camion extends Vehiculo {
    
    private String tipoCarroceria;
    private byte numeroEjes;
    private double capacidadCargaToneladas;
    private boolean tieneCamaron;

    public Camion(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, String tipoCarroceria, byte numeroEjes, double capacidadCargaToneladas, boolean tieneCamaron) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoCarroceria = tipoCarroceria;
        this.numeroEjes = numeroEjes;
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.tieneCamaron = tieneCamaron;
    }
    public Camion(String marca, int anioFabricacion, double precioBase, String tipoCarroceria, byte numeroEjes, double capacidadCargaToneladas, boolean tieneCamaron) {
        super(marca, anioFabricacion, precioBase);
        this.tipoCarroceria = tipoCarroceria;
        this.numeroEjes = numeroEjes;
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.tieneCamaron = tieneCamaron;
    }
    public Camion(String marca, int anioFabricacion, String tipoCarroceria, byte numeroEjes, double capacidadCargaToneladas, boolean tieneCamaron) {
        super(marca, anioFabricacion);
        this.tipoCarroceria = tipoCarroceria;
        this.numeroEjes = numeroEjes;
        this.capacidadCargaToneladas = capacidadCargaToneladas;
        this.tieneCamaron = tieneCamaron;
    }
    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public byte getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(byte numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCargaToneladas() {
        return capacidadCargaToneladas;
    }

    public void setCapacidadCargaToneladas(double capacidadCargaToneladas) {
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    public boolean isTieneCamaron() {
        return tieneCamaron;
    }

    public void setTieneCamaron(boolean tieneCamaron) {
        this.tieneCamaron = tieneCamaron;
    }

    @Override
    public String toString() {
        return "CAMIÓN -> " + super.toString() + 
               " | Carrocería: " + tipoCarroceria + 
               " | Ejes: " + numeroEjes + 
               " | Carga: " + capacidadCargaToneladas + " Tn" + 
               " | Camarote: " + (tieneCamaron ? "Sí" : "No");
    }
}