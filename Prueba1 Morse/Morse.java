import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa una palabrao frase: ");
		String palabra=s.nextLine();
		s.close();
		palabra=palabra.toLowerCase();
		String traduccion="";
		if (palabra.charAt(0)=='.'||palabra.charAt(0)=='-') {
			//de morse a texto
			String[] arraypalabras=palabra.split("   ");
			for (int i = 0; i < arraypalabras.length; i++) {
				String p=arraypalabras[i];
				String[] arrayletras=p.split(" ");
				for (int j = 0; j < arrayletras.length; j++) {
					traduccion+=convertirLetras(arrayletras[j]);
				}
				traduccion+=" ";
			}
			
			System.out.println("Conversion de Morse a texto : "+traduccion);
		}else {
			//de texto a morse
			for (int i = 0; i < palabra.length(); i++) {
				traduccion+=convertirMorse(palabra.charAt(i))+" ";
			}
			System.out.println("Conversion de Texto a Morse: "+traduccion);
		}
		
	}
	public static String convertirMorse(char letra) {
		String cadena="";
		switch (letra) {
		case 'a':
			cadena=".-";
			break;
		case 'b':
			cadena="-...";
			break;
		case 'c':
			cadena="-.-.";
			break;
		case 'd':
			cadena="-..";
			break;
		case 'e':
			cadena=".";
			break;
		case 'f':
			cadena="..-.";
			break;
		case 'g':
			cadena="--.";
			break;
		case 'h':
			cadena="....";
			break;
		case 'i':
			cadena="..";
			break;
		case 'j':
			cadena=".---";
			break;
		case 'k':
			cadena="-.-";
			break;
		case 'l':
			cadena=".-..";
			break;
		case 'm':
			cadena="--";
			break;
		case 'n':
			cadena="-.";
			break;
		case 'o':
			cadena="---";
			break;
		case 'p':
			cadena=".--.";
			break;
		case 'q':
			cadena="--.-";
			break;
		case 'r':
			cadena=".-.";
			break;
		case 's':
			cadena="...";
			break;
		case 't':
			cadena="-";
			break;
		case 'u':
			cadena="..-";
			break;
		case 'v':
			cadena="...-";
			break;
		case 'w':
			cadena=".--";
			break;
		case 'x':
			cadena="-..-";
			break;
			
		case 'y':
			cadena="-.--";
			break;
		case 'z':
			cadena="--..";
			break;
		case '1':
			cadena=".----";
			break;
		case '2':
			cadena="..---";
			break;
		case '3':
			cadena="...--";
			break;
		case '4':
			cadena="....-";
			break;
		case '5':
			cadena=".....";
			break;
		case '6':
			cadena="-....";
			break;
		case '7':
			cadena="--...";
			break;
		case '8':
			cadena="---..";
			break;
		case '9':
			cadena="----.";
			break;
		case '0':
			cadena="-----";
			break;
		case ' ':
			cadena="   ";
			break;
		default:
			cadena="ERROR";
			break;
		}
		return cadena;
	}
	public static String convertirLetras(String letra) {
		String cadena="";
		switch (letra) {
		case ".-":
			cadena="a";
			break;
		case "-...":
			cadena="b";
			break;
		case "-.-.":
			cadena="c";
			break;
		case "-..":
			cadena="d";
			break;
		case ".":
			cadena="e";
			break;
		case "..-.":
			cadena="f";
			break;
		case "--.":
			cadena="g";
			break;
		case "....":
			cadena="h";
			break;
		case "..":
			cadena="i";
			break;
		case ".---":
			cadena="j";
			break;
		case "-.-":
			cadena="k";
			break;
		case ".-..":
			cadena="l";
			break;
		case "--":
			cadena="m";
			break;
		case "-.":
			cadena="n";
			break;
		case "---":
			cadena="o";
			break;
		case ".--.":
			cadena="p";
			break;
		case "--.-":
			cadena="q";
			break;
		case ".-.":
			cadena="r";
			break;
		case "...":
			cadena="s";
			break;
		case "-":
			cadena="t";
			break;
		case "..-":
			cadena="u";
			break;
		case "...-":
			cadena="v";
			break;
		case ".--":
			cadena="w";
			break;
		case "-..-":
			cadena="x";
			break;
		case "-.--":
			cadena="y";
			break;
		case "--..":
			cadena="z";
			break;
		case ".----":
			cadena="1";
			break;
		case "..---":
			cadena="2";
			break;
		case "...--":
			cadena="3";
			break;
		case "....-":
			cadena="4";
			break;
		case ".....":
			cadena="5";
			break;
		case "-....":
			cadena="6";
			break;
		case "--...":
			cadena="7";
			break;
		case "---..":
			cadena="8";
			break;
		case "----.":
			cadena="9";
			break;
		case "-----":
			cadena="0";
			break;
		case " ":
			cadena="   ";
			break;
			
		default:
			cadena="ERROR";
			break;
		}
		return cadena;
	}
}
