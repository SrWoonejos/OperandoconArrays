package cl.dmiranda;

public class Visitas {
	
	private static int promedio(int[] numeros) {
		int promedio = 0;
		for (int i=0; i<numeros.length; i++) {
			promedio += numeros[i];
		}
		return promedio / numeros.length;
	}

	public static void main(String[] args) {
		if(args.length > 0) {
			int[] numeros = new int[args.length];
			for(int i = 0; i<args.length; i++) {
				try {
					numeros[i] = Integer.parseInt(args[i]);
				}catch(Exception e) {
					System.out.println("Error, solo se pueden ingresar numeros");
				}
			}
			System.out.println("Para la entrada anterior, el resultado es " + promedio(numeros) + ".");
		}else {
			System.out.println("Ingrese numeros por parametro");
		}
	}

}
