package test;

import java.util.LinkedList;

public class MyLinkedList<E> {

	protected Node<E> head;

	public MyLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		int size = 0;
		Node<E> nextNode = head;

		while (nextNode != null) {
			nextNode = nextNode.next;
			size++;
		}
		return size;
	}

	public void insertAtStart(E data) {
		Node<E> startNode = new Node<>();
		startNode.setData(data);
		if (head == null) {
			head = startNode;
		} else {
			startNode.setLink(head);
			head = startNode;
		}
	}

	public void insertAtEnd(E data) {
		Node<E> endNode = new Node<>();
		endNode.setData(data);

		if (head == null) {
			head = endNode;
		} else {
			Node<E> temp = head;
			while (true) {
				if (temp.next == null) {
					temp.next = endNode;
					break;
				} else {
					temp = temp.next;
					
					LinkedList<E> list = new LinkedList<>();
				}
			}
		}

	}

	public void insertAtPos(E data, int pos) {
		Node<E> node = new Node<>();
		node.setData(data);
		if (pos == 1) {
			node.next = head;
			head = node;
			return;
		}
		int size = getSize();
		if (pos > size + 1) {
			return;
		}
		Node<E> temp = head;
		pos = pos - 1;
		int counter = 1;
		while (temp != null) {
			if (pos == counter) {
				node.next = temp.next;
				temp.next = node;
				break;
			}
			temp = temp.next;
			counter++;
		}
	}

	public void deleteAtPos(int pos) {

		if (pos == 1) {
			head = head.getLink();
			return;
		}

		Node<E> temp = head;
		pos = pos - 1;
		int counter = 1;
		while (temp.next != null) {
			if (pos == counter) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
			counter++;
		}
	}

	public void traverse() {
		Node<E> node = head;
		while (node != null) {
			System.out.println(node.getData());
			node = node.next;
		}
	}

	public void reverse() {
		Node<E> prev = null;
		Node<E> curr = null;
		Node<E> nxt = null;
		
		curr = head;
		
		while (curr != null) {
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		head = prev;
	}

	public void findMiddle() {
		Node<E> n1 = head;
		Node<E> n2 = head;
		while (n2 != null && n2.next != null) {
			n2 = n2.next.next;
			n1 = n1.next;
		}
		System.out.println("Middle element is " + n1.data);
	}

	public void thirdlast() {
		Node<E> n1 = head;
		Node<E> n2 = head.next.next;
		if (n2 != null) {
			while (n2 != null && n2.next != null) {
				n2 = n2.next;
				n1 = n1.next;
			}
			System.out.println("Third last element is " + n1.data);

		}
	}
}
