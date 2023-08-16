package lucsan.machado.scholarshipapi.controller;

import lucsan.machado.scholarshipapi.entity.Coordinator;
import lucsan.machado.scholarshipapi.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coordinators")
public class CoordinatorController {

    private final CoordinatorService coordinatorService;

    @Autowired
    public CoordinatorController(CoordinatorService coordinatorService) {
        this.coordinatorService = coordinatorService;
    }

    @GetMapping
    public List<Coordinator> getAllCoordinators() {
        return coordinatorService.getAllCoordinators();
    }

    @GetMapping("/{id}")
    public Coordinator getCoordinatorById(@PathVariable Long id) {
        return coordinatorService.findById(id);
    }

    @PostMapping
    public Coordinator createCoordinator(@RequestBody Coordinator coordinator) {
        return coordinatorService.createCoordinator(coordinator);
    }

    @PutMapping("/{id}")
    public Coordinator updateCoordinator(@PathVariable Long id, @RequestBody Coordinator coordinator) {
        return coordinatorService.updateCoordinator(id, coordinator);
    }

    @DeleteMapping("/{id}")
    public void deleteCoordinator(@PathVariable Long id) {
        coordinatorService.deleteCoordinator(id);
    }
}
