import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       //задача 1
        int age = 15;
       if (age >= 18) {
           System.out.println("Поздравляем Вас с совершенолетием!");
       } else {
           System.out.println("Возраст совершенолетия еще не наступил, надо подождать.");
       }

       //задача 2
       int years = 20;
       if (years >=7 && years <18) {
           System.out.println("Вы школьник");
       } else if (years >= 18 && years < 24) {
           System.out.println("Вы студент");
       } else  if (years >=24) {
           System.out.println("Вам нужна работа");
       }

       //задача 3

       int totalSeats = 59;
       if (totalSeats >102) {
           System.out.println("Вагон забит, свободных мест нет");
       } else if (totalSeats <=102 && totalSeats >=60) {
            System.out.println("В вагоне только остались стоячие места");
       } else if (totalSeats <60) {
            System.out.println("В вагоне есть еще сидячие места");
        }

       //задача 1.3.

        int age1 = 19;
       if (age1 >=2 && age1 <=6) {
           System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
       } else if (age1 >= 7 && age1 <=18) {
           System.out.println("Если возраст человека равен "  + age1+ ", то ему нужно ходить в школу");
       } else if (age1 > 18 && age1 <=24) {
           System.out.println("Если возраст человека равен "  + age1 + ", то ему нужно ходить в университет");
       } else if (age1 > 24) {
           System.out.println("Если возраст человека равен "  + age1 + ", то ему нужно ходить на работу");
       }
    }
}