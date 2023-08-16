import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import lucsan.machado.scholarshipapi.entity.ScholarshipClass;
import lucsan.machado.scholarshipapi.entity.Squad;
import lucsan.machado.scholarshipapi.entity.Student;

public class SquadTest {

    @InjectMocks
    private Squad squad;

    @Mock
    private ScholarshipClass scholarshipClass;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        squad.setId(id);
        assertEquals(id, squad.getId());
    }

    @Test
    public void testScholarshipClass() {
        squad.setScholarshipClass(scholarshipClass);
        assertEquals(scholarshipClass, squad.getScholarshipClass());
    }

    @Test
    public void testStudents() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        students.add(student1);
        students.add(student2);

        squad.setStudents(students);

        assertEquals(students, squad.getStudents());
        assertEquals(2, squad.getStudents().size());
    }

    @Test
    public void testName() {
        String name = "Squad A";
        squad.setName(name);
        assertEquals(name, squad.getName());
    }

    @Test
    public void testAddStudent() {
        Student student = new Student();

        for (int i = 0; i < 4; i++) {
            squad.addStudent(student);
            assertEquals(i + 1, squad.getStudents().size());
            assertEquals(squad, student.getSquads().get(0));
        }

        assertThrows(IllegalStateException.class, () -> squad.addStudent(student));
    }
}
