package dev.steadypim.computershopapi.monitor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/computers/monitor")
@RequiredArgsConstructor
public class MonitorController {

    private final MonitorService service;

    @GetMapping
    public List<MonitorDto> getAllMonitors(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MonitorDto getMonitorById(@PathVariable("id") Long id){
        return service.getOne(id);
    }

    @PostMapping
    public ResponseEntity<Void> saveMonitor(@RequestBody MonitorDto dto){
        Monitor savedMonitor = service.save(dto);
        if (savedMonitor != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMonitor(
            @PathVariable("id") Long id, @RequestBody MonitorDto dto){
        Monitor updatedMonitor = service.update(id, dto);
        if(updatedMonitor != null){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
