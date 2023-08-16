package lucsan.machado.scholarshipapi.repository;

import lucsan.machado.scholarshipapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import lucsan.machado.scholarshipapi.entity.ScholarshipClass;
import java.util.List;
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByScholarshipClass(ScholarshipClass scholarshipClass);
}
