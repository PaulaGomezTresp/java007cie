package paquete1;

public class Monitor {
	private String marca;
	private double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Monitor(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}
}
