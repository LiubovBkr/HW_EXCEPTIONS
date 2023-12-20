import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopRepositoryTest {

    @Test
    public void testSuccessfulRemoval() {
        ShopRepository repository = new ShopRepository();
        Product product = new Product(1, "Test Product", 100);
        repository.add(product);

        repository.removeById(1);

        assertEquals(0, repository.findAll().length);
    }

    @Test
    public void testNotFoundExceptionOnRemoval() {
        ShopRepository repository = new ShopRepository();


        assertThrows(NotFoundException.class, () -> repository.removeById(1));
    }
}