 class HolaMundo {
	 
	 public static void main (String[] args) {
		 
		 System.out.println("Hola Mundo");
		 String nombre = "David";	 
		 System.out.println("Hola " + nombre + "");
		 byte unByte = 127;
		 System.out.println("Byte " + unByte);
		 int numero = 1000;
		 System.out.println("Numero" + numero);
		 //float decimalFloat = 1.23456789f;
		 //System.out.println("float" + decimalFloat);
		 double decimalDoble = 1.23456789;
		 System.out.println("double" + decimalDoble);
		 
		 long entLargo = 1234567890123456789L;
		 System.out.println("Long" + entLargo);
		 
		 char caracter = 65;
		 System.out.println("caracter: " + caracter);
		  
		 char[] texto = {'a','b','c'};
		 System.out.println("caracter: " + texto[1]);
		 
		 
		for(int i = 0;i <texto.length; i = i + 1 ){
		  System.out.println("caracter: " + texto[i]);
		 }
		 
		 
	 }
	 
 }
 