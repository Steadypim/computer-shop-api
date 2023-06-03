package dev.steadypim.computershopapi.laptop;

import dev.steadypim.computershopapi.baseentity.BaseComputerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class LaptopDto extends BaseComputerDto {
    private LaptopScreenSize screenSize;
}
