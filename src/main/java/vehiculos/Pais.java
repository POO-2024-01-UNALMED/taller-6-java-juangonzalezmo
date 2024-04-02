package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
public class Pais {
	
	String nombre;
	int ventas;
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	static ArrayList<Integer> listaVentas = new ArrayList<Integer>();
	public Pais(String nombre){this.nombre= nombre; paises.add(this); }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	static void agregarVentas() {
		for(Pais pais : paises) {
			listaVentas.add(pais.ventas);
		}
	}
	public static Pais paisMasVendedor() {
		agregarVentas();
		int maximo = Collections.max(listaVentas);
		Pais masVendedor = null;
		for (Pais pais : paises) {
			if (pais.ventas == maximo) {
				masVendedor = pais;
			}
		}
		return masVendedor;
	}
}
