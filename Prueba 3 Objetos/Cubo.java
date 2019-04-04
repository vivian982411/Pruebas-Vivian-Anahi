public class Cubo extends Cuadrado {

	public Cubo(int lado) {
		super(lado);
	}
	public int calcularVolumen() {
		return this.calcularArea()*this.getLado();
	}
	//El perimetro solo se puede obtener en formas bidimencionales
}
