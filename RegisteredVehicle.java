package Pewarisan3;

public class RegisteredVehicle extends Vehicle {

String platNomor;
    
public RegisteredVehicle(String tipeKendaraan, int jmlRoda, String platNomor) {
super(tipeKendaraan, jmlRoda);
this.platNomor = platNomor;
}
public String getPlatNomor() {return platNomor;}
public void viewRegisteredVehicle(){
System.out.print("RegisteredVehicle "+platNomor);
System.out.print(": " + super.getTipeKendaraan());
System.out.println("= "+ super.getJmlRoda());

}

    
}
