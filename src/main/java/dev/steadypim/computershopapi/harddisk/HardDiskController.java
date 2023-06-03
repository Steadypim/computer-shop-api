package dev.steadypim.computershopapi.harddisk;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/computers/hard-disk")
@RequiredArgsConstructor
public class HardDiskController {

    private final HardDiskService service;

    @GetMapping
    public List<HardDiskDto> getAllHardDisks(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public HardDiskDto getHardDiskById(@PathVariable("id") Long id){
        return service.getOne(id);
    }

    @PostMapping
    public ResponseEntity<Void> saveHardDisk(@RequestBody HardDiskDto dto){
        HardDisk savedHardDisk = service.save(dto);
        if (savedHardDisk != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateHardDisk(
            @PathVariable("id") Long id, @RequestBody HardDiskDto dto){
        HardDisk updatedHardDisk = service.update(id, dto);
        if(updatedHardDisk != null){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
