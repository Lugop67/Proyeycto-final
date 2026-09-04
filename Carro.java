public class Carro extends Vehiculo {
    
    private String tipoTransmision;
    private byte numeroPuertas;
    private float capacidadBaulLitros;
    private boolean esSedan;

public Carro(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;
    }
public Carro(String marca, int anioFabricacion, double precioBase,String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion, precioBase); 
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;
    }

    public Carro(String marca, int anioFabricacion, String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion); 
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;


    } 
    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public byte getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(byte numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public float getCapacidadBaulLitros() {
        return capacidadBaulLitros;
    }

    public void setCapacidadBaulLitros(float capacidadBaulLitros) {
        this.capacidadBaulLitros = capacidadBaulLitros;
    }

    public boolean isEsSedan() {
        return esSedan;
    }

    public void setEsSedan(boolean esSedan) {
        this.esSedan = esSedan;
    }

    @Override
    public String toString() {
        return "AUTOMÓVIL -> " + super.toString() + 
               " | Transmisión: " + tipoTransmision + 
               " | Puertas: " + numeroPuertas + 
               " | Baúl: " + capacidadBaulLitros + "L" + 
               " | Sedán: " + (esSedan ? "Sí" : "No");
    }
}  
