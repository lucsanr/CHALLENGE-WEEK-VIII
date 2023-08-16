package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> getAllInstructors();
    Instructor findById(Long id);
    Instructor createInstructor(Instructor instructor);
    Instructor updateInstructor(Long id, Instructor instructor);
    void deleteInstructor(Long id);
}
