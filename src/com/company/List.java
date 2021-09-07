package com.company;

public class List
{
    Node head = null;
    Node tail = null;


    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }

        return false;
    }


    public Node insertFromHead(String s)
    {
        Node node = new Node(s);

        if (isEmpty())
        {
            head = node;
            tail = node;
            return head;
        }

        head.prev = node;
        node.next = head;
        head = node;

        return head;

    }

    public Node insertFromTail(String s)
    {
        Node node = new Node(s);

        if (isEmpty())
        {
            head = node;
            tail = node;
            return tail;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;

        return tail;
    }

    public String printFromHead()
    {
        Node n = head;
        String res = "";

        while (n != null)
        {
            res = res + n.data;
            n = n.next;
        }

        return res;
    }


    public String printFromTail()
    {
        Node n = tail;
        String res = "";

        while (n != null)
        {
            res = res + n.data;
            n = n.prev;
        }

        return res;
    }


}
