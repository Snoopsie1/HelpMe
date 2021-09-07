package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest
{
    List list = new List();

   @Test
   void TestListIsEmpty()
   {
       assertEquals(true, list.isEmpty());
   }
}