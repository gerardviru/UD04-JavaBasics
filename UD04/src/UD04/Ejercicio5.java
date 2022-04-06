package UD04;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*Declaramos las variables*/
		int a=3;
		int b=7;
		int c=10;
		int d=14;
		/*Declaramos una variable sin valor que nos ayudara recoger el valor del último cambio*/
		int alternativo;
		
		/*Output del valor de las variables*/
		System.out.println("Valores iniciales de las variables = "+a+" - "+b+" - "+c+" - "+d);
		System.out.println();
		
		/*Nueva asignación de los valores*/
		alternativo = b;
		b = c;
		c = a;
		a = d;
		d = alternativo;
		
		/*Output de los nuevos valores asignados*/
		System.out.println("Valor b toma el valor de c --> "+b);
		System.out.println("Valor c toma el valor de a --> "+c);
		System.out.println("Valor a toma el valor de d --> "+a);
		System.out.println("Valor d toma el valor de b --> "+d);
		

	}

}
