package cl.dmiranda;

public class SmartWatch {

	private static int promedio(int[] numeros) {
		int promedio = 0;
		for (int i=0; i<numeros.length; i++) {
			promedio += numeros[i];
		}
		return promedio / numeros.length;
	}
	
	private static int[] clearSteps(int[] pasos) {
		int clearedSteps[];
		int cont = 1;
		for (int i=0; i<pasos.length; i++) {
			if (pasos[i] > 200 && pasos[i] < 100000 ) {
				cont += 1;
			}
		}
		clearedSteps = new int[cont];
		for (int i=0; i<pasos.length; i++) {
			if (pasos[i] > 200 && pasos[i] < 100000 ) {
				clearedSteps[i] = pasos[i];
			}
		}
		return clearedSteps;
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
			System.out.println(promedio(clearSteps(numeros)));
		}else {
			System.out.println("Ingrese numeros por parametro");
		}
	}

}
