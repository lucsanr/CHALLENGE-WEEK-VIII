package lucsan.machado.scholarshipapi.controller;

import lucsan.machado.scholarshipapi.entity.ScrumMaster;
import lucsan.machado.scholarshipapi.service.ScrumMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/scrum-masters")
public class ScrumMasterController {

    private final ScrumMasterService scrumMasterService;

    @Autowired
    public ScrumMasterController(ScrumMasterService scrumMasterService) {
        this.scrumMasterService = scrumMasterService;
    }

    @GetMapping
    public List<ScrumMaster> getAllScrumMasters() {
        return scrumMasterService.getAllScrumMasters();
    }

    @GetMapping("/{id}")
    public ScrumMaster getScrumMasterById(@PathVariable Long id) {
        return scrumMasterService.findById(id);
    }

    @PostMapping
    public ScrumMaster createScrumMaster(@RequestBody ScrumMaster scrumMaster) {
        return scrumMasterService.createScrumMaster(scrumMaster);
    }

    @PutMapping("/{id}")
    public ScrumMaster updateScrumMaster(@PathVariable Long id, @RequestBody ScrumMaster scrumMaster) {
        return scrumMasterService.updateScrumMaster(id, scrumMaster);
    }

    @DeleteMapping("/{id}")
    public void deleteScrumMaster(@PathVariable Long id) {
        scrumMasterService.deleteScrumMaster(id);
    }
}
