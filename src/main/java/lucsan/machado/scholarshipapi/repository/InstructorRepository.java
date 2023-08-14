package lucsan.machado.scholarshipapi.repository;

import lucsan.machado.scholarshipapi.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Instructor findByName(String name);

}
