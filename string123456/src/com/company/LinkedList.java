package com.company;

public class LinkedList {
    private int size;
    private Node start;

    public LinkedList()
    {
        size = 0;
        start = null;
    }
    public LinkedList(int s1, Node s2 )
    {
        size = s1;
        start = s2;
    }
    public void insertAtBeg(int val)
    {
        Node newNode;
        newNode = new Node();
        newNode.setData(val);
        newNode.setNext(start);
        size++;

    }
    public void insertAtEnd(int val)
    {
        Node temp,newNode;
        newNode = new Node();
        newNode.setData(val);
        temp = start;
        if(temp == null)
        {
            start = newNode;
        }
        else {
            while (temp.getNext()!=null)
            {
                temp = temp.getNext();
                temp.setNext(newNode);
            }
            size++;
        }
    }
    public void insertAtPos(int val,int pos)
    {

        if(pos == 1)
        {
            insertAtBeg(val);
        }
        else if(pos == size + 1)
        {
            insertAtEnd(val);
        }
        else if(pos>1 && pos<=size)
        {
            Node temp,newNode;
            newNode = new Node(val,null);
            temp = start;
            for(int i=0;i<pos-1;i++)
            {
                temp.getNext();
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                size++;
            }
        }
        else {
            System.out.println("We can not insert at this position" +pos);
        }
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else {
            return  false;
        }
    }
    public int getSize()
    {
        return  size;
    }
    public void displayList()
    {
        Node temp;
        if(isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            temp = start;
            for (int i = 0; i < size; i++) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }


}
