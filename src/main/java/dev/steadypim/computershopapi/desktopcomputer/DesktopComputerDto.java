package dev.steadypim.computershopapi.desktopcomputer;

import dev.steadypim.computershopapi.baseentity.BaseComputerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DesktopComputerDto extends BaseComputerDto {
    private DesktopComputerFormFactor formFactor;
}
