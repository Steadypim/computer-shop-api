package dev.steadypim.computershopapi.laptop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LaptopService {

    private final LaptopRepository repository;
    private final LaptopMapper mapper;

    public LaptopDto getOne(Long id){
        Optional<Laptop> laptopOptional = repository.findById(id);

        if(laptopOptional.isPresent()){
            Laptop laptop = laptopOptional.get();
            return mapper.toDto(laptop);
        }else {
            throw new IllegalArgumentException("Laptop not found with id: " + id);
        }
    }

    public List<LaptopDto> getAll(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Laptop save(LaptopDto dto){
        return repository.save(mapper.toEntity(dto));
    }

    @Transactional
    public Laptop update(Long id, LaptopDto dto){
        Optional<Laptop> laptopOptional = repository.findById(id);

        if(laptopOptional.isPresent()){
            Laptop laptop = laptopOptional.get();

            laptop.setQuantity(dto.getQuantity());
            laptop.setManufacturer(dto.getManufacturer());
            laptop.setPrice(dto.getPrice());
            laptop.setSerialNumber(dto.getSerialNumber());
            laptop.setScreenSize(dto.getScreenSize());

            return repository.save(laptop);
        }else {
            throw new IllegalArgumentException("Laptop not found with id: " + id);
        }
    }
}
