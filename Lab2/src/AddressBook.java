import java.sql.SQLOutput;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Bud_list;
    AddressBook(){
        Bud_list = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        Bud_list.add(buddy);
    }

    public void removeBuddy(int index){
        if (index >= 0 && index < Bud_list.size()){
            Bud_list.remove(index);
        };
    }
// Some random text 
    public static void main (String []args){
        System.out.println("Address Book");
        System.out.println("Testing commit again");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }
}
