package lucsan.machado.scholarshipapi.controller;

import lucsan.machado.scholarshipapi.entity.ScholarshipClass;
import lucsan.machado.scholarshipapi.entity.Student;
import lucsan.machado.scholarshipapi.service.ScholarshipClassService;
import lucsan.machado.scholarshipapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/classes")
public class ScholarshipClassController {

    private final ScholarshipClassService scholarshipClassService;
    private final StudentService studentService;

    @Autowired
    public ScholarshipClassController(
            ScholarshipClassService scholarshipClassService,
            StudentService studentService
    ) {
        this.scholarshipClassService = scholarshipClassService;
        this.studentService = studentService;
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

    @GetMapping("/{id}/members")
    public ResponseEntity<Object> getClassAndMembers(@PathVariable Long id) {
        ScholarshipClass scholarshipClass = scholarshipClassService.findById(id);

        if (scholarshipClass == null) {
            return ResponseEntity.notFound().build();
        }

        List<Student> members = studentService.getStudentsByScholarshipClass(scholarshipClass);

        Map<String, Object> response = new HashMap<>();
        response.put("class", scholarshipClass);
        response.put("members", members);

        return ResponseEntity.ok(response);
    }
}
