class CGrados
{
	private float gradosC; //grados centigrados
	
	public void CentigradosAsignar(float gC)
	{
		//Establecer el atributo grados centigrados
		gradosC=gC;
	}
	
	public float FahrenheitObtener()
	{
		//Retornar los grados fahrenheit equivalentes a gradosC
		return 9F/5F * gradosC + 32;
	}
	
	public float CentigradosObtener()
	{
		return gradosC; //retornar los grados centigrados
	}
	
}

public class CApGrados {

		// Definicion de constantes
	final static int limInferior = -50;
	final static int limSuperior = 90;
	final static int incremento = 8;
	
	public static void main (String []args)
	{
		//Declaracion de variables
		CGrados grados= new CGrados();
		int gradosCent = limInferior;
		float gradosFahr=0;
		
		while(gradosCent<=limSuperior)
		{
			//Asignar al objeto grados el valor en grados centigrados
			grados.CentigradosAsignar(gradosCent);
			//Obtener del objeto grados los grados Farenheit
			gradosFahr = grados.FahrenheitObtener();
			//Escribir la siguiente linea de la tabla
			System.out.println(gradosCent + " C" + "\t" + gradosFahr + " F");
			//Siguiente valor
			gradosCent += incremento;
		}
	}
}
