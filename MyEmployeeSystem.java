public class MyEmployeeSystem{
  public static void main(String[]args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    e1.name = "Jeff Jeffson";
    e1.age = 32;
    e2.name = "Greta Gretson";
    e2.age = 28;
    e1.address = "Coola gatan 420";
    System.out.println(e1.name);
    System.out.println(e2.age);

    e1.sayHello();
    e2.sayHello();
  }
}
