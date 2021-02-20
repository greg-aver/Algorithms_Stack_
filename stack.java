import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    public int size() {
        if (this.peek() == null) {
            return 0;
        }
        return list.size();
    }

    public T pop() {
        if (this.peek() == null) {
            return null;
        }
        return list.pop();
    }

    public void push(T val) {
        list.addFirst(val);
    }

    public T peek() {
        return list.peekFirst();
    }
}
