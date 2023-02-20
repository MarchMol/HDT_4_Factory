public class ListFactory {
    public IList getInstance(int tipo){

        switch (tipo){
            case 1: //Simple
                return new SingleLinkedList();
            case 2: //Doble
                return new DoubleLinkedList();
            default:
                return null;
        }
    }
}
