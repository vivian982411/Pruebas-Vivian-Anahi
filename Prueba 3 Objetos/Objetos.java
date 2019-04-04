import java.util.Scanner;

public class Objetos {

	public static void main(String[] args) {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa el tamaño del lado: ");
		int lado=s.nextInt();
		Cubo cubo=new Cubo(lado);
		do {
			System.out.println("Selecciona una opción:\n"
					+ "1.-Mostrar tamaño del lado\n"
					+ "2.-Mostrar perimetro\n"
					+ "3.-Mostrar área\n"
					+ "4.-Mostrar volumen\n"
					+ "5.-Cancelar\n"
					+ "6.-Salir");
			opcion=s.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("El tamaño del lado es: "+cubo.getLado());
				break;
			case 2:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El perimetro es: "+cubo.calcularPerimetro());
				break;
			case 3:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El area es: "+cubo.calcularArea());
				break;
			case 4:
				System.out.println("El tamaño del lado es: "+cubo.getLado()+" El volumen es: "+cubo.calcularVolumen());
				break;
			case 5:
				System.out.println("Ingresa el  nuevo tamaño del lado: ");
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
