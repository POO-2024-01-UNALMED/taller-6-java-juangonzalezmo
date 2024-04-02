package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
public class Fabricante {
	
	String nombre;
	Pais pais;
	int ventas;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	static ArrayList<Integer> listaVentas = new ArrayList<Integer>();
	
	public Fabricante(String nombre, Pais pais){this.nombre= nombre; this.pais = pais; fabricantes.add(this);}

	public String getNombre() {
		return nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	static void agregarVentas() {
		for(Fabricante fabricante : fabricantes) {
			listaVentas.add(fabricante.ventas);
		}
	}
	
	public static Fabricante fabricaMayorVentas() {
		agregarVentas();
		int maximo = Collections.max(listaVentas);
		Fabricante masVendedor = null;
		for (Fabricante fabricante : fabricantes) {
			if (fabricante.ventas == maximo) {
				masVendedor = fabricante;
			}
		}
		return masVendedor;
	}
	
	
	
	
}
