package Pewarisan3;

public class Vehicle {
String tipeKendaraan;
int jmlRoda;   

public Vehicle(String tipeKendaraan, int jmlRoda) {
this.tipeKendaraan = tipeKendaraan;
this.jmlRoda = jmlRoda;
}
public String getTipeKendaraan() {return tipeKendaraan;}
public int getJmlRoda() {return jmlRoda;}
public void view() {
System.out.println("Vehicle: "+tipeKendaraan+" - " + jmlRoda);
}

}


