
public class MainBanco {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("t549","tr43",534.5);
		
		System.out.println("Cuenta: ");
		System.out.println(cuenta.getCcc());
		System.out.println(cuenta.getCodCliente());
		System.out.println(cuenta.getSaldo());
	}
}
