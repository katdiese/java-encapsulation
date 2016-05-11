public class Tester {

  public static void main(String[] args) {

    Time time = new Time();
    time.setHour(12);
    time.setMinute(35);
    time.setSecond(59);
    System.out.println(time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
  }

}
