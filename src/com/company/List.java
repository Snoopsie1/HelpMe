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


    public Node insertFromHead(Node n)
    {
        Node node = n;

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

    public Node insertFromTail(Node n)
    {
        Node node = n;

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


    public Node removeFromHead()
    {
        Node node;

        if (isEmpty())
        {
            return null;
        }

        if (head == tail)
        {
            node = head;
            head = null;
            tail = null;

            return node;
        }

        node = head;
        head = head.next;
        // Cutting connections
        head.prev.next = null;
        head.prev = null;
        return node;
    }

    public String findNodeFromHead(String s)
    {
        Node n = head;

        if (isEmpty())
        {
            return null;
        }

        while(n != null)
        {
            if (n.data == s)
            {
               return n.data;
            }
            n = n.next;
        }

        return n.data;
    }

    public void removeFoundNode(String s)
    {
        Node n = head;

        if (isEmpty())
        {
            return;
        }

        while (n != null)
        {
            if (n.data == s)
            {
                n.next.prev = null;
                n.prev.next = null;

                n.prev.next = n.next;
                n.next.prev = n.prev;
            }

            n = n.next;
        }
    }
}
