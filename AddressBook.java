import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddy1;

    public AddressBook(){
        buddy1 = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddy1.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddy1.remove(buddy);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book!");
    }

}
