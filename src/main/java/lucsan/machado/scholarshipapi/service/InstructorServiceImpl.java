package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Instructor;
import lucsan.machado.scholarshipapi.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor findById(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Long id, Instructor newInstructor) {
        Instructor existingInstructor = instructorRepository.findById(id).orElse(null);

        if (existingInstructor != null) {
            existingInstructor.setName(newInstructor.getName());
            existingInstructor.setEmail(newInstructor.getEmail());

            return instructorRepository.save(existingInstructor);
        } else {
            return null;
        }
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }

}
