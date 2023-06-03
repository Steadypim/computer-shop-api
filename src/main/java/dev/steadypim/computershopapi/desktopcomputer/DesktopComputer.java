package dev.steadypim.computershopapi.desktopcomputer;

import dev.steadypim.computershopapi.baseentity.BaseComputerEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "desktop_computer")
@Data
public class DesktopComputer extends BaseComputerEntity {
    @Enumerated(EnumType.STRING)
    private DesktopComputerFormFactor formFactor;
}
