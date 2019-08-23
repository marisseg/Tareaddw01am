package senati.ddw.ciclo3.tareaddw01a;
import java.util.Scanner;
public class Ejercicio011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce el número de ventas");     
		int numVentas=sc.nextInt();       
		int sumaVentas=0;     
		for (int i=0;i<numVentas;i++){        
			System.out.println("Introduce el precio de la venta "+(i+1));   
			int venta=sc.nextInt();            
			sumaVentas=sumaVentas+venta;       
		}        
		System.out.println("La suma de las ventas es de: " +sumaVentas);
	}

}
