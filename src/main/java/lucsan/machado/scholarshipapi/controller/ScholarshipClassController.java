package lucsan.machado.scholarshipapi.controller;

import lucsan.machado.scholarshipapi.entity.ScholarshipClass;
import lucsan.machado.scholarshipapi.service.ScholarshipClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ScholarshipClassController {

    private final ScholarshipClassService scholarshipClassService;

    @Autowired
    public ScholarshipClassController(ScholarshipClassService scholarshipClassService) {
        this.scholarshipClassService = scholarshipClassService;
    }

    @GetMapping
    public List<ScholarshipClass> getAllClasses() {
        return scholarshipClassService.getAllClasses();
    }

    @GetMapping("/{id}")
    public ScholarshipClass getClassById(@PathVariable Long id) {
        return scholarshipClassService.findById(id);
    }

    @PostMapping
    public ScholarshipClass createClass(@RequestBody ScholarshipClass scholarshipClass) {
        return scholarshipClassService.createClass(scholarshipClass);
    }

    @PutMapping("/{id}")
    public ScholarshipClass updateClass(@PathVariable Long id, @RequestBody ScholarshipClass scholarshipClass) {
        return scholarshipClassService.updateClass(id, scholarshipClass);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        scholarshipClassService.deleteClass(id);
    }
}
