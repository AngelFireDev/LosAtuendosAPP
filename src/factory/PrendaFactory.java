package factory;

import modelo.*;

public class PrendaFactory {
    public static Prenda crearPrenda(String tipo) {
        switch (tipo) {
            case "VestidoDama": return new VestidoDama("V001", "Negro", "MarcaX", "M", 100000, true, false, 4);
            case "TrajeCaballero": return new TrajeCaballero("T001", "Negro", "MarcaX", "M", 100000, "Convencional", "Corbata");
            case "Disfraz": return new Disfraz("D001", "Rojo", "MarcaZ", "M", 50000, "Halloween");
            default: throw new IllegalArgumentException("Tipo de prenda no válido");
        }
    }
}

