package Creational.Builder;

public class CommissionDTOBusiness implements CommissionDTO{

    private String description;
    private Client client;
    private Vehicle vehicle;

    public CommissionDTOBusiness(String description, Client client, Vehicle vehicle) {
        this.description = description;
        this.client = client;
        this.vehicle = vehicle;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "CommissionDTOBusiness{" +
                "description='" + description + '\'' +
                ", client=" + client +
                ", vehicle=" + vehicle +
                '}';
    }
}
