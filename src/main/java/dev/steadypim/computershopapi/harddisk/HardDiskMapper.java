package dev.steadypim.computershopapi.harddisk;

import org.springframework.stereotype.Component;

@Component
public class HardDiskMapper {

    public HardDiskDto toDto(HardDisk entity){
        HardDiskDto hardDiskDto = new HardDiskDto();

        hardDiskDto.setSerialNumber(entity.getSerialNumber());
        hardDiskDto.setManufacturer(entity.getManufacturer());
        hardDiskDto.setQuantity(entity.getQuantity());
        hardDiskDto.setPrice(entity.getPrice());
        hardDiskDto.setCapacity(entity.getCapacity());

        return hardDiskDto;
    }

    public HardDisk toEntity(HardDiskDto dto){
        HardDisk hardDisk = new HardDisk();

        hardDisk.setSerialNumber(dto.getSerialNumber());
        hardDisk.setManufacturer(dto.getManufacturer());
        hardDisk.setQuantity(dto.getQuantity());
        hardDisk.setPrice(dto.getPrice());
        hardDisk.setCapacity(dto.getCapacity());

        return hardDisk;
    }
}
