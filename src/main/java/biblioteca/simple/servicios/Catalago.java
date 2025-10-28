package biblioteca.simple.servicios;

import biblioteca.simple.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Catalago {

    private final List<Producto> productos = new ArrayList<>();

    public void alta(Producto p){
        productos.add(p);
    }

    public List<Producto> listar(){return new List}
}
