package defaultpackage;
import java.util.*;

public class Empleado {
	//Atributos
	private String codEmp;
	private String nombre;
	//Constructores
	public Empleado() {
		this("","");
	}
	public Empleado(String codEmp, String nombre) {
		this.setCodEmp(codEmp);
		this.setNombre(nombre);
	}
	//Metodos
	public void crearEmpleado() {
		Scanner scanner = new Scanner(System.in);
		this.setCodEmp(scanner.next());
		this.setNombre(scanner.next());
	}
	public String getCodEmp() {
		return codEmp;
	}
	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
