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
    }
}