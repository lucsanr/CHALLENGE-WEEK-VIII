package lucsan.machado.scholarshipapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ScholarshipClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "scholarshipClass")
    private List<Student> students;

    @OneToOne
    private Coordinator coordinator;

    @OneToOne
    private Instructor instructor;

    @OneToOne
    private ScrumMaster scrumMaster;

    private String classStatus;
    private LocalDate classStartDate;
    private LocalDate classEndDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public LocalDate getClassStartDate() {
        return classStartDate;
    }

    public void setClassStartDate(LocalDate classStartDate) {
        this.classStartDate = classStartDate;
    }

    public LocalDate getClassEndDate() {
        return classEndDate;
    }

    public void setClassEndDate(LocalDate classEndDate) {
        this.classEndDate = classEndDate;
    }
}
