public class Main {
    public static void main(String[] args) {
        View v = new View();
        Controller con = new Controller();
        int op;
        do{
            op = v.menu();

        } while(op!=5);
    }
}