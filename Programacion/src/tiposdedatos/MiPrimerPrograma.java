package tiposdedatos;

public class MiPrimerPrograma {

	public static void main(String[] args) {
		
		//tipos de datos
		// declarar e inicializar
		int salario = 2500; 
		short salario2 = 2500;
		long salario3 = 2500L;
		//byte salario4=2500; no es v�lido porque no entra dentro del rango
        float salario4 = 2500F; 
        double salario5 = 2500;
        //int salario6 = 2500.23; no es valido porque tiene decimales
        boolean paga_extra = true;
        
        //declara una variable 
        int edad;
        int edad2;
        int sumatotal;
        //multiplicacion y division
        int multiplica;
        int division;
        
        //incremento
        int incremento = 0;
        incremento = incremento + 1; 
        // incremento++; 
        //incremento+=10;
        
        //decremento
        int decremento=8;
        decremento = decremento -1;
        //decremento--;
        //
        		
        //iniciala - asigna
        edad = 18;
        edad2 = 40;
        sumatotal= edad + edad2;
        multiplica= edad * edad2;
        division= edad/edad2;
        //imprime por consola
        System.out.println("La primera edad es: " + edad + " a�os"); //si no ponemos ln alfinal de print no hace salto de linea y quedaria: 1840
        System.out.println("La segunda edad es: " + edad2 + " a�os");
        System.out.println("La suma de las edades es: " + sumatotal + " a�os");
        System.out.println("La multiplicacion de las edades es: " + multiplica);
        System.out.println("La divisi�n de las edades es: " + division);
        
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento: " + decremento);

        
        
	}

}
