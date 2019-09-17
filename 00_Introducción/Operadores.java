class Operadores {
public static void main (String[] argumentos){
	
	System.out.println("Has puesto " + argumentos);
	System.out.println( 5!= 5 ? "Pues si" : "pues no");
	
	if("aa".equals(argumentos[0]))
		System.out.println("Quieres dos AA");	
	else
		System.out.println("Quieres otra cosa");
	
	byte result = 113 & 199;
	System.out.println("AND binario = " + result);
	

}
}
