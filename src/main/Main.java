package main;

import modelo.*;
import composite.Pieza;
import dao.ClienteDAO;
import factory.PrendaFactory;

public class Main {
    public static void main(String[] args) {

        // Factory Method
        System.out.println("Patron de Diseño Factory Method");

        Prenda vestidoDama = PrendaFactory.crearPrenda("VestidoDama");
        Prenda trajeCaballero = PrendaFactory.crearPrenda("TrajeCaballero");
        Prenda disfraz = PrendaFactory.crearPrenda("Disfraz");

        vestidoDama.mostrarInfo();
        trajeCaballero.mostrarInfo();
        disfraz.mostrarInfo();

        // Composite
        System.out.println("Patron de Diseño Composite");

        VestidoDama vestido = new VestidoDama();
        vestido.agregarPieza(new Pieza("Botones"));
        vestido.agregarPieza(new Pieza("Encaje"));
        vestido.agregarPieza(new Pieza("Escote"));
        vestido.agregarPieza(new Pieza("Cintura"));
        vestido.agregarPieza(new Pieza("Decoración"));

        vestido.mostrarInfo();

        // Singleton y DAO
        System.out.println("Patron de Diseño Singleton");

        ClienteDAO cliente = ClienteDAO.getInstancia();
        cliente.agregarCliente(new Cliente(1, "Diana", "di.baron@ucompensar.edu.co"));
        cliente.agregarCliente(new Cliente(2, "Oscar", "oscar@ucompensar.edu.co"));

        System.out.println("Clientes existentes en BD");
        for (Cliente c : cliente.listarClientes()) {
            System.out.println(c);
        }

        Cliente busqueda = cliente.buscarClientePorId(2);
        System.out.println("Cliente encontrado" + busqueda);

    }
}
