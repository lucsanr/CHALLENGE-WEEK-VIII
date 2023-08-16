package lucsan.machado.scholarshipapi.controller;

import lucsan.machado.scholarshipapi.entity.Squad;
import lucsan.machado.scholarshipapi.service.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/squads")
public class SquadController {

    private final SquadService squadService;

    @Autowired
    public SquadController(SquadService squadService) {
        this.squadService = squadService;
    }

    @GetMapping
    public List<Squad> getAllSquads() {
        return squadService.getAllSquads();
    }

    @GetMapping("/{id}")
    public Squad getSquadById(@PathVariable Long id) {
        return squadService.findById(id);
    }

    @PostMapping
    public Squad createSquad(@RequestBody Squad squad) {
        return squadService.createSquad(squad);
    }

    @PutMapping("/{id}")
    public Squad updateSquad(@PathVariable Long id, @RequestBody Squad squad) {
        return squadService.updateSquad(id, squad);
    }

    @DeleteMapping("/{id}")
    public void deleteSquad(@PathVariable Long id) {
        squadService.deleteSquad(id);
    }
}
