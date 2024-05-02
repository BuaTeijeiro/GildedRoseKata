package edu.badpals.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NormalItemTest {

    @Test
    public void NormalItemGetters(){
        NormalItem item = new NormalItem("Arroz", 100, 50);
        assertEquals("Arroz", item.getName());
        assertEquals(100, item.getSellIn());
        assertEquals(50, item.getQuality());
    }
}
