package Java.OOP6;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Menu {
    public static void mainMenu(){
      Scanner in = new Scanner(System.in);
      System.out.println("1 - Отобразить справочник");
      System.out.println("2 - Выгрузить данные");
      System.out.println("3 - Загрузить данные");

      System.out.println(". ".repeat(15));
      System.out.println("Выберите действие: ");

      int input=in.nextInt();
      Filemanager run=new Filemanager();
      Adressbook phones=new Adressbook();
      phones.Adressbook();

      switch(input){
        case 1:
            phones.showAddressBook(phones.pb);                        
            break;
        case 2:      
            run.ExportFile(phones.pb); 
            System.out.println("Export finish");
            break;            
        case 3:
            // phones.showAddressBook();
            phones.showAddressBook(run.ImportFile());                             
            break;
            
            
      }
    }
}
