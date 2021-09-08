package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{
    List list = new List();

    @BeforeEach
    void setUp()
    {
        list.insertFromHead("0");
        list.insertFromHead("1");
        list.insertFromHead("2");
        list.insertFromHead("3");
    }

    @Test
   void testListIsEmpty()
   {
       assertEquals(true, list.isEmpty());
   }

   @Test
    void testPrintFromHead_InsertFromHead()
   {
       list.insertFromHead("1");
       list.insertFromHead("2");
       list.insertFromHead("3");
       list.insertFromHead("4");

       assertEquals("4321", list.printFromHead());
   }

   @Test
    void testPrintFromTail_InsertFromHead()
   {
       list.insertFromHead("1");
       list.insertFromHead("2");
       list.insertFromHead("3");
       list.insertFromHead("4");

       assertEquals("1234", list.printFromTail());
   }

   @Test
    void testPrintFromHead_InsertFromTail()
   {
       list.insertFromTail("1");
       list.insertFromTail("2");
       list.insertFromTail("3");
       list.insertFromTail("4");

       assertEquals("1234", list.printFromHead());
   }

   @Test
   void testPrintFromTail_InsertFromTail()
   {
       list.insertFromTail("1");
       list.insertFromTail("2");
       list.insertFromTail("3");
       list.insertFromTail("4");

       assertEquals("4321", list.printFromTail());

   }
}