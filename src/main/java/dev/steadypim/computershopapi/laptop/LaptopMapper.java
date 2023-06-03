package dev.steadypim.computershopapi.laptop;

import org.springframework.stereotype.Component;

@Component
public class LaptopMapper {

    public LaptopDto toDto(Laptop entity){
        LaptopDto laptopDto = new LaptopDto();

        laptopDto.setSerialNumber(entity.getSerialNumber());
        laptopDto.setManufacturer(entity.getManufacturer());
        laptopDto.setPrice(entity.getPrice());
        laptopDto.setQuantity(entity.getQuantity());
        laptopDto.setScreenSize(entity.getScreenSize());

        return laptopDto;
    }

    public Laptop toEntity(LaptopDto dto){
        Laptop laptop = new Laptop();

        laptop.setSerialNumber(dto.getSerialNumber());
        laptop.setManufacturer(dto.getManufacturer());
        laptop.setPrice(dto.getPrice());
        laptop.setQuantity(dto.getQuantity());
        laptop.setScreenSize(dto.getScreenSize());

        return laptop;
    }
}
