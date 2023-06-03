package dev.steadypim.computershopapi.monitor;

import dev.steadypim.computershopapi.baseentity.BaseComputerEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "monitor")
@Data
@EqualsAndHashCode(callSuper = true)
public class Monitor extends BaseComputerEntity {
    private double diagonal;
}
