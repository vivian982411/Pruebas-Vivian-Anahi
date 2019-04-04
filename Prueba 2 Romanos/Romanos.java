import java.util.Scanner;

public class Romanos {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int numero=s.nextInt();
		s.close();
		if (numero<=1000) {
			String cadena=convertir(numero);
			System.out.println("Numero romano: "+cadena);
		}else {
			System.out.println("Numero Invalido, Introduce un numero menor o igual a 1000");
		}
	}
	public static String convertir(int numero) {
		int unidad=numero%10;
		int decena=numero/10 %10;
		int centena=numero/100 %10;
		int millar= numero /1000;
		String cadena="";
		if (millar==1) {
			cadena+="M";
		}
		if (centena==9) {
			cadena+="CM";
		}else if (centena>=5) {
			cadena+="D";
			for (int i = 6; i < centena; i++) {
				cadena+="C";
			}
		}else if (centena==4) {
			cadena+="CD";
		} else {
			for (int j = 0; j < centena; j++) {
				cadena+="C";
			}
		}
		if (decena==9) {
			cadena+="XC";
		}else if (decena>=5) {
			cadena+="L";
			for (int i = 6; i < decena; i++) {
				cadena+="X";
			}
		}else if (decena==4) {
			cadena+="XL";
		} else {
			for (int j = 0; j < decena; j++) {
				cadena+="X";
			}
		}
		if (unidad==9) {
			cadena+="IX";
		}else if (unidad>=5) {
			cadena+="V";
			for (int i = 6; i < centena; i++) {
				cadena+="I";
			}
		}else if (unidad==4) {
			cadena+="IV";
		} else {
			for (int j = 0; j < unidad; j++) {
				cadena+="I";
			}
		}
		return cadena;
	}
}
