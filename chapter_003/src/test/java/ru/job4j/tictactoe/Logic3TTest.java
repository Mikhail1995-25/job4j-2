package ru.job4j.tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class Logic3TTest {

    @Test
    public void whenHasXWinner() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasOWinner() {
        Figure3T[][] table = {
                {new Figure3T(false), new Figure3T(), new Figure3T()},
                {new Figure3T(false), new Figure3T(true), new Figure3T()},
                {new Figure3T(false), new Figure3T(), new Figure3T(true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasGap() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true)}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(true));
    }

    @Test
    public void whenHasHorizontalXWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true), new Figure3T(true), new Figure3T(true)},
                {new Figure3T(), new Figure3T(), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasVerticalXWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true)},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(true), new Figure3T(), new Figure3T()}
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }
}
