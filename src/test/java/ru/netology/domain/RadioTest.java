package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void currentRadioStation() {
        radio.setCurrentRadioStation(2);

        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void maxStation() {

        radio.setCurrentRadioStation(10);

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void minStation() {

        radio.setCurrentRadioStation(-10);

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void upperBoundMaxStation() {

        radio.setCurrentRadioStation(9);
        radio.setMaxRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMaxStation1() {

        radio.setCurrentRadioStation(7);
        radio.setMaxRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    //
    @Test
    void upperBoundMinStation() {

        radio.setCurrentRadioStation(0);
        radio.setMinRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMinStation2() {

        radio.setCurrentRadioStation(1);
        radio.setMinRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMinStation3() {

        radio.setCurrentRadioStation(-1);
        radio.setMinRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void currentVolume() {

        radio.setCurrentVolume(2);

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void currentVolume2() {

        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void currentVolume3() {

        radio.setCurrentVolume(111);

        assertEquals(0, radio.getCurrentVolume());
    }

    //
    @Test
    void highVolume() {

        radio.setCurrentVolume(99);
        radio.setMaxVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void highVolume1() {

        radio.setCurrentVolume(100);
        radio.setMaxVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void highVolume2() {

        radio.setCurrentVolume(111);
        radio.setMaxVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void quietVolume() {

        radio.setCurrentVolume(-1);
        radio.setMinVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void quietVolume1() {

        radio.setCurrentVolume(0);
        radio.setMinVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void quietVolume2() {

        radio.setCurrentVolume(3);
        radio.setMinVolume();

        assertEquals(2, radio.getCurrentVolume());
    }
}