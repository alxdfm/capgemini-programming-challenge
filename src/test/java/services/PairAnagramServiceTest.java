package services;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairAnagramServiceTest {

    @Test
    public void anagram() {
        PairAnagramService pas = new PairAnagramService();
        assertEquals(1, pas.anagram("ifassz"));
        assertEquals(2, pas.anagram("ovo"));
        assertEquals(3, pas.anagram("ifailuhkqq"));
        assertEquals(4, pas.anagram("ifailauqhk"));
        assertEquals(5, pas.anagram("ifaailquqhk"));
    }
}