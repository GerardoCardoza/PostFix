import java.util.Vector;

/**
 * 
 */

/**
 * @author Pc
 * @param <E>
 *
 */
public  class Pila<E> implements I_Stack<E>{
	
	 Vector<E> miPila=new Vector<E>();
	 
	
	@Override
	public void push(E element){
		miPila.addElement(element);
	}
	
	
	@Override
	public E pop(){
		E x= (E) miPila.lastElement();
		miPila.remove(miPila.lastElement());
		return x;
	}



	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
