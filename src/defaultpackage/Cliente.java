package defaultpackage;

public class Cliente {
	//Atributo
	private String codCliente;
	private String nombre;
	private Integer edad;
	
	//Constructores
	public Cliente() {
		this("","",0);
	}
	public Cliente(String codCliente ,String nombre, Integer edad) {
		this.codCliente = codCliente;
		this.nombre = nombre;
		this.edad = edad;
	}
	//Metodos
	public String crearCliente(String codCliente,String nombre, Integer edad) {
		this.codCliente = codCliente;
		this.nombre = nombre;
		this.edad = edad;
		return nombre;
	}
	public void verCliente() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(codCliente);
	}
	public String getCodCliente() {
		this.codCliente = codCliente;
		return this.codCliente;
	}
	public String getNombre() {
		this.nombre = nombre;
		return this.nombre;
	}
	public int getEdad() {
		this.edad = edad;
		return this.edad;
	}
}	
