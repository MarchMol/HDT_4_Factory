/**
 * @author MAAG
 *
 */
public class St_List<T> implements IStack<T> {

	private IList<T> listaInterna;
	
	public St_List(String tipo) {
		ListFactory lf = new ListFactory();
		listaInterna = lf.getInstance(tipo);
	}

	
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return listaInterna.Count();
	}

	@Override
	public int size() {
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
