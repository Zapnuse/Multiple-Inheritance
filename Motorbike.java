package Pewarisan3;

public class Motorbike extends RegisteredVehicle {

String Merek;

public Motorbike(String tipeKendaraan, int jmlRoda, String platNomor, String Merek) {
super(tipeKendaraan, jmlRoda, platNomor);
this.Merek = Merek;
}
public String getMerek() {return Merek;}
public void viewMotorbike(){
System.out.print("Motor Bike: "+ super.getTipeKendaraan());
System.out.print("Motor Bike: "+ super.getPlatNomor());
System.out.println("Merek Motor: " + Merek);
}  
}
