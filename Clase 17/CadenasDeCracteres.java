import java.util.Scanner;

public class CadenasDeCracteres {
    public static void main(String args[]){

        String nombre = "";
        String nombre_dos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Porfavor ingresa primer nombre");
        nombre = entrada.nextLine();
        System.out.print("-------------------------------");
        System.out.print("Porfavor ingresa segundo nombre");
        nombre_dos = entrada.nextLine();

        if (nombre.equals(nombre_dos)){

            System.out.print("Los nombres son iguales, el nombre es: " + nombre);

        }
        else {
            System.out.print("Los nombres ingresados son diferentes: " + nombre + " || " + nombre_dos);
        }




    }
}
