package edu.cnm.deepdive;

import java.util.Arrays; //Demo for Varargs

public class Demo {

  public static void doSomething(int otherData, int ... data){
    System.out.println(Arrays.toString(data));
  }

  public static void main(String[] args) {

  }

}
