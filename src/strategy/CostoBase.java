package strategy;

import java.util.List;
import modelo.Prenda;

// Estrategia concreta: costo base
public class CostoBase implements EstrategiaCosto {
    @Override
    public double calcularCosto(List<Prenda> prendas) {
        double costo = 0;
        for (Prenda p : prendas) {
            costo += p.getPrecio(); // suponiendo que Prenda tiene getPrecio()
        }
        return costo;
    }
}
