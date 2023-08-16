import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import lucsan.machado.scholarshipapi.entity.*;

public class ScholarshipClassTest {

    @InjectMocks
    private ScholarshipClass scholarshipClass;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        scholarshipClass.setId(id);
        assertEquals(id, scholarshipClass.getId());
    }

    @Test
    public void testClassName() {
        String className = "Computer Science Class";
        scholarshipClass.setClassName(className);
        assertEquals(className, scholarshipClass.getClassName());
    }

    @Test
    public void testStatus() {
        ScholarshipClass.ClassStatus status = ScholarshipClass.ClassStatus.WAITING;
        scholarshipClass.setStatus(status);
        assertEquals(status, scholarshipClass.getStatus());
    }

    @Test
    public void testStartDate() {
        String startDate = "2023-08-01";
        scholarshipClass.setStartDate(startDate);
        assertEquals(startDate, scholarshipClass.getStartDate());
    }

    @Test
    public void testEndDate() {
        String endDate = "2023-12-01";
        scholarshipClass.setEndDate(endDate);
        assertEquals(endDate, scholarshipClass.getEndDate());
    }

    @Test
    public void testAddStudent() {
        Student student = mock(Student.class);
        scholarshipClass.setStatus(ScholarshipClass.ClassStatus.WAITING);
        when(student.getScholarshipClass()).thenReturn(null);

        scholarshipClass.addStudent(student);

        assertEquals(1, scholarshipClass.getStudents().size());
        verify(student).setScholarshipClass(scholarshipClass);
    }

}
