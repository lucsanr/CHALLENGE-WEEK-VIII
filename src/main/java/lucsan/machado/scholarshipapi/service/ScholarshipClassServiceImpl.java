package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.ScholarshipClass;
import lucsan.machado.scholarshipapi.repository.ScholarshipClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarshipClassServiceImpl implements ScholarshipClassService {

    private final ScholarshipClassRepository scholarshipClassRepository;

    @Autowired
    public ScholarshipClassServiceImpl(ScholarshipClassRepository scholarshipClassRepository) {
        this.scholarshipClassRepository = scholarshipClassRepository;
    }

    @Override
    public List<ScholarshipClass> getAllClasses() {
        return scholarshipClassRepository.findAll();
    }

    @Override
    public ScholarshipClass findById(Long id) {
        return scholarshipClassRepository.findById(id).orElse(null);
    }

    @Override
    public ScholarshipClass createClass(ScholarshipClass scholarshipClass) {
        return scholarshipClassRepository.save(scholarshipClass);
    }

    @Override
    public ScholarshipClass updateClass(Long id, ScholarshipClass newClass) {

        ScholarshipClass existingClass = scholarshipClassRepository.findById(id).orElse(null);

        if (existingClass != null) {
            existingClass.setClassName(newClass.getClassName());
            existingClass.setStatus(newClass.getStatus());
            existingClass.setStartDate(newClass.getStartDate());
            existingClass.setEndDate(newClass.getEndDate());

            return scholarshipClassRepository.save(existingClass);
        } else {
            return null;
        }
    }

    @Override
    public void deleteClass(Long id) {
        scholarshipClassRepository.deleteById(id);
    }

}
