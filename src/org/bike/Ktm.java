package org.bike;

public class Ktm implements Bike {
 public void cost() {
System.out.println("cost in 250000");	

}
 public void speed() {
System.out.println("speed is 210kmph");
}

 public static void main(String[] args) {
	Ktm a = new Ktm();
	a.cost();
	a.speed();
}
	}
	


