package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{
    List list = new List();
    List listeTom = new List();

    // use @BeforeEach to use setUp in every test method

    void setupHead()
    {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        list.insertFromHead(node0);
        list.insertFromHead(node1);
        list.insertFromHead(node2);
        list.insertFromHead(node3);
    }

    void setupTail()
    {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        list.insertFromTail(node0);
        list.insertFromTail(node1);
        list.insertFromTail(node2);
        list.insertFromTail(node3);
    }

    @Test
   void testListIsEmpty()
   {
       setupHead();
       assertEquals(false, list.isEmpty());
   }

   @Test
    void testPrintFromHead_InsertFromHead()
   {
       setupHead();
       assertEquals("3210", list.printFromHead());
   }

   @Test
    void testPrintFromTail_InsertFromHead()
   {
       setupHead();
       assertEquals("0123", list.printFromTail());
   }

   @Test
    void testPrintFromHead_InsertFromTail()
   {
       setupTail();
       assertEquals("0123", list.printFromHead());
   }

   @Test
   void testPrintFromTail_InsertFromTail()
   {
       setupTail();
       assertEquals("3210", list.printFromTail());
   }

   @Test
    void testRemoveFromHead()
   {
       assertEquals(null, list.removeFromHead());
       Node n = new Node("0");
       list.insertFromHead(n);

       assertEquals(n, list.removeFromHead());

       Node node0 = new Node("0");
       Node node1 = new Node("1");
       Node node2 = new Node("2");
       Node node3 = new Node("3");

       list.insertFromHead(node0);
       list.insertFromHead(node1);
       list.insertFromHead(node2);
       list.insertFromHead(node3);


       assertEquals(node3, list.removeFromHead());
       assertEquals("210", list.printFromHead());

   }
}