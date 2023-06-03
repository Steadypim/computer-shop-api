package dev.steadypim.computershopapi.laptop;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/computers/laptop")
@RequiredArgsConstructor
public class LaptopController {

    private final LaptopService service;

    @GetMapping
    public List<LaptopDto> getAllLaptops(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LaptopDto getLaptopById(@PathVariable("id") Long id){
        return service.getOne(id);
    }

    @PostMapping
    public ResponseEntity<Void> saveLaptop(@RequestBody LaptopDto dto){
        Laptop savedLaptop = service.save(dto);
        if (savedLaptop != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateLaptop(
            @PathVariable("id") Long id, @RequestBody LaptopDto dto){
        Laptop updatedLaptop = service.update(id, dto);
        if(updatedLaptop != null){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
