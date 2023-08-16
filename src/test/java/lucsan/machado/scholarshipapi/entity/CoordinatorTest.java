import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import lucsan.machado.scholarshipapi.entity.*;

public class CoordinatorTest {

    @InjectMocks
    private Coordinator coordinator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testId() {
        Long id = 1L;
        coordinator.setId(id);
        assertEquals(id, coordinator.getId());
    }

    @Test
    public void testName() {
        String name = "Jane Smith";
        coordinator.setName(name);
        assertEquals(name, coordinator.getName());
    }

    @Test
    public void testEmail() {
        String email = "jane@example.com";
        coordinator.setEmail(email);
        assertEquals(email, coordinator.getEmail());
    }

}
