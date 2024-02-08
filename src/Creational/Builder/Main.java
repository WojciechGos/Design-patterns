package Creational.Builder;

public class Main {

    public static void main(String[] args) {
        CommissionDTOBusiness commissionDTOBusiness = new CommissionDTOBusinessBuilder()
                .buildDescription("opis")
                .buildClient(new Client("Wojciech", "Gos"))
                .buildVehicle(new Vehicle("Opel", "Astra"))
                .build();
        System.out.println(commissionDTOBusiness);
    }




}
