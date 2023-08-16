package lucsan.machado.scholarshipapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "scholarship_classes")
public class ScholarshipClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String className;


    public enum ClassStatus {
        WAITING, STARTED, FINISHED
    }

    @Enumerated(EnumType.STRING)
    public ClassStatus status;

    public String startDate;
    public String endDate;

    @OneToMany(mappedBy = "scholarshipClass")
    public List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "scholarshipClass")
    public List<Squad> squads = new ArrayList<>();

    @OneToOne
    public Coordinator coordinator;

    @OneToOne
    public ScrumMaster scrumMaster;

    @ManyToOne
    public Instructor instructor1;

    @ManyToOne
    public Instructor instructor2;

    @ManyToOne
    public Instructor instructor3;

    public ScholarshipClass() {
        status = ClassStatus.WAITING;
    }

    public void addStudent(Student student) {
        if (status == ClassStatus.WAITING && students.size() < 30) {
            students.add(student);
            student.setScholarshipClass(this);
        } else {
            throw new IllegalStateException("Cannot add student. Class is either full or not in waiting status.");
        }
    }

    public void finishClass() {
        if (status == ClassStatus.STARTED) {
            status = ClassStatus.FINISHED;
            endDate = LocalDate.now().toString();
        } else {
            throw new IllegalStateException("Cannot finish class. Class is not in the started state.");
        }
    }

    public void organizeSquads() {
        if (status == ClassStatus.STARTED) {
            List<Student> studentsCopy = new ArrayList<>(students);
            squads.clear();

            while (!studentsCopy.isEmpty()) {
                Squad squad = new Squad();
                for (int i = 0; i < Math.min(5, studentsCopy.size()); i++) {
                    Student student = studentsCopy.remove(0);
                    squad.addStudent(student);
                }
                squads.add(squad);
            }


            int squadIndex = 0;
            for (Student student : studentsCopy) {
                squads.get(squadIndex).addStudent(student);
                squadIndex = (squadIndex + 1) % squads.size();
            }


        } else {
            throw new IllegalStateException("Cannot organize squads. Class is not in the started state.");
        }
    }

    public void startClass(Coordinator coordinator, ScrumMaster scrumMaster,
                           Instructor instructor1, Instructor instructor2, Instructor instructor3) {
        if (status == ClassStatus.WAITING && coordinator != null && scrumMaster != null &&
                instructor1 != null && instructor2 != null && instructor3 != null) {
            this.coordinator = coordinator;
            this.scrumMaster = scrumMaster;
            this.instructor1 = instructor1;
            this.instructor2 = instructor2;
            this.instructor3 = instructor3;
            status = ClassStatus.STARTED;
            startDate = LocalDate.now().toString();
        } else {
            throw new IllegalStateException("Cannot start class. Class is not in the waiting state or not all roles are assigned.");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClassStatus getStatus() {
        return status;
    }

    public void setStatus(ClassStatus status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
