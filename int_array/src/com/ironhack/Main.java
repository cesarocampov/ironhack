package com.ironhack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.Integer;

public class Main {
  public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    int initialCapacity = 5;


    for(int i = initialCapacity; i > 0; i--){
      numbers.add(i);
    }

    ArrayList<Integer> copy = new ArrayList<>(numbers);

    for(int j = 0; j < numbers.size(); j++){
      if(j == copy.size()-1) {
        copy.set(j, numbers.get(j) * numbers.get(0));

      } else {
        copy.set(j, copy.get(j) * numbers.get(j + 1));
      }
    }

   int[] input = {4, 200, -5, 5000, 1};




  }
  public static int[] sortDescending(int[] input){

    for (int i = 0; i < input.length; i++) {
      for(int j = i +1;j<input.length; j++){
        int currentMax = 0;
        if(input[i] < input[j]) {
          currentMax = input[i];
          input[i] = input[j];
          input[j] = currentMax;
        }
      }


    }

  }

}
