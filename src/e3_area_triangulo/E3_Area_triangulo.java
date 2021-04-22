
package e3_area_triangulo;

import java.util.Scanner;

public class E3_Area_triangulo {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //decalracion de variables
        int base;
        int altura;
        int area;
        //entrada de datos
        System.out.println("ingrese la base");
        base=in.nextInt();
        System.out.println("ingrese la altura");
        altura=in.nextInt();
        //procedimiento
        area=base*altura/2;
        // salida de datos
        System.out.println("el area del triangulo es: "+ area+" unidades cuadradas");
        
    }
    
}
