package com.company;

public class Linked_List {

    public class Node
    {
        private int data;
        private Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head =null;
    public Node tail = null;
    public boolean isEmpty()
    {
        if(head == null)
            return true;
        else
            return false;
    }
    public void CreateLinkedList(int value)
    {

        Node newNode = new Node(value);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

    }
    public void insertAtBeg(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
         }
         public void insertAtEnd(int value)
      {
        Node newNode = new Node(value);
        Node temp;
        if(isEmpty())
        {
            head = temp = newNode;
        }
        else {
            newNode.next = null;
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
      }
    public int count()
    {
        Node temp = head;
        int coun = 0;
        while (temp!= null)
        {
            coun++;
            temp = temp.next;
        }
        return coun;
    }
    public void insertAt_Kth_pos(int value, int pos)
    {
        Node temp = head;
        int i =1;
        if(pos > count() || pos < 1 )
        {
            System.out.println("Invalid Position");
        }
        else
        {
            while (i < pos)

            {
                temp = temp.next;
                i++;
            }

        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void display()
    {
        Node temp = head;
        if(isEmpty())
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            while (temp != null)
            {
                System.out.print(" " +temp.data);
                temp = temp.next;
            }
            System.out.println(" ");
        }
    }
    public void delete_from_Beg()
    {
        if(isEmpty())
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            head = head.next;
        }
    }
   /* public void delete_From_End()

    {
        Node temp = head , prevnode;
        while (temp.next != null)
        {
            prevnode = temp;
            temp = temp.next;
        }
        if(temp == head)
        {
            head = null;
        }
        else
        {
            prevnode.next = null;
        }

    }*/
}
