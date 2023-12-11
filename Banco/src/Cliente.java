
public class Cliente 
{
	private int numClient;
	private String nombre;
	private String app;
	private float saldo;
	
	public Cliente() 
	{
	}

	public Cliente(int numClient, String nombre, String app, float saldo) {
		this.numClient = numClient;
		this.nombre = nombre;
		this.app = app;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [numClient=" + numClient + ", nombre=" + nombre + ", app=" + app + ", saldo=" + saldo + "]\n";
	}

	public int getNumClient() {
		return numClient;
	}

	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
}
