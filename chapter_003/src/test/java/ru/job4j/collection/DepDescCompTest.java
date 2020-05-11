package ru.job4j.collection;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rs1 = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rs1, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rs1 = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rs1, lessThan(0));
    }
}
