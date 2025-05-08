import java.util.Scanner;

public class Cadena {
    public static void main(String[] args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Como se llama tu nombre ");
        String nombre = almacenar.nextLine();
        System.out.println("Como se llama tu apellido paterno ");
        String apellidoPaterno = almacenar.nextLine();
        System.out.println("Como se llama tu apellido materno ");
        String apellidoMaterno = almacenar.nextLine();
        System.out.println("Tu nombre es: " + nombre + " " + apellidoPaterno + " " + apellidoPaterno + " Buenos dias xd");
        
    }
}