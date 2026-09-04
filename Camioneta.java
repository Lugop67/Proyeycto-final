public class Camioneta extends Vehiculo {
    private String tipoTraccion;
    private long capacidadCargaKg;
    private char categoriaLicencia;
    private boolean tienePlaton;

    public Camioneta(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }

    public Camioneta(String marca, int anioFabricacion, double precioBase, String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion, precioBase);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }

    public Camioneta(String marca, int anioFabricacion, String tipoTraccion, long capacidadCargaKg, char categoriaLicencia, boolean tienePlaton) {
        super(marca, anioFabricacion);
        this.tipoTraccion = tipoTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.categoriaLicencia = categoriaLicencia;
        this.tienePlaton = tienePlaton;
    }
    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public long getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(long capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public char getCategoriaLicencia() {
        return categoriaLicencia;
    }

    public void setCategoriaLicencia(char categoriaLicencia) {
        this.categoriaLicencia = categoriaLicencia;
    }

    public boolean isTienePlaton() {
        return tienePlaton;
    }

    public void setTienePlaton(boolean tienePlaton) {
        this.tienePlaton = tienePlaton;
    }

    @Override
    public String toString() {
        return "CAMIONETA -> " + super.toString() + 
               " | Tracción: " + tipoTraccion + 
               " | Carga: " + capacidadCargaKg + "kg" + 
               " | Licencia: " + categoriaLicencia + 
               " | Platón: " + (tienePlaton ? "Sí" : "No");
    }
}





        
    