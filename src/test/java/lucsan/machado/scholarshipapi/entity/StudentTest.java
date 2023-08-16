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
import lucsan.machado.scholarshipapi.entity.Student;
import lucsan.machado.scholarshipapi.entity.Squad;

public class StudentTest {

    @InjectMocks
    private Student student;

    @Mock
    private ScholarshipClass scholarshipClass;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test
    public void testName() {
        String name = "John Doe";
        student.setName(name);
        assertEquals(name, student.getName());
    }

    @Test
    public void testEmail() {
        String email = "john@example.com";
        student.setEmail(email);
        assertEquals(email, student.getEmail());
    }

    @Test
    public void testScholarshipClass() {
        student.setScholarshipClass(scholarshipClass);
        assertEquals(scholarshipClass, student.getScholarshipClass());
    }

    @Test
    public void testSquads() {
        List<Squad> squads = new ArrayList<>();
        Squad squad1 = new Squad();
        Squad squad2 = new Squad();
        squads.add(squad1);
        squads.add(squad2);

        student.setSquads(squads);

        assertEquals(squads, student.getSquads());
        assertEquals(2, student.getSquads().size());
    }
}
