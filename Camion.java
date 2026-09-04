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