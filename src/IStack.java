/**
 * @author MAAG
 *
 */
public interface IStack<T> {

	int count();

	int size();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}
