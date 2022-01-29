package venancio.dam.String;

public class ToCharArray {

	public static void main(String[] args) {

		String cadena = "QWERTYUIOPASDFGHJKZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		char[] array = cadena.toCharArray();

		for (int i = 0; i < array.length; i++) {
			System.out.println("char[" + i + "] -->" + array[i]);
		}
		
		System.out.println(ordenarAlfabeticamente(cadena));
	}

	public static char[] ordenarAlfabeticamente(String cadena) {

		char[] array = cadena.toCharArray();
		char[] arrayOrdenado = new char [array.length];
		int posicion=0;
		
		for (int num=65; num<=122; num++) {
			for (int i = 0; i < array.length; i++) {
				if (array[i]==num) {
					arrayOrdenado[posicion]=(char)num;
					posicion++;					
				}
			}
		}
		return arrayOrdenado;
	}
}