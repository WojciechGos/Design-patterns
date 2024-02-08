package Creational.Builder;

public interface CommissionDTOBuilder {

    CommissionDTOBuilder buildClient(Client client);
    CommissionDTOBuilder buildVehicle(Vehicle vehicle);
    CommissionDTOBuilder buildDescription(String description);
    CommissionDTOBuilder buildCurrency(String currency);
    CommissionDTOBuilder buildDepartment(String department );
    CommissionDTOBusiness build();


}
