package defaultpackage;
public class MainBanco {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("E012R","Pedro");
		Cliente cliente = new Cliente("C2304","Raul",20);
		System.out.println();
		System.out.println("Empleado: ");
		System.out.println(empleado.getCodEmp());
		System.out.println(empleado.getNombre());
		System.out.println();
		System.out.println("Cliente: ");
		System.out.println(cliente.getCodCliente());
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getEdad());
	}
}
