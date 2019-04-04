public class Cuadrado {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	public int calcularArea() {
		return lado*lado;
	}
	public int calcularPerimetro() {
		return lado*4;
	}
}
