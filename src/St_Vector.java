import java.util.Vector;

/**
 * @author MAAG
 *
 */
public class St_Vector<T> implements IStack<T> {

	private Vector<T> miVectorInterno;
	
	public St_Vector() {
		miVectorInterno = new Vector<T>();
	}
	
	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return miVectorInterno.size();
	}

	@Override
	public int size() {
		return miVectorInterno.size();
	}

	@Override
	public boolean isEmpty() {
		return miVectorInterno.isEmpty();
	}

	@Override
	public void push(T value) {
		miVectorInterno.add(0, value);
	}

	@Override
	public T pull() {
		return miVectorInterno.remove(0);
	}

	@Override
	public T peek() {		
		return miVectorInterno.get(0);
	}
}