package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void changeStation() {
        radio.setCurrentRadioStation(2);

        int actual = radio.getCurrentRadioStation();
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void maxStation() {
        radio.setCurrentRadioStation(48);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void minStation() {
        radio.setCurrentRadioStation(-33);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void nextStation() {
        radio.setCurrentRadioStation(4);
        radio.nextStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void upperBoundMaxStation() {
        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}