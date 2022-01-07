package com.neova.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Test {

public static void main(String args[])
{
ArrayList<Integer> mylist=new ArrayList<Integer>();
mylist.add(11);
mylist.add(12);
mylist.add(18);
mylist.add(14);

Test g=new Test();
g.display(mylist);

}
private int display(ArrayList<Integer> mylist) {

Collections.sort(mylist);

int b=mylist.get(mylist.size()-1);
System.out.println(b);
return b;

}

}