import java.util.*;

public class implementacion implements iMetodos

{
	List <Cliente> cli = new ArrayList<Cliente>();
	
	@Override
	public void depoReti(int numC, Cliente obj) 
	{

		boolean bandera =false;
		// Buscamos nombre
		for (int i = 0; i < cli.size(); i++)
		{
			if (cli.get(i).getNumClient() == obj.getNumClient()) {
	            cli.set(i, obj);
	            bandera = true;
	            break; 
	        }
		}
		if(!bandera)
		{
			System.out.println("No existe");
		}
	}
	
	
	@Override
	public Object consultar(int indice) {
		// TODO Auto-generated method stub
		return 	 cli.get(indice);
	}



	@Override
	public void guardarClien(Cliente obj)
	{
		// TODO Auto-generated method stub
		cli.add(obj);	
	}
	
	
	public void inNumClien(Cliente obj)
	{
		boolean bandera =false;
		// Buscamos nombre
		for (int i = 0; i < cli.size(); i++)
		{
			  if (cli.get(i).getNumClient() == obj.getNumClient())
			{
		       obj =cli.get(i);
		       bandera=true;
		       
			}	
		}
		if(!bandera)
		{
			System.out.println("No existe");
		}else
		{
	     System.out.println("Hola "+obj.getNombre()+"\nSu saldo es de: " + obj.getSaldo());
		}	
	
	}	
	
	
	public void inNumClienA(Cliente obj, float pre)
	{
		boolean bandera =false;
		// Buscamos nombre
		for (int i = 0; i < cli.size(); i++)
		{
			  
			  if (cli.get(i).getNumClient() == obj.getNumClient())
			{
				  bandera = true;	
				  cli.get(i).setSaldo(cli.get(i).getSaldo() + pre);
		            obj = cli.get(i);
			}	
		}
		if(!bandera)
		{
			System.out.println("No existe cuenta");
		}else
		{
	     System.out.println("Hola "+obj.getNombre()+"\nSu saldo es de: " + (obj.getSaldo()));
		}	
	
	}
	
	public void inNumClienRet(Cliente obj, float pre)
	{
		boolean bandera =false;
		// Buscamos nombre
		for (int i = 0; i < cli.size(); i++)
		{
			  if (cli.get(i).getNumClient() == obj.getNumClient())
			{
				   bandera = true;
				  if (pre <= cli.get(i).getSaldo()) {
				  cli.get(i).setSaldo(cli.get(i).getSaldo() - pre);
		            obj = cli.get(i);
				  }else 
				  {
					  System.out.println("No cuenta con saldo suficente");
				  }
			}	
		}
		if(!bandera)
		{
			System.out.println("No existe cuenta");
		}else
		{
	     System.out.println("Hola "+obj.getNombre()+"\nSu saldo es de: " + (obj.getSaldo()));
		}	
	
	}


}
