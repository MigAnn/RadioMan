package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldCreate (){
        Radio radio = new Radio();

    }
    void currentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        Radio radio1 = new Radio();
        radio1.setCurrentRadioStation(10);

        Radio radio2 = new Radio();
        radio2.setCurrentRadioStation(-10);

        Radio radio3 = new Radio();
        radio3.setCurrentRadioStation(9);
        radio3.setMaxRadioStation();

        Radio radio4 = new Radio();
        radio4.setCurrentRadioStation(7);
        radio4.setMaxRadioStation();

        Radio radio5 = new Radio();
        radio5.setCurrentRadioStation(0);
        radio5.setMinRadioStation();

        Radio radio6 = new Radio();
        radio6.setCurrentRadioStation(1);
        radio6.setMinRadioStation();

        Radio radio7= new Radio();
        radio7.setCurrentRadioStation(-1);
        radio7.setMinRadioStation();

        Radio radio8 = new Radio();
        radio8.setCurrentVolume(2);

        Radio radio9 = new Radio();
        radio9.setCurrentVolume(-1);

        Radio radio10 = new Radio();
        radio10.setCurrentVolume(111);

        Radio radio11 = new Radio();
        radio11.setCurrentVolume(99);
        radio11.setMaxVolume();

        Radio radio12 = new Radio();
        radio12.setCurrentVolume(100);
        radio12.setMaxVolume();

        Radio radio13 = new Radio();
        radio13.setCurrentVolume(111);
        radio13.setMaxVolume();

        Radio radio14 = new Radio();
        radio14.setCurrentVolume(-1);
        radio14.setMinVolume();

        Radio radio15 = new Radio();
        radio15.setCurrentVolume(0);
        radio15.setMinVolume();

        Radio radio16 = new Radio();
        radio16.setCurrentVolume(74);
        radio16.setMinVolume();



        assertEquals(2, radio.getCurrentRadioStation());
        assertEquals(0, radio1.getCurrentRadioStation());
        assertEquals(0, radio2.getCurrentRadioStation());
        assertEquals(0, radio3.getCurrentRadioStation());
        assertEquals(8, radio4.getCurrentRadioStation());
        assertEquals(9, radio5.getCurrentRadioStation());
        assertEquals(0, radio6.getCurrentRadioStation());
        assertEquals(9, radio7.getCurrentRadioStation());

        assertEquals(2, radio8.getCurrentVolume());
        assertEquals(0, radio9.getCurrentVolume());
        assertEquals(0, radio10.getCurrentVolume());
        assertEquals(100, radio11.getCurrentVolume());
        assertEquals(100, radio12.getCurrentVolume());
        assertEquals(1, radio13.getCurrentVolume());
        assertEquals(0, radio14.getCurrentVolume());
        assertEquals(0, radio15.getCurrentVolume());
        assertEquals(73, radio16.getCurrentVolume());
    }
}