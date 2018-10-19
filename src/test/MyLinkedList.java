package test;

import java.util.LinkedList;

public class MyLinkedList<E> {

	protected Node<E> start;

	public MyLinkedList() {
		start = null;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		int size = 0;
		Node<E> nextNode = start;

		while (nextNode != null) {
			nextNode = nextNode.link;
			size++;
		}
		return size;
	}

	public void insertAtStart(E data) {
		Node<E> startNode = new Node<>();
		startNode.setData(data);
		if (start == null) {
			start = startNode;
		} else {
			startNode.setLink(start);
			start = startNode;
		}
	}

	public void insertAtEnd(E data) {
		Node<E> endNode = new Node<>();
		endNode.setData(data);

		if (start == null) {
			start = endNode;
		} else {
			Node<E> temp = start;
			while (true) {
				if (temp.link == null) {
					temp.link = endNode;
					break;
				} else {
					temp = temp.link;
					
					LinkedList<E> list = new LinkedList<>();
				}
			}
		}

	}

	public void insertAtPos(E data, int pos) {
		Node<E> node = new Node<>();
		node.setData(data);
		if (pos == 1) {
			node.link = start;
			start = node;
			return;
		}
		int size = getSize();
		if (pos > size + 1) {
			return;
		}
		Node<E> temp = start;
		pos = pos - 1;
		int counter = 1;
		while (temp != null) {
			if (pos == counter) {
				node.link = temp.link;
				temp.link = node;
				break;
			}
			temp = temp.link;
			counter++;
		}
	}

	public void deleteAtPos(int pos) {

		if (pos == 1) {
			start = start.getLink();
			return;
		}

		Node<E> temp = start;
		pos = pos - 1;
		int counter = 1;
		while (temp.link != null) {
			if (pos == counter) {
				temp.link = temp.link.link;
				break;
			}
			temp = temp.link;
			counter++;
		}
	}

	public void traverse() {
		Node<E> node = start;
		while (node != null) {
			System.out.println(node.getData());
			node = node.link;
		}
	}

	public void reverse() {
		Node<E> curr = start;
		Node<E> nxt = null;
		Node<E> prev = null;
		while (curr != null) {
			nxt = curr.link;
			curr.link = prev;
			prev = curr;
			curr = nxt;
		}
		start = prev;
	}

	public void findMiddle() {
		Node<E> n1 = start;
		Node<E> n2 = start;
		while (n2 != null && n2.link != null) {
			n2 = n2.link.link;
			n1 = n1.link;
		}
		System.out.println("Middle element is " + n1.data);
	}

	public void thirdlast() {
		Node<E> n1 = start;
		Node<E> n2 = start.link.link;
		if (n2 != null) {
			while (n2 != null && n2.link != null) {
				n2 = n2.link;
				n1 = n1.link;
			}
			System.out.println("Third last element is " + n1.data);

		}
	}
}
