package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.ScholarshipClass;

import java.util.List;

public interface ScholarshipClassService {
    List<ScholarshipClass> getAllClasses();
    ScholarshipClass findById(Long id);
    ScholarshipClass createClass(ScholarshipClass scholarshipClass);
    ScholarshipClass updateClass(Long id, ScholarshipClass scholarshipClass);
    void deleteClass(Long id);
}
