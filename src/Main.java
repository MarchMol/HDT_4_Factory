import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static IStack<Integer> stk;

    public static void main(String[] args) {
        View v = new View();
        StackFactory stf = new StackFactory();

        int op = v.menu();
        while (op != 5) {
            switch (op) { //uwu
                case 1: //ArrayList
                    stk = stf.getInstance("ArrayList");
                    System.out.println("Usted escogio implementación Arraylist");
                    break;
                case 2:
                    stk = stf.getInstance("Vector");
                    System.out.println("Usted escogio implementación Vector");
                    break;
                case 3:
                    stk = stf.getInstance("Simple");
                    System.out.println("Usted escogio implementación Lista Simple");
                    break;
                case 4:
                    stk = stf.getInstance("Doble");
                    System.out.println("Usted escogio implementación Lista doble");
                    break;
            }
            Leer();
            op = v.menu();
        }
    }

    public static void Leer() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/datos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Evaluar la expresión postfix
                System.out.println(infix_to_postfix(line));
                System.out.println("Resultado: " + Evaluar(infix_to_postfix(line)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int preced(char ch) {
        return switch (ch) {
            case '+' -> 1;
            case '-' -> 1;
            case '*' -> 2;
            case '/' -> 2;
            default -> 0;
        };
    }

    public static String infix_to_postfix(String line) {
        String postfix = "";
        StackFactory stf = new StackFactory();
        IStack<String> stack = stf.getInstance("vector"); // no importa la implementación
        for (int i = 0; i <line.length(); i++) {
            boolean isNum =  false;
            try{
                Integer.parseInt(line.charAt(i)+"");
                isNum=true;
            } catch(Exception e){}
            if (isNum) {
                postfix = postfix + line.charAt(i);
            } else if(line.charAt(i)== '-' || line.charAt(i)== '+' || line.charAt(i)== '*' || line.charAt(i)== '/'){
                stack.push(line.charAt(i) + "");
            } else if (line.charAt(i) == '(') {
                stack.push("(");
            } else if (line.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != "(") {
                    postfix+=stack.pull();
                }
                stack.pull();
            }
        }
        while (!stack.isEmpty()){
            postfix+=stack.pull();
        }
        return postfix;
    }

    public static int Evaluar(String exp) {
        // Instanciacion de pila, vector y clase que implementa la interfaz dada
        Calculadora cal;
        cal = Calculadora.getInstance();

        ArrayList<String> operandos = cal.getItems(exp);

        // se recorren los elementos del vector
        for (String st : operandos) {
            if (!cal.isOperator(st)) { // si es operando se hace push a la pila
                stk.push(Integer.parseInt(st));
            } else { // si es operador, se hacen pop a las ultimos 2 operandos y se operan
                // apropiadamente
                int val1 = stk.pull();
                int val2 = stk.pull();
                switch (st) { // switch case para la operación apropiada
                    case "+":
                        stk.push(cal.suma(val1, val2));
                        break;
                    case "-":
                        stk.push(cal.resta(val1, val2));
                        break;
                    case "*":
                        stk.push(cal.multiplicacion(val1, val2));
                        break;
                    case "/":
                        stk.push(cal.division(val1, val2));
                        break;
                }
            }
        }
        // El resultado final estará en la cima de la pila
        return stk.pull();
    }
}
