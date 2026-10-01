import java.util.ArrayList;

//this is edited from GitHub for Lab3 

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
        BuddyInfo buddy2 = new BuddyInfo("Jungkook", "123 Korea", "613213321");
        AddressBook address1 = new AddressBook();
        address1.addBuddy(buddy2);
        address1.removeBuddy(buddy2);
    }

}
