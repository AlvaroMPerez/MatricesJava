import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //Sin  ser dinamico
        int [][] matriz = {
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
        var diagonales = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println("La suma de [0][0]," + matriz[0][0] + " [1][1] " + matriz[1][1] + "y [2][2] " + matriz[2][2] + "es = " + diagonales);

        //dinamico
        int renglones, columnas;
        var scanner  = new Scanner(System.in);

        System.out.println("Ingresa primero el numero de rengloes y luego el numero de columnas");
        renglones = Integer.parseInt(scanner.nextLine());
        columnas =  Integer.parseInt(scanner.nextLine());

        matriz = new int[renglones][columnas];


        for (var ren=0; ren < renglones; ren ++){
            for (var col = 0; col < columnas; col ++){
                System.out.println("Ingresa la posicion [" + ren + "][" + col + "]");
                matriz[ren][col] = Integer.parseInt(scanner.nextLine());
            }
        }


        //Suma de cada las matrices en diagonal
        var suma = 0;

        for (var ren=0; ren < renglones; ren ++){
            for (var col = 0; col < columnas; col ++){

                if (ren == col){
                    suma += matriz[ren][col];
                }
            }
        }
        System.out.println("La suma de las diagonales de la matriz dinamica es = " + suma);
    }


}