package Pewarisan3;

public class Main {
public static void main(String[] args) {
Vehicle Ve = new Vehicle("Mobil Jeep", 4);
Ve.view();

RegisteredVehicle Rv = new RegisteredVehicle("Mobil Jeep", 4, "BE 7900 RF");
Rv.view();
Rv.viewRegisteredVehicle();

Cycle Cy = new Cycle("Skuter", 2, "Sepeda Roda Dua");
Cy.view();
Cy.viewCycle();

Motorbike Mb = new Motorbike("Skuter", 2, "BE 4121 EF", "Fazzio");
Mb.view();
Mb.viewMotorbike();

Car Ca = new Car("Mobil Jeep", 4, "BE 7900 RF", "Jeep Wrangler");
Ca.view();
Ca.viewCar();
}
    
}
