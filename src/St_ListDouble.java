/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class St_ListDouble<T> implements IStack<T> {

	private DoubleLinkedList<T> listaInterna;
	
	public St_ListDouble() {
		listaInterna = new DoubleLinkedList<T>();
	}
	
	@Override
	public int count() {
		return listaInterna.Count();
	}

	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}

	@Override
	public T pull() {
		return listaInterna.DeleteAtStart();
	}

	@Override
	public T peek() {
		return listaInterna.Get(0);
	}

	
}
