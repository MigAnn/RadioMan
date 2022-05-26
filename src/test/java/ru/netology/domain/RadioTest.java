package ru.netology.domain;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void currentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        int actual = radio.getCurrentRadioStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void maxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    void minStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    void upperBoundMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void upperBoundMaxStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.nextStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    void upperBoundMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void upperBoundMinStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prevStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void upperBoundMinStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.prevStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        int actual = radio.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void highVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.highVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void highVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.highVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void highVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.highVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
    void quietVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.quietVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    void quietVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.quietVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    void quietVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.quietVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(actual, expected);
    }
}