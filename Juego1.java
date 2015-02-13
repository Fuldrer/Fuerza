import java.util.Scanner;

public class Juego1{
	public static void main(String[] args){

	   int casilla_11 = 1;
	   int casilla_12 = 2;
	   int casilla_13 = 3;

	   int casilla_21 = 4;
	   int casilla_22 = 5;
	   int casilla_23 = 6;

	   int casilla_31 = 7;
	   int casilla_32 = 8;
	   int casilla_33 = 0;


		   while(true){
		   System.out.println(""+casilla_11+casilla_12+casilla_13);
		   System.out.println(""+casilla_21+casilla_22+casilla_23);
		   System.out.println(""+casilla_31+casilla_32+casilla_33);

		   Scanner scanner = new Scanner(System.in);

		   System.out.print("Ingrese WASD (arriba, izquierda, abajo, derecha: ");
		   char opcion = scanner.next().charAt(0);

		    if(opcion == 's'){
			//Fila 2
			if(casilla_23 == 0)
			{
			casilla_23 = casilla_13;
			casilla_13 = 0;
			}
			else if(casilla_22 == 0)
			{
			casilla_22 = casilla_12;
			casilla_12 = 0;
			}
			else if(casilla_21 == 0)
			{
			casilla_21 = casilla_11;
			casilla_11 = 0;
			}
			//Fila 3
			else if(casilla_33 == 0)
			{
			casilla_33 = casilla_23;
			casilla_23 = 0;
			}
			else if(casilla_32 == 0)
			{
			casilla_32 = casilla_22;
			casilla_22 = 0;
			}
			else if(casilla_31 == 0)
			{
			casilla_31 = casilla_21;
			casilla_21 = 0;
			}
			}
			if(opcion == 'w'){
			//Fila 1
			if(casilla_13 == 0){

			casilla_13 = casilla_23;
			casilla_23 = 0;
			}
			
			else if(casilla_12 == 0){

			casilla_12 = casilla_22;
			casilla_22 = 0;
			}
			
			else if(casilla_11 == 0){

			casilla_11 = casilla_21;
			casilla_21 = 0;
			}
			//Fila 2
			else if(casilla_23 == 0)
			{
			casilla_23 = casilla_33;
			casilla_33 = 0;
			}
			else if(casilla_22 == 0)
			{
			casilla_22 = casilla_32;
			casilla_32 = 0;
			}
			else if(casilla_21 == 0)
			{
			casilla_21 = casilla_31;
			casilla_31 = 0;
			}
			}
			if(opcion == 'd'){

				if(casilla_13 == 0){
				casilla_13=casilla_12;
				casilla_12=0;
				}

				if(casilla_23 == 0){
				casilla_23=casilla_22;
				casilla_22=0;
				}

				if(casilla_33 == 0){
				casilla_33=casilla_32;
				casilla_32=0;
				}

				if(casilla_12 == 0){
				casilla_12=casilla_11;
				casilla_11=0;
				}

				if(casilla_22 == 0){
				casilla_22=casilla_21;
				casilla_21=0;
				}

				if(casilla_32 == 0){
				casilla_32=casilla_31;
				casilla_31=0;
	    }

    }
			    if(opcion == 'a'){

			if(casilla_11 == 0){
			casilla_11=casilla_12;
			casilla_12=0;
			}
			if(casilla_21 == 0){
			casilla_21=casilla_22;
			casilla_22=0;
			}

			if(casilla_31 == 0){
			casilla_31=casilla_32;
			casilla_32=0;
			}
			if(casilla_12 == 0){
			casilla_12=casilla_13;
			casilla_13=0;
			}

			if(casilla_22 == 0){
			casilla_22=casilla_23;
			casilla_23=0;
			}

			if(casilla_32 == 0){
			casilla_32=casilla_33;
			casilla_33=0;
			} 
          }
    }
}
}