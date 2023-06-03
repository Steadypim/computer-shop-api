package dev.steadypim.computershopapi.harddisk;

import dev.steadypim.computershopapi.baseentity.BaseComputerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HardDiskDto extends BaseComputerDto {
    private double capacity;
}
