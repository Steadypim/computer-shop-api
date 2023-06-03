package dev.steadypim.computershopapi.baseentity;

import lombok.Data;

@Data
public class BaseComputerDto {
    private String serialNumber;
    private String manufacturer;
    private double price;
    private int quantity;
}
