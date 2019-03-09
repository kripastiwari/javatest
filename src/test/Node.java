package test;

public class Node<E> {

	protected E data;
	protected Node<E> next;

	public Node() {
	}

	public Node(E data, Node<E> n) {
		this.data = data;
		next = n;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getLink() {
		return next;
	}

	public void setLink(Node<E> link) {
		this.next = link;
	}

}
