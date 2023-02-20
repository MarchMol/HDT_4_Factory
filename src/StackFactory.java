public class StackFactory {
    public IStack getInstance(int tipo){

        return switch (tipo) {
            case 1 -> //ArrayList
                    new St_ArrayList();
            case 2 -> //Vector
                    new St_Vector();
            case 3 -> //Lista Simple
                    new St_ListSingle();
            case 4 -> //Lista Doble
                    new St_ListDouble();
            default -> null;
        };
    }
}
