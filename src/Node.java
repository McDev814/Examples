
public class Node<T> {
	Node<T> next;
	Node<T> previous;
	T data;
	
	public Node(T data) {
		this.next = null;
		this.previous = null;
		this.data = data;
	}
	
	public Node(Node<T> next, T data) {
		this.next = next;
		this.previous = null;
		this.data = data;
	}
	
	public Node(Node<T> next, Node<T> previous, T data) {
		this.next = next;
		this.previous = previous;
		this.data = data;
	}
}
