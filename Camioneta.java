public class Camioneta extends Vehiculo {
    private String tipoTraccion;
    private long capacidadCargaKg;
    private char categoriaLicencia;
    private boolean tienePlaton;
}
    public Camioneta(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, 
                     String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }

    public Camioneta(String marca, int anioFabricacion, double precioBase, 
                     String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion, precioBase);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }

    public Camioneta(String marca, int anioFabricacion, 
                     String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }
    
        
    