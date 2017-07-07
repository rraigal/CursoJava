
public class CCuenta {
		//Atributos
		private String nombre;
		private String cuenta;
		private double saldo;
		private double tipoDeInteres;
		
		//Constructor sin parametros
		public CCuenta(){
			System.out.println("Objeto CCuenta creado");
			
		}
		
		//Constructor con parametros
		public CCuenta(String nom, String cue, double sal, double tipo){
			asignarNombre(nom);
			asignarCuenta(cue);
			ingreso(sal);
			asignarTipoDeInteres(tipo);
			
		}
		
		//Metodos
		public void asignarNombre(String nom){
			if (nom.length()==0){
				System.out.println("Error: cadena vacia.");
				return;
			}
			nombre=nom;
		}
		
		public String obtenerNombre(){
			return nombre;
		}
		
		public void asignarCuenta(String cue){
			if(cue.length()==0){
				System.out.println("Error: cuenta no valida");;
				return;
			}
			cuenta = cue;
		}
		
		public String obtenerCuenta(){
			return cuenta;
		}
		
		public double estado(){
			return saldo;
			
		}
		
		public void ingreso(double cantidad){
			if(cantidad <0 ){
				System.out.println("Error: cantidad negativa");
				return;
			}
			
			saldo=saldo+cantidad;
			
		}
		
		public void reintegro(double cantidad){
			
			if(saldo-cantidad < 0){
				System.out.println("Error: no dispone de saldo.");
				return;
			}
			
			saldo=saldo-cantidad;
		}
		
		public void asignarTipoDeInteres(double tipo){
			if(tipo<0){
				System.out.println("Error: tipo no valido");
				return;
			}
			tipoDeInteres=tipo;
			
			
		}
		
		public double obtenerTipoDeInteres(){
			return tipoDeInteres;
		}
		
		
		
}	
