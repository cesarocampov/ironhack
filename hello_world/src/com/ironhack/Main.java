package com.ironhack;

public class Main {
  public static void main(String[] args){
    /*int edad1 = 20;
    int edad2 = 25;

    if(edad1 > edad2){
      System.out.println("edad1 es mayor");
    } else {
      System.out.println("edad2 es mayor");
    }

    String week = "Tuesday";
    switch (week) {
      case "Monday":
        System.out.println("Es Lunes");
        break;
      case "Tuesday":
        System.out.println("Es Martes");
        break;
      case "Wednesday":
        System.out.println("Es Miercoles");
        break;
      case "Thursday":
        System.out.println("Es Miercoles");
        break;
      case "Friday":
        System.out.println("Es Miercoles");
        break;
      default:
        System.out.println("no es un dia de la semana");

    }

    System.out.println(concatenateStrings("cesar","carlos"));
    System.out.println(calculateLength("cesar carlos"));
    */
    System.out.println(productFormatter(" cesar carlos  ", "1231231"));
    System.out.println(Math.max(2,3));

  }

  public static String productFormatter(String productName, String date){
   String result = (productName.trim().replace(" ", "_") + date).toUpperCase();
   return result;
  }

  public static String concatenateStrings(String word1, String word2){
    return word1 + word2;
  }
  public static int calculateLength(String word){
    return word.length();
  }
}


