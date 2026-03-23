package strategy;

import java.util.List;
import modelo.Prenda;

public class CostoDescuento implements EstrategiaCosto {
    @Override
    public double calcularCosto(List<Prenda> prendas) {
        double costo = 0;
        for (Prenda p : prendas) {
            costo += p.getPrecio();
        }
        return costo * 0.9; 
    }
}
