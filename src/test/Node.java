package test;

public class Node<E> {

	protected E data;
	protected Node<E> link;

	public Node() {
	}

	public Node(E data, Node<E> n) {
		this.data = data;
		link = n;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getLink() {
		return link;
	}

	public void setLink(Node<E> link) {
		this.link = link;
	}

}
