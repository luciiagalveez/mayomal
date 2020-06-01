package ufv.dis.mayomal;

import java.io.IOException;
import java.util.ArrayList;

import com.google.zxing.WriterException;

public class Inventario {

	private ArrayList<Producto> productos;
	
	public Inventario() {
		this.productos = new ArrayList<Producto>();
		
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
		
		try {
			GeneradorEAN13.generarEan(p);
		}catch (WriterException | IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void removeProducto(Producto p) {
		this.productos.remove(p);
	}
	
	
	public boolean checkIfExists(Producto p) {
		return this.productos.contains(p);
	}
	
}
