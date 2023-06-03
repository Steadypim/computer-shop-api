package dev.steadypim.computershopapi.desktopcomputer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DesktopComputerService {

    private final DesktopComputerRepository repository;
    private final DesktopComputerMapper mapper;

    public DesktopComputerDto getOne(Long id){
        Optional<DesktopComputer> computerOptional = repository.findById(id);

        if(computerOptional.isPresent()){
            DesktopComputer desktopComputer = computerOptional.get();
            return mapper.toDto(desktopComputer);
        }else {
            throw new IllegalArgumentException("Desktop computer not found with id: " + id);
        }
    }

    public List<DesktopComputerDto> getAll(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public DesktopComputer save(DesktopComputerDto dto){
        return repository.save(mapper.toEntity(dto));
    }

    @Transactional
    public DesktopComputer update(Long id, DesktopComputerDto dto){
        Optional<DesktopComputer> computerOptional = repository.findById(id);

        if(computerOptional.isPresent()){
            DesktopComputer desktopComputer = computerOptional.get();

            desktopComputer.setQuantity(dto.getQuantity());
            desktopComputer.setManufacturer(dto.getManufacturer());
            desktopComputer.setPrice(dto.getPrice());
            desktopComputer.setSerialNumber(dto.getSerialNumber());
            desktopComputer.setFormFactor(dto.getFormFactor());

            return repository.save(desktopComputer);
        }else {
            throw new IllegalArgumentException("Desktop computer not found with id: " + id);
        }
    }
}
