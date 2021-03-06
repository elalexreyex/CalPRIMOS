import java.util.Scanner;

public class CalPRIMOS {
	public static void main(String[] args) {
		int inicio, fin, contador = 0;
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Escribe el numero donde quieres partir:");
                inicio = sc.nextInt();
                System.out.println("Escribe el numero donde sera el final:");
                fin = sc.nextInt();
                for (int x = inicio; x <= fin; x++) {
                    if (esPrimo(x)) {
                        contador++;
                        System.out.print(String.valueOf(x) + ",");
                    }
                }
                System.out.printf("\nTotal: %d", contador);
            }
	}

	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		
		return true;
		
	}
}
