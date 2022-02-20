package services;

import org.junit.Test;

import static org.junit.Assert.*;

public class StairsServiceTest {

    @Test
    public void stairsDraw() {
        StairsService ss = new StairsService();
        assertEquals(   "*\n", ss.stairsDraw(1));

        assertEquals(   "     *\n" +
                                "    **\n" +
                                "   ***\n" +
                                "  ****\n" +
                                " *****\n" +
                                "******\n", ss.stairsDraw(6));

        assertEquals(   "         *\n" +
                                "        **\n" +
                                "       ***\n" +
                                "      ****\n" +
                                "     *****\n" +
                                "    ******\n" +
                                "   *******\n" +
                                "  ********\n" +
                                " *********\n" +
                                "**********\n", ss.stairsDraw(10));
    }
}