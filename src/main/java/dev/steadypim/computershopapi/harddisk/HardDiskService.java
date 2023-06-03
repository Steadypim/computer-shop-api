package dev.steadypim.computershopapi.harddisk;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HardDiskService {

    private final HardDiskRepository repository;
    private final HardDiskMapper mapper;

    public HardDiskDto getOne(Long id){
        Optional<HardDisk> hardDiskOptional = repository.findById(id);

        if(hardDiskOptional.isPresent()){
            HardDisk hardDisk = hardDiskOptional.get();
            return mapper.toDto(hardDisk);
        }else {
            throw new IllegalArgumentException("Hard disk not found with id: " + id);
        }
    }

    public List<HardDiskDto> getAll(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public HardDisk save(HardDiskDto dto){
        return repository.save(mapper.toEntity(dto));
    }

    @Transactional
    public HardDisk update(Long id, HardDiskDto dto){
        Optional<HardDisk> hardDiskOptional = repository.findById(id);

        if(hardDiskOptional.isPresent()){
            HardDisk hardDisk = hardDiskOptional.get();

            hardDisk.setQuantity(dto.getQuantity());
            hardDisk.setManufacturer(dto.getManufacturer());
            hardDisk.setPrice(dto.getPrice());
            hardDisk.setSerialNumber(dto.getSerialNumber());
            hardDisk.setCapacity(dto.getCapacity());

            return repository.save(hardDisk);
        }else {
            throw new IllegalArgumentException("Hard disk not found with id: " + id);
        }
    }
}
