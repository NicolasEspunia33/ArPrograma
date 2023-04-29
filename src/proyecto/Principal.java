package proyecto;

public class Principal {

	public static void main(String[] args) {
		
	//GENERO PRODUCTOS
	Producto p1 = new Libro("Dune" ,12, 530.43);
	Producto p2 = new Revista("Caras", 11, 400.32);
	Producto p3 = new Libro("Don Quijote", 12, 800);
	Producto p4 = new Libro("El Principito", 12, 560.11);
	Producto p5 = new Revista("ParaTi", 11, 200);
		
	//CREO EL CARRITO DE COMPRAS
	CarritoCompra c = new CarritoCompra();
		
	//GENERAR ITEMS
	ItemCarrito i1 = new ItemCarrito(p4, 2, true);
	ItemCarrito i2 = new ItemCarrito(p1, 3, false);
	ItemCarrito i3 = new ItemCarrito(p2, 3, false);
	ItemCarrito i4 = new ItemCarrito(p3, 3, true);
	ItemCarrito i5 = new ItemCarrito(p5, 1, false);
	
	//AGREGO ITEMS AL CARRITO
	c.agregarItem(i1);
	c.agregarItem(i2);
	c.agregarItem(i3);
	c.agregarItem(i4);
	c.agregarItem(i5);
	
	//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
	c.mostrarCarrito();
		
	//ELIMINO ITEMS DEL CARRITO
	c.quitarItem(i4);
	c.quitarItem(i5);
		
	//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
	c.mostrarCarrito();
			
	//MUESTRO EL PRECIO TOTAL DE LOS PRODUCTOS ASOCIADOS AL CARRITO
	System.out.println("El precio total es: " + c.precioFinal());

	}

}