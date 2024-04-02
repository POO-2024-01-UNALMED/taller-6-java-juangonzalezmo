package vehiculos;

public class Vehiculo {
	
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	double precio;
	double peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		fabricante.pais.ventas++;
		fabricante.ventas++;
	}

	public String getPlaca() {
		return placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public double getPeso() {
		return peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPortipo() {
		
		String cadena = "Automoviles: "+ Automovil.automoviles+" \nCamionetas: "+ Camioneta.camionetas+" \nCamiones: "+Camion.camiones;
		return cadena;
	}
	
}
