package factory;

import modelo.*;

public class PrendaFactory {
    public static Prenda crearPrenda(String tipo) {
        switch (tipo) {
            case "VestidoDama": return new VestidoDama();
            case "TrajeCaballero": return new TrajeCaballero("Traje Caballero");
            case "Disfraz": return new Disfraz("Disfraz");
            default: throw new IllegalArgumentException("Tipo de prenda no válido");
        }
    }
}

