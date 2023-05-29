package cl.dmiranda;

public class MultiplosDeTres {

	private static int promedio(int[] numeros) {
		int promedio = 0;
		for (int i=0; i<numeros.length; i++) {
			promedio += numeros[i];
		}
		return promedio / numeros.length;
	}

	private static int suma(int[] numeros) {
		int sum = 0;
		for (int i=0; i<numeros.length; i++) {
			sum += numeros[i];
		}
		return sum;
	}
	
	private static int[] mulDeTres(int[] numeros) {
		int multiplos[];
		int cont = 0;
		for (int i=0; i<numeros.length; i++) {
			if ( numeros[i] % 3 == 0 ) {
				cont += 1;
			}
		}
		multiplos = new int[cont];
		cont = 0;
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i] % 3 == 0 ) {
				multiplos[cont] = numeros[i];
				cont += 1;
			}
		}
		return multiplos;
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
			System.out.println(suma(mulDeTres(numeros)));
			System.out.println(promedio(mulDeTres(numeros)));
		}else {
			System.out.println("Ingrese numeros por parametro");
		}
	}

}
