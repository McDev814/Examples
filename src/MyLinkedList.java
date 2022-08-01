
public class MyLinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addNode(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);
		} else {
			Node<T> toAdd = new Node<T>(data);
			Node<T> current = this.head;
			boolean sentinal = true;
			do {
				if (current.next == null) {
					current.next = toAdd;
					sentinal = false;
				} else {
					current = current.next;
				}
			} while(sentinal);
		}
	}
	
	public void printList() {
		Node<T> current = this.head;
		boolean sentinal;
		if (current != null) {
			sentinal = true;
		} else {
			sentinal = false;
		}
		do {
			System.out.println(current.data.toString());
			current = current.next;
			if (current == null) sentinal = false;
		} while (sentinal);
	}
}
