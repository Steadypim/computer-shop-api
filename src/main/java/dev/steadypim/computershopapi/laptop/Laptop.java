package dev.steadypim.computershopapi.laptop;

import dev.steadypim.computershopapi.baseentity.BaseComputerEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "laptop")
@Data
@EqualsAndHashCode(callSuper = true)
public class Laptop extends BaseComputerEntity {
    @Enumerated(EnumType.STRING)
    private LaptopScreenSize screenSize;
}
