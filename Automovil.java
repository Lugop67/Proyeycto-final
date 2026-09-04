public class Automovil extends Vehiculo {
    
    private String tipoTransmision;
    private byte numeroPuertas;
    private float capacidadBaulLitros;
    private boolean esSedan;

public Automovil(String marca, int anioFabricacion, double precioBase, boolean estaDisponible, 
                     String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion, precioBase, estaDisponible);
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;
    }
public Automovil(String marca, int anioFabricacion, double precioBase, 
                     String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion, precioBase); 
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;
    }

    public Automovil(String marca, int anioFabricacion, 
                     String tipoTransmision, byte numeroPuertas, float capacidadBaulLitros, boolean esSedan) {
        super(marca, anioFabricacion); 
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
        this.capacidadBaulLitros = capacidadBaulLitros;
        this.esSedan = esSedan;


  }   
}