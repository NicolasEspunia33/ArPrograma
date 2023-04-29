package proyecto;

import java.time.LocalDate;

public class Libro extends Producto{
	
	private String autor;
	
	public Libro() {	
		super();
		this.autor = "";
	}

	public Libro(String t, int c, double p) {
		super(t, c, p);
		this.autor = "";
	}


	public Libro(String t, LocalDate fp, String e, int c, double p) {
		super(t, fp, e, c, p);
		this.autor = "";
	}
	
	public Libro(String t, LocalDate fp, String e, int c, double p, String a) {
		super(t, fp, e, c, p);
		this.autor = a;
	}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String toString() {
		return super.toString() + "libro " + this.getTitulo();
	}
}