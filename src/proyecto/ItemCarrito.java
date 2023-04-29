package proyecto;

public class ItemCarrito {
	
	Producto producto;
	int cantidad;
	boolean copiaFisica;
	
	public double precio() {
		if (producto instanceof Libro ) {
			if(copiaFisica == true ) {
				return producto.getPrecio()*1.18*cantidad;
			} else return producto.getPrecio()*1.08*cantidad;
		} else {
			if(copiaFisica == true ) {
				return producto.getPrecio()*1.22*cantidad;
			}else return producto.getPrecio()*1.12*cantidad;
		} 
	}
		
	public ItemCarrito(Producto p, int cant, boolean cf) {
		this.producto = p;
		this.cantidad = cant;
		this.copiaFisica = cf;
	}
		
	public void mostrarItem() {
		System.out.println("Producto: " + producto.getTitulo() +
		" - codigo: " + producto.getCodigo() + " - precio final: " + precio());
	}
		
}
