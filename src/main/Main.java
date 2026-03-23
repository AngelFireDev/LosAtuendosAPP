package main;

import modelo.*;
import dao.*;
import negocio.*;

import java.util.*;

import observer.Observer;
import command.Command;
import command.RegistrarServicioCommand;
import strategy.CostoBase;
import strategy.CostoDescuento;
import templatemethod.AlquilerClienteVIP;
import templatemethod.ProcesoAlquiler;

public class Main {
    public static void main(String[] args) {

        NegocioAlquiler negocio = new NegocioAlquiler();

        Cliente cliente1 = new Cliente(1, "123456789", "Diana", "Calle 10 #5", "3001234567", "diana@correo.com");
        negocio.registrarCliente(cliente1);

        Empleado empleado1 = new Empleado(1, "987654321", "Carlos", "Carrera 20 #15", "3109876543", "carlos@correo.com", "Administrador");
        negocio.registrarEmpleado(empleado1);

        Prenda vestido = new VestidoDama("V001", "Azul", "MarcaY", "S", 80000, true, true, 2);
        Prenda traje = new TrajeCaballero("T001", "Negro", "MarcaX", "M", 100000, "Convencional", "Corbata");
        negocio.registrarPrenda(vestido);
        negocio.registrarPrenda(traje);

        List<Prenda> prendasAlquiler = new ArrayList<>();
        prendasAlquiler.add(vestido);
        prendasAlquiler.add(traje);

        // ------------------- Observer -------------------
        negocio.agregarObservador(cliente1);

        // ------------------- Command -------------------
        Command comando = new RegistrarServicioCommand(
            negocio, "123456789", "987654321", prendasAlquiler, new Date()
        );
        comando.ejecutar();

        // ------------------- Strategy -------------------
        negocio.setEstrategiaCosto(new CostoDescuento());
        double costoConDescuento = negocio.calcularCostoServicio(prendasAlquiler);
        System.out.println("Costo con descuento: " + costoConDescuento);

        negocio.setEstrategiaCosto(new CostoBase());
        double costoBase = negocio.calcularCostoServicio(prendasAlquiler);
        System.out.println("Costo base: " + costoBase);

        // ------------------- Template Method -------------------
        ProcesoAlquiler procesoVIP = new AlquilerClienteVIP();
        negocio.ejecutarProcesoAlquiler(procesoVIP);

        // ------------------- Lógica original -------------------
        ServicioAlquiler servicio = negocio.consultarServicioPorNumero(1);
        System.out.println("Consulta por número: " + servicio);

        List<ServicioAlquiler> serviciosCliente = negocio.consultarServiciosPorCliente("123456789");
        System.out.println("Servicios del cliente Diana: " + serviciosCliente);

        List<Prenda> prendasTallaS = negocio.consultarPrendasPorTalla("S");
        System.out.println("Prendas talla S: " + prendasTallaS);

        Lavanderia lav = new Lavanderia();
        lav.registrarPrenda(vestido, true); 
        lav.registrarPrenda(traje, false);

        System.out.println("Pendientes en lavandería: " + lav.visualizarPendientes());
        System.out.println("Prendas enviadas: " + lav.enviarPrendas(1));
        System.out.println("Pendientes después del envío: " + lav.visualizarPendientes());
    }
}
