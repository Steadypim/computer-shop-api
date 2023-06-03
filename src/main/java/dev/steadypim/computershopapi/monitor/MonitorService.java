package dev.steadypim.computershopapi.monitor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MonitorService {

    private final MonitorRepository repository;
    private final MonitorMapper mapper;

    public MonitorDto getOne(Long id){
        Optional<Monitor> monitorOptional = repository.findById(id);

        if(monitorOptional.isPresent()){
            Monitor monitor = monitorOptional.get();
            return mapper.toDto(monitor);
        }else {
            throw new IllegalArgumentException("Monitor not found with id: " + id);
        }
    }

    public List<MonitorDto> getAll(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Monitor save(MonitorDto dto){
        return repository.save(mapper.toEntity(dto));

    }

    @Transactional
    public Monitor update(Long id, MonitorDto dto){
        Optional<Monitor> monitorOptional = repository.findById(id);

        if(monitorOptional.isPresent()){
            Monitor monitor = monitorOptional.get();

            monitor.setQuantity(dto.getQuantity());
            monitor.setManufacturer(dto.getManufacturer());
            monitor.setPrice(dto.getPrice());
            monitor.setSerialNumber(dto.getSerialNumber());
            monitor.setDiagonal(dto.getDiagonal());

            return repository.save(monitor);
        }else {
            throw new IllegalArgumentException("Monitor not found with id: " + id);
        }
    }
}
