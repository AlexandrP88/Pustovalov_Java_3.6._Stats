package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = servise.calculateSum(companySales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateAverage() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = servise.calculateAverage(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMaxSales() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = servise.findMaxSales(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindMinSales() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = servise.findMinSales(companySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldfindSalesBelowAverage() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = servise.findSalesBelowAverage(companySales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldfindSalesAboveAverage() {
        StatsService servise = new StatsService();

        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = servise.findSalesAboveAverage(companySales);

        assertEquals(expected, actual);
    }

}