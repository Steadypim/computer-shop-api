package dev.steadypim.computershopapi.harddisk;

import dev.steadypim.computershopapi.baseentity.BaseComputerEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "hard_disk")
@Data
@EqualsAndHashCode(callSuper = true)
public class HardDisk extends BaseComputerEntity {
    private double capacity;
}
