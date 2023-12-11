import java.util.Scanner;

public class Princial 
{
	public static void main(String[] args) 
	{
	 int numClient;
	 String nombre;
	 String app;
	 float saldo;	
	 int menu = 0, indice;
	 
	 Scanner lectura = new Scanner(System.in);

		// instancia de clase conimplementacion

		Cliente clienteA = new Cliente();
		Cliente cliente1 = new Cliente(1233, "Fanny", "Torres", 50000);
		Cliente cliente2 = new Cliente(1234, "Daniel", "Aleman", 1000000);
		Cliente cliente3 = new Cliente(1235, "Billy", "Cruz", 79200);
		
		
		implementacion imp = new implementacion();
		
		imp.guardarClien(cliente1);
		imp.guardarClien(cliente2);
		imp.guardarClien(cliente3);
		
		do 
		{
			try
			{
				System.out.println("_______________________________________________");
				System.out.println("MENU BANCOMER BIENVENIDO");
				System.out.println("1. Alta de cliente ");
				System.out.println("2. Consultar saldo ");
				System.out.println("3. Deposito en efectivo ");
				System.out.println("4. Retiro en efectivo ");
				System.out.println("5. Consultar todos ");
				System.out.println("6. Salir ");
				menu = lectura.nextInt();
				switch(menu)
				{
				case 1:
					int cont1 =0;
					do 
					{
						try
						{

							
							System.out.println("Ingrese Numero de Cuenta");
							numClient = lectura.nextInt();
							
							System.out.println("Ingrese nombre");
							lectura.nextLine();
							nombre = lectura.nextLine();
							System.out.println("Ingrese apellido");
							app= lectura.nextLine();
							System.out.println("Ingrese saldo");
							saldo = lectura.nextFloat();
							
							clienteA = new Cliente(numClient, nombre, app, saldo);
							imp.guardarClien(clienteA);
							System.out.println("Se guardo correctamente");
							cont1++;
							
							
						}catch(Exception e)
						{
							System.out.println("Ingrese valores correctos");
							 lectura.nextLine();
						}
						
					}while(cont1<1);
					break;
				case 2:
					
					try {


						System.out.println("\nIngrese el numero de cuenta a del consultar");
						lectura = new Scanner(System.in);
						numClient = lectura.nextInt();
						clienteA.setNumClient(numClient);;
						imp.inNumClien(clienteA);

					} catch (Exception e) {
						System.err.println("Valor equivocado" + e.getMessage());
					}
					break;
				case 3:
					try {
						float dep;
						System.out.println("\nIngrese el numero de cuenta a depositar");
						lectura = new Scanner(System.in);
						numClient = lectura.nextInt();
						
						System.out.println("\nIngrese el monto a depositar");
						lectura = new Scanner(System.in);
						dep = lectura.nextFloat();
						if(dep<=10000)
						{
							
								if (dep % 100 == 0)
								{
									clienteA.setNumClient(numClient);;
									imp.inNumClienA(clienteA, dep);
								
								}else 
								{
									System.out.println("Monto incorrecto solo se aceptan valores 1000, 500, 200, 100 o sus sumas");
								}
						}
						else 
						{
							System.out.println("Excedio el moto maximo");
						}
						
					} catch (Exception e) {
						System.err.println("Valor equivocado" + e.getMessage());
					}
					break;
				case 4:
					try {
						float dep;
						System.out.println("\nIngrese el numero de cuenta a retirar");
						lectura = new Scanner(System.in);
						numClient = lectura.nextInt();
						
						System.out.println("\nIngrese el monto a retirar");
						lectura = new Scanner(System.in);
						dep = lectura.nextFloat();
						if(dep<=10000)
						{
							
							if (dep % 100 == 0)
							{
								clienteA.setNumClient(numClient);;
								imp.inNumClienRet(clienteA, dep);
								System.out.println("Se actualizo correctamnete");
							}else 
							{
								System.out.println("Monto incorrecto solo se aceptan valores 1000, 500, 200, 100 o sus sumas");
							}
					
						}else
						{
							System.out.println("El monto no debe exceder de los 10000");
						}
						
					} catch (Exception e) {
						System.err.println("Valor equivocado" + e.getMessage());
					}
					break;
				case 5:
					System.out.println(imp.cli);

					break;
				}
	
			}catch(Exception e)
			{
				System.out.println("Valores incorrectos");
			}
		}while(menu<6);
	}
}
