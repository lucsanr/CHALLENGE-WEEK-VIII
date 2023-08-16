import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import lucsan.machado.scholarshipapi.entity.ScrumMaster;

public class ScrumMasterTest {

    @InjectMocks
    private ScrumMaster scrumMaster;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        scrumMaster.setId(id);
        assertEquals(id, scrumMaster.getId());
    }

    @Test
    public void testName() {
        String name = "John Doe";
        scrumMaster.setName(name);
        assertEquals(name, scrumMaster.getName());
    }

    @Test
    public void testEmail() {
        String email = "john@example.com";
        scrumMaster.setEmail(email);
        assertEquals(email, scrumMaster.getEmail());
    }
}
