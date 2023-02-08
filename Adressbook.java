package Java.OOP6;

import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();
    
    public void Adressbook(){
        pb.add(new Phonebook("Лавренов Евгений Александрович","+795000000","Санкт-Петербург"));        
        pb.add(new Phonebook("Лавренова Инна Сергеевна","+795000001","Лавреново"));        
    }

    public void showAddressBook(ArrayList<Phonebook> phnbook){
        for(Phonebook i:phnbook){
                    System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
                }
    }
}
