package joe.wenzel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account bobsAccount = new Account("123456",  0.00,"Joe Wenzel","wenzel.joe@gmail.com", "6785078245");
        Account joesAccount = new Account("Joe","wenzel.joe@gmail.com","123456");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bill", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3= new VipCustomer("Bob", 1300.00,"bob@bob.org");
        System.out.println(person3.getName());
    }
}
