package proyecto;

import java.util.ArrayList;

public class CarritoCompra {

	private ArrayList<ItemCarrito>items;
	
	public CarritoCompra() {
		this.items = new ArrayList<ItemCarrito>();
	}

	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}
	
	public void mostrarCarrito() {
		System.out.println("---");
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				i.mostrarItem();
			}
		}
		System.out.println("---");
	}
	
	public double precioFinal() {
		double total = 0;
		if(items.isEmpty())
			System.out.println("No hay productos en el carrito");
		else {
			for(ItemCarrito i: items) {
				total = total + i.precio();
			}
		}
		return total;
	}
	
}