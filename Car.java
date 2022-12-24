package Pewarisan3;

public class Car extends RegisteredVehicle {

String Merek;

public Car(String tipeKendaraan, int jmlRoda, String platNomor, String Merek) {
super(tipeKendaraan, jmlRoda, platNomor);
this.Merek = Merek;
}    
public String getMerek() {return Merek;}
public void viewCar(){
System.out.print("Car: "+super.getTipeKendaraan());
System.out.print("Car: "+super.getPlatNomor());
System.out.println("Car: "+ Merek);
}

}
