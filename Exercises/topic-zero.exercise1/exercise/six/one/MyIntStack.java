package exercise.six.one;

public class MyIntStack {
	private int[] contents;
	private int tos;  // Top of the stack
	 
	   // constructors
	public MyIntStack(int capacity) {
	   contents = new int[capacity];
	   tos = -1;
	}
	 
	public boolean push(int element) throws IllegalStateException  {
		boolean push = false;
		if((tos+1)==contents.length) {
			throw new IllegalStateException("The Stack if full!");
		}
		else {
			contents[++tos] = element;
			push = true;
			return push;
		}
	}
	 
	public int pop() {
	   return contents[tos--];
	}
	 
	public int peek() {
	   return contents[tos];
	}
	 
	public boolean isEmpty() {
	   return tos < 0;
	}
	 
    public boolean isFull() {
	   return tos == contents.length - 1;
	}
    
    public String toString() {
		StringBuilder sb = new StringBuilder();
	      for (int i : contents) {
	          sb.append(i + " ");
	      }
	      return sb.toString();
	}
}
