package com.ironhack;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    int[] numbers = {0,1,2,3,4,5,6,7,8,9};
    String[] string = new String[20];

    ArrayList<String> newArrayList = new ArrayList<>();
    newArrayList.add("Hello");
    newArrayList.add(1,"hi");
    newArrayList.add("hello3");
    newArrayList.add("hello4");
    newArrayList.add(3, "hello5");
    newArrayList.set(1,"hello6");


    for(int i = 0; i < newArrayList.size(); i++){
      System.out.println(newArrayList.get(i));
    }

    int i = 0;
    while(i< newArrayList.size()){
      System.out.println(newArrayList.get(i));
      i++;
    }

    int j=0;
    do {

      System.out.println(newArrayList.get(j));
      j++;
    }while(j<newArrayList.size());

    for(String word : newArrayList){
      System.out.println(word);
    }

    newArrayList.forEach(System.out::println);

  }
}
