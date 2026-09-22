public class BuddyInfo {


    public String name;
    public String address;
    public String phoneNumber;

    private BuddyInfo(){

        this(null, null, null);

    }

    BuddyInfo(String name, String address, String phoneNumber){

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;


    }

    String getName(BuddyInfo test1){

        return name;

    }

    public static void main(String[] args){

        System.out.println("Hello World!");

        BuddyInfo test1 = new BuddyInfo("Manaal Inam", "123 BTS Lane", "6132612052");
        System.out.print("Hello " + test1.getName(test1));

    }






}
