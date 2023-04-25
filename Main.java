/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int opcja;
    System.out.println("Opcje:");
    System.out.println("1 - dodaj nowego studenta");
    System.out.println("2 - wypisz studentów");
    System.out.println("0 - wyjście");
    System.out.println("Podaj opcję:");
    Scanner liczba = new Scanner(System.in);
    opcja = liczba.nextInt();
    Scanner name = new Scanner(System.in);
    Scanner age = new Scanner(System.in);
    Scanner lastname = new Scanner(System.in);
    Service s = new Service();
    switch(opcja)
      {
        case 0:
          System.exit(0);
          break;
        case 1:
          System.out.println("Podaj imię: ");
           String n = name.nextLine();
          System.out.println("Podaj nazwisko: ");
          String l = lastname.nextLine();
          System.out.println("Podaj wiek: ");
          int a = age.nextInt();
          try {
          s.addStudent(new Student(n, l, a));
           } catch (IOException e) { 

      } 
          break;
        case 2:
          try{
          var students = s.getStudents();
          for(Student current : students)
          System.out.println(current.ToString());
          } catch (IOException e) { 

      } 
          break;
          
      
   
  }
}
}