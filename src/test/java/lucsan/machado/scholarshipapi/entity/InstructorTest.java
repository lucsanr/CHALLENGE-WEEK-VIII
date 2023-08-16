import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import lucsan.machado.scholarshipapi.entity.*;

public class InstructorTest {

    @InjectMocks
    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        instructor.setId(id);
        assertEquals(id, instructor.getId());
    }

    @Test
    public void testName() {
        String name = "John Doe";
        instructor.setName(name);
        assertEquals(name, instructor.getName());
    }

    @Test
    public void testEmail() {
        String email = "john@example.com";
        instructor.setEmail(email);
        assertEquals(email, instructor.getEmail());
    }

}
