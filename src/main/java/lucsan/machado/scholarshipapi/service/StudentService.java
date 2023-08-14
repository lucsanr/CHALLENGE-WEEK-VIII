package lucsan.machado.scholarshipapi.service;

import lucsan.machado.scholarshipapi.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student findById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
