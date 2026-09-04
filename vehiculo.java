public class vehiculo {
    
    private String marca;
    private int anioFabricacion;
    private double precioBase;
    private boolean estaDisponible;

    
    public vehiculo(String marca, int anioFabricacion, double precioBase, boolean estaDisponible) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        this.estaDisponible = estaDisponible;
    }
    public vehiculo(String marca, int anioFabricacion, double precioBase) {
        this(marca, anioFabricacion, precioBase, true); 
    }







}