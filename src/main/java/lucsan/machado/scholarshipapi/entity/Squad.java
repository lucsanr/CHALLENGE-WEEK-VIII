package lucsan.machado.scholarshipapi.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "squads")
public class Squad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "scholarship_class_id")
    private ScholarshipClass scholarshipClass;

    @ManyToMany
    private List<Student> students = new ArrayList<>();


    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ScholarshipClass getScholarshipClass() {
        return scholarshipClass;
    }

    public void setScholarshipClass(ScholarshipClass scholarshipClass) {
        this.scholarshipClass = scholarshipClass;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (students.size() < 5) {
            students.add(student);
            student.getSquads().add(this);
        } else {
            throw new IllegalStateException("Cannot add student. Squad is already full.");
        }
    }
}
