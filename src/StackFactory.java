public class StackFactory {
    public IStack getInstance(String tipo){

        return switch (tipo.toLowerCase()) {
            case "arraylist" -> //ArrayList
                    new St_ArrayList();
            case "vector" -> //Vector
                    new St_Vector();
            case "simple" -> //Lista
                    new St_List("simple");
            case "doble" -> //Lista
                    new St_List("doble");
            default -> null;
        };
    }
}
