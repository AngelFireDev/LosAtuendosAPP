package observer;

public class Cliente implements Observer {
    public void actualizar(String mensaje) {
        System.out.println("Cliente notificado: " + mensaje);
    }
}
