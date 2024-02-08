package Creational.Builder;

import java.math.BigDecimal;

public class CommissionDTOBusinessBuilder implements CommissionDTOBuilder {

    private String description;
    private Client client;
    private Vehicle vehicle;
    private BigDecimal cost;
    private String status;
    private String currency;
    private String department;
    private CommissionDTOBusiness builder;

    @Override
    public CommissionDTOBuilder buildClient(Client client) {
        this.client = client;
        return this;
    }

    @Override
    public CommissionDTOBuilder buildVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    @Override
    public CommissionDTOBuilder buildDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public CommissionDTOBuilder buildCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public CommissionDTOBuilder buildDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public CommissionDTOBusiness build() {
        builder = new CommissionDTOBusiness(description, client, vehicle);
        return builder;
    }

}
