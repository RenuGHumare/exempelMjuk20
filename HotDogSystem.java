public class HotDogSystem {
  public static void main(String[]args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();

    p1.firstName = "Vince";
    p1.lastName = "Adler";
    p1.age = 28;
    p1.hungry = true;

    p2.firstName = "Jeff";
    p2.lastName = "Jeffson";
    p2.age = 45;
    p2.hungry = false;

    p3.firstName = "Donald";
    p3.lastName = "Duck";
    p3.age = 3000;
    p3.hungry = true;

    HotDogStand h1 = new HotDogStand();
    h1.hotDogsLeft = 10;
    h1.feedPerson(p1);
    System.out.println(p1.hungry);
    h1.feedPerson(p2);
    h1.feedPerson(p3);
  }
}
