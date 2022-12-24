package Pewarisan3;

public class Cycle extends Vehicle {

String jenis;

public Cycle(String tipeKendaraan, int jmlRoda, String jenis) {
super(tipeKendaraan, jmlRoda);
this.jenis = jenis;
}
public String getJenis() {return jenis;}
public void viewCycle(){
System.out.print("Cycle: "+ super.getTipeKendaraan());
System.out.print("Cycle: "+ super.getJmlRoda());
System.out.println("Jenis: "+ jenis);
}
    
}
