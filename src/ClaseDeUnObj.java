import java.io.*;

class ClaseDeUnObj {
	
	public static void main (String [] args )
	{
		int n;
		try
		{
			System.out.print("Dato: ");
			n = System.in.read(); //leer un caracter desde elt eclado
			System.out.println((char)n); //visualizar el caracter
			
			//investigamos
			
			Class ObjetoClass; //Objeto class?
			
			ObjetoClass = System.in.getClass();
			System.out.println("Clase de in: " + ObjetoClass.getName());
			ObjetoClass = System.out.getClass();
			System.out.println("Clase de out: " + ObjetoClass.getName());
			ObjetoClass = System.err.getClass();
			System.out.println("CLase de err: " + ObjetoClass.getName());
			
		}
		
		catch(IOException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}

}
