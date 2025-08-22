package arreglos;

import java.util.Scanner;

public class estandares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] telefonos;

		Scanner captura = new Scanner(System.in);
		// long[] telefonos2 = new telefonos2[5];
		System.out.println("cuantos numeros quieres almacenar");
		int sizeArray = captura.nextInt();
		telefonos = new long[sizeArray];
		long num_tel;
		
		for(int x=0; x<sizeArray;x++) {
			
			System.out.println("dame el telefono");
			num_tel = captura.nextLong();
			telefonos[x] = num_tel;
		}
	
		int i;
		for(int i1 = 0; i1 < telefonos.length ;i1++ ) {
			System.out.println("el numero de tel es " +telefonos[i1]);
			
		}
	}
	
	
	
	
	
	

}
