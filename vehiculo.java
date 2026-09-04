public class Vehiculo {
    
    private String marca;
    private int anioFabricacion;
    private double precioBase;
    private boolean estaDisponible;

    
    public Vehiculo(String marca, int anioFabricacion, double precioBase, boolean estaDisponible) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        this.estaDisponible = estaDisponible;
    }
    public Vehiculo(String marca, int anioFabricacion, double precioBase) {
        this(marca, anioFabricacion, precioBase, true); 
    }

    public Vehiculo(String marca, int anioFabricacion) {
        this(marca, anioFabricacion, 0.0, false);
    }
    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }

    public int getAnioFabricacion() { 
        return anioFabricacion; 
    }
    
    public void setAnioFabricacion(int anioFabricacion) { 
        this.anioFabricacion = anioFabricacion; 
    }

    public double getPrecioBase() { 
        return precioBase; 
    }
    
    public void setPrecioBase(double precioBase) { 
        this.precioBase = precioBase; 
    }

    public boolean isEstaDisponible() { 
        return estaDisponible; 
    }
    
    public void setEstaDisponible(boolean estaDisponible) { 
        this.estaDisponible = estaDisponible; 
    }
@Override
    public String toString() {
        return "Marca: " + marca + 
               " | Año: " + anioFabricacion + 
               " | Precio: $" + (long)precioBase + " COP" + 
               " | Disponible: " + (estaDisponible ? "Sí" : "No");
    }
}
