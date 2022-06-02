package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void numberOfStation(){
        radio.setNumberOfStation(-4);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void numberOfStation1(){
        radio.setNumberOfStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }
    @Test
    public void numberOfStation2(){
        radio.setNumberOfStation(12);
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    void currentRadioStation() {

        radio.setCurrentRadioStation(2);

        radio.getCurrentRadioStation();

        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void maxStation() {
        radio.setCurrentRadioStation(10);

        radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void minStation() {

        radio.setCurrentRadioStation(-10);

        radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    void upperBoundMaxStation() {

        radio.setCurrentRadioStation(9);
        radio.nextStation();

        radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMaxStation1() {

        radio.setCurrentRadioStation(7);
        radio.nextStation();

        radio.getCurrentRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMinStation() {

        radio.setCurrentRadioStation(0);
        radio.prevStation();

        radio.getCurrentRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMinStation2() {

        radio.setCurrentRadioStation(1);
        radio.prevStation();

        radio.getCurrentRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void upperBoundMinStation3() {

        radio.setCurrentRadioStation(-1);
        radio.prevStation();

        radio.getCurrentRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void currentVolume() {


        radio.setCurrentVolume(2);

        radio.getCurrentVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void currentVolume2() {


        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void currentVolume3() {


        radio.setCurrentVolume(111);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void highVolume() {

        radio.setCurrentVolume(99);
        radio.highVolume();

        radio.getCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void highVolume1() {

        radio.setCurrentVolume(100);
        radio.highVolume();

        radio.getCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void highVolume2() {

        radio.setCurrentVolume(101);
        radio.highVolume();

        radio.getCurrentVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void quietVolume() {

        radio.setCurrentVolume(-1);
        radio.quietVolume();

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void quietVolume1() {

        radio.setCurrentVolume(0);
        radio.quietVolume();

        radio.getCurrentVolume();


        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void quietVolume2() {

        radio.setCurrentVolume(3);
        radio.quietVolume();

        radio.getCurrentVolume();

        assertEquals(2, radio.getCurrentVolume());
    }
}