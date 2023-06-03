package dev.steadypim.computershopapi.desktopcomputer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopComputerRepository extends JpaRepository<DesktopComputer, Long> {
}
