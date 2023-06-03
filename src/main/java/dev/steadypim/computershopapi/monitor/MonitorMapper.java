package dev.steadypim.computershopapi.monitor;

import org.springframework.stereotype.Component;

@Component
public class MonitorMapper {

    public MonitorDto toDto(Monitor entity){
        MonitorDto monitorDto = new MonitorDto();

        monitorDto.setSerialNumber(entity.getSerialNumber());
        monitorDto.setManufacturer(entity.getManufacturer());
        monitorDto.setPrice(entity.getPrice());
        monitorDto.setQuantity(entity.getQuantity());
        monitorDto.setDiagonal(entity.getDiagonal());

        return monitorDto;
    }

    public Monitor toEntity(MonitorDto dto){
        Monitor monitor = new Monitor();

        monitor.setSerialNumber(dto.getSerialNumber());
        monitor.setManufacturer(dto.getManufacturer());
        monitor.setPrice(dto.getPrice());
        monitor.setQuantity(dto.getQuantity());
        monitor.setDiagonal(dto.getDiagonal());

        return monitor;
    }
}
