package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{
    List list = new List();

   @Test
   void testListIsEmpty()
   {
       assertEquals(true, list.isEmpty());
   }

   @Test
    void testPrintInsertFromHead()
   {
       list.insertFromHead("1");
       list.insertFromHead("2");
       list.insertFromHead("3");
       list.insertFromHead("4");

       assertEquals("4321", list.printFromHead());
   }
}