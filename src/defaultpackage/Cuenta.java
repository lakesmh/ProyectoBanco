
public class Cuenta {
	

	//Atributo
	private String ccc;
	
	private String codCliente;
	
	private double saldo;

	
	//Getters
	public String getCcc() {
		return this.ccc;
	}
	public String getCodCliente() {
		return this.codCliente;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	
	//Constructor
	public Cuenta() {
		this("", "", 0.0);
	}
	
	public Cuenta(String ccc, String codCliente, double saldo) {
		this.ccc = ccc;
		this.codCliente = codCliente;
		this.saldo = saldo;
	}
	
	//Métodos
	public void ingresar(double ingreso) {
		saldo = saldo + ingreso;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double sacar) {
		this.saldo = saldo - sacar;
	}
	
	public void verCuenta() {
		System.out.print(codCliente);
		System.out.print(saldo);
	}
	
	
}
