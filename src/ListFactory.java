public class ListFactory {
    public IList getInstance(String tipo){

        return switch (tipo.toLowerCase()) {
            case "simple" -> //Simple
                    new SingleLinkedList();
            case "doble" -> //Doble
                    new DoubleLinkedList();
            default -> null;
        };
    }
}
