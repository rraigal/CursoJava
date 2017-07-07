
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCuenta cuenta01 = new CCuenta();
		cuenta01.asignarNombre("Raimon");
		cuenta01.asignarCuenta("Bankia");
		cuenta01.asignarTipoDeInteres(5.0);
		
		cuenta01.ingreso(18000);
		cuenta01.reintegro(3000);
		
		System.out.println(cuenta01.obtenerNombre());
		System.out.println(cuenta01.obtenerCuenta());
		System.out.println(cuenta01.obtenerTipoDeInteres());
		System.out.println(cuenta01.estado());
		
		
		CCuenta cuenta02=new CCuenta("Mar", "EVO", 22000, 4.0);
		
		System.out.println(cuenta02.obtenerNombre());
		System.out.println(cuenta02.obtenerCuenta());
		System.out.println(cuenta02.obtenerTipoDeInteres());
		System.out.println(cuenta02.estado());
		
		
	}

}
