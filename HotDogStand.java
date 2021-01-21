public class HotDogStand{
  public int hotDogsLeft;

  public void feedPerson(Person p){
    if(hotDogsLeft > 0 && p.hungry) {
      p.hungry = false;
      hotDogsLeft--;
    } else if(!p.hungry) {
      System.out.println("You are not hungry.");
    } else if(hotDogsLeft <= 0){
      System.out.println("No hotdogs left , come back tomorrow!");  
    }
  }
}
