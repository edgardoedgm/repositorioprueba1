
public class Main {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();
		int sumaEnteros = operaciones.sumar(5, 10);
		double sumaDobles = operaciones.sumar(3.5, 2.7);

		System.out.println("Suma de enteros: " + sumaEnteros);
		System.out.println("Suma de dobles: " + sumaDobles);

	}

}
