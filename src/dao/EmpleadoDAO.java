package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

public class EmpleadoDAO {
    private List<Empleado> empleados = new ArrayList<>();

    public void registrar(Empleado e) {
        empleados.add(e);
    }

    public Empleado consultarPorId(int id) {
        for (Empleado e : empleados) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public List<Empleado> listarTodos() {
        return empleados;
    }
}
