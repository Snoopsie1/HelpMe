package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{
    List list = new List();
    List listeTom = new List();

    @BeforeEach
    void setUp()
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

    @Test
   void testListIsEmpty()
   {
       assertEquals(true, list.isEmpty());
   }

   @Test
    void testPrintFromHead_InsertFromHead()
   {
       Node node0 = new Node("0");
       Node node1 = new Node("1");
       Node node2 = new Node("2");
       Node node3 = new Node("3");

       list.insertFromHead(node0);
       list.insertFromHead(node1);
       list.insertFromHead(node2);
       list.insertFromHead(node3);

       assertEquals("3210", list.printFromHead());
   }

   @Test
    void testPrintFromTail_InsertFromHead()
   {
       Node node0 = new Node("0");
       Node node1 = new Node("1");
       Node node2 = new Node("2");
       Node node3 = new Node("3");

       list.insertFromHead(node0);
       list.insertFromHead(node1);
       list.insertFromHead(node2);
       list.insertFromHead(node3);

       assertEquals("0123", list.printFromTail());
   }

   @Test
    void testPrintFromHead_InsertFromTail()
   {
       Node node0 = new Node("0");
       Node node1 = new Node("1");
       Node node2 = new Node("2");
       Node node3 = new Node("3");

       list.insertFromTail(node0);
       list.insertFromTail(node1);
       list.insertFromTail(node2);
       list.insertFromTail(node3);

       assertEquals("0123", list.printFromHead());
   }

   @Test
   void testPrintFromTail_InsertFromTail()
   {
       Node node0 = new Node("0");
       Node node1 = new Node("1");
       Node node2 = new Node("2");
       Node node3 = new Node("3");

       list.insertFromTail(node0);
       list.insertFromTail(node1);
       list.insertFromTail(node2);
       list.insertFromTail(node3);

       assertEquals("4321", list.printFromTail());

   }

   @Test
    void testRemoveFromHead()
   {
       Node node = new Node ("");

       assertEquals (node, list.removeFromHead());

       Node testNode = new Node("4");

       listeTom.insertFromHead(testNode);
       assertEquals(testNode, listeTom.removeFromHead());
       assertEquals(true, listeTom.isEmpty());







   }
}