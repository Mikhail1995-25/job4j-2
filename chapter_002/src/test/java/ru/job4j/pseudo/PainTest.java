package ru.job4j.pseudo;
import org.junit.Test;
import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Mikhail Pushkarev
 * @version 05.04.2020
 * @since 0.1
 */
public class PainTest {

    @Test
    public void whenDrawSquare () {
      //Получаем ссылку на стандартный вывод в консоль.
      PrintStream stdout = System.out;
      //Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        //Выполняем действия пишущие в консоль.
        new Paint().draw(new Square());
        //Проверяем результат вычесления.
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add("++++++")
                        .add("+    +")
                        .add("+    +")
                        .add("++++++")
                        .add(System.lineSeparator())
                        .toString()
                )
        );
        //Возвращаем обратно стандартный вывод на консоль.
        System.setOut(stdout);

    }
}
