package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Linked_List list = new Linked_List();
        list.isEmpty();
        list.CreateLinkedList(1);
        list.CreateLinkedList(2);
        list.CreateLinkedList(3);
        list.CreateLinkedList(4);
        list.insertAtBeg(50);
        list.insertAtEnd(62);
        list.insertAt_Kth_pos(82,2);
        list.display();
        list.delete_from_Beg();
        list.display();
        //list.delete_From_End();
        list.display();
    }
}
