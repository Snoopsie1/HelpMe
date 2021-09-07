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
}
