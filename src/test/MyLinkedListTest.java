package test;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList<String> linkedlist = new MyLinkedList<>();
		linkedlist.insertAtEnd("1");
		linkedlist.insertAtEnd("2");
		linkedlist.insertAtEnd("3");
		linkedlist.insertAtStart("4");
		

		//linkedlist.traverse();
		//System.out.println("/n");
		linkedlist.reverse();
		//System.out.println("/n");
		//linkedlist.thirdlast();

	}

}
