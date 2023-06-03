package dev.steadypim.computershopapi.desktopcomputer;


import org.springframework.stereotype.Component;

@Component
public class DesktopComputerMapper {

    public DesktopComputerDto toDto(DesktopComputer entity){
        DesktopComputerDto computerDto = new DesktopComputerDto();

        computerDto.setSerialNumber(entity.getSerialNumber());
        computerDto.setManufacturer(entity.getManufacturer());
        computerDto.setPrice(entity.getPrice());
        computerDto.setQuantity(entity.getQuantity());
        computerDto.setFormFactor(entity.getFormFactor());

        return computerDto;
    }

    public DesktopComputer toEntity(DesktopComputerDto dto){
        DesktopComputer desktopComputer = new DesktopComputer();

        desktopComputer.setSerialNumber(dto.getSerialNumber());
        desktopComputer.setManufacturer(dto.getManufacturer());
        desktopComputer.setPrice(dto.getPrice());
        desktopComputer.setQuantity(dto.getQuantity());
        desktopComputer.setFormFactor(dto.getFormFactor());

        return desktopComputer;
    }
}
