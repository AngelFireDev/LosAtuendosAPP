package strategy;

import java.util.List;
import modelo.Prenda;

// Interfaz Strategy
public interface EstrategiaCosto {
    double calcularCosto(List<Prenda> prendas);
}
