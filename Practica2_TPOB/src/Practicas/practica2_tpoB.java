package Practicas;

import java.util.Scanner;

public class practica2_tpoB {

	public static void main(String[]args) {
		
		Scanner p1 = new Scanner(System.in);
		
		double AB,BC,CA;
		double Punto1,Punto2,Punto3;
		float x1,y1,x2,y2,x3,y3;
		
		System.out.println("Coordenadas del punto A: ");
		System.out.println("x1:");
		x1 = p1.nextFloat();
		System.out.println("y1:");
		y1 = p1.nextFloat();
		
		
		System.out.println("Coordenadas del punto B: ");
		System.out.println("x2:");
		x2 = p1.nextFloat();
		System.out.println("y2:");
		y2 = p1.nextFloat();
		
		
		System.out.println("Coordenadas del punto C: ");
		System.out.println("x3:");
		x3 = p1.nextFloat();
		System.out.println("y3:");
		y3 = p1.nextFloat();
		
		AB = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		Punto1 = Math.sqrt(AB);
		
		BC = Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2);
		Punto2 = Math.sqrt(BC);
		
		CA = Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2);
		Punto3 = Math.sqrt(CA);
	
		System.out.println("Lado A: " + AB);
		System.out.println("Lado B: " + BC);
		System.out.println("Lado C: " + CA);
		
		
		
		if(AB == BC && BC == CA && CA == AB) 
		{
			System.out.println("Triangulo equilatero");
			
		}
			
		
		
		
		if(AB == BC || BC== CA || CA == AB)
		{
			System.out.println("Triangulo isoceles");	
			
		}
		
		else {
		
			System.out.println("Triangulo escaleno");	
			
		
		}
		
		
	}












}
