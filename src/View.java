import java.util.Scanner;

public class View {
    public int menu(){
        int temp;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Ingrese la implementación deseada para el Stack:");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista Simplemente Encadenada");
            System.out.println("4. List Doblemente Encadenada");
            System.out.println("5. Salir");
            temp = scan.nextInt();
        } while(temp<1 || temp>4);
        return temp;
    }
}
