import java.util.Scanner;

public class Objetos {

	public static void main(String[] args) {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa el tama�o del lado: ");
		int lado=s.nextInt();
		Cubo cubo=new Cubo(lado);
		do {
			System.out.println("Selecciona una opci�n:\n"
					+ "1.-Mostrar tama�o del lado\n"
					+ "2.-Mostrar perimetro\n"
					+ "3.-Mostrar �rea\n"
					+ "4.-Mostrar volumen\n"
					+ "5.-Cancelar\n"
					+ "6.-Salir");
			opcion=s.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("El tama�o del lado es: "+cubo.getLado());
				break;
			case 2:
				System.out.println("El tama�o del lado es: "+cubo.getLado()+" El perimetro es: "+cubo.calcularPerimetro());
				break;
			case 3:
				System.out.println("El tama�o del lado es: "+cubo.getLado()+" El area es: "+cubo.calcularArea());
				break;
			case 4:
				System.out.println("El tama�o del lado es: "+cubo.getLado()+" El volumen es: "+cubo.calcularVolumen());
				break;
			case 5:
				System.out.println("Ingresa el  nuevo tama�o del lado: ");
				lado=s.nextInt();
				cubo=new Cubo(lado);
				break;
			case 6:
				System.out.println("Bye :)");
				break;

			default:
				break;
			}
			
		} while (opcion!=6);
		s.close();
	}
}
