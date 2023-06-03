package dev.steadypim.computershopapi.monitor;

import dev.steadypim.computershopapi.baseentity.BaseComputerDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MonitorDto extends BaseComputerDto {
    private double diagonal;
}
