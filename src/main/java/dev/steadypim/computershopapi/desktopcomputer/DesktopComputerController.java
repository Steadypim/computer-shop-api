package dev.steadypim.computershopapi.desktopcomputer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/computers/desktop")
@RequiredArgsConstructor
public class DesktopComputerController {

    private final DesktopComputerService service;

    @GetMapping
    public List<DesktopComputerDto> getAllDesktopComputers(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DesktopComputerDto getDesktopComputerById(@PathVariable("id") Long id){
        return service.getOne(id);
    }

    @PostMapping
    public ResponseEntity<Void> saveDesktopComputer(@RequestBody DesktopComputerDto dto){
        DesktopComputer savedComputer = service.save(dto);
        if (savedComputer != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDesktopComputer(
            @PathVariable("id") Long id, @RequestBody DesktopComputerDto dto){
        DesktopComputer updatedComputer = service.update(id, dto);
        if(updatedComputer != null){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
