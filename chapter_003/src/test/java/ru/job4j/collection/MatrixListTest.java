package ru.job4j.collection;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixListTest {

    @Test
    public void whenMatrixNumbers() {
       Integer[][] matrix = {
               {1, 2, 3},
               {4, 5, 6}
       };
       List<Integer> sum = MatrixList.number(matrix);
       List<Integer> list = List.of(
               1, 2, 3, 4, 5, 6
       );

       assertThat(sum, is(list));
     }

     @Test
    public void whenMatrixTurnToTheList() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        );
        List<Integer> result = MatrixList.matrixAtList(matrix);
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6
        );
        assertThat(result, is(expected));
      }
}
