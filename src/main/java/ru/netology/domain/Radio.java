package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }


    public void nextStation() {
        if (currentRadioStation >= 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void highVolume() {
        if (currentVolume >= 10) {
            setCurrentVolume(10);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }


    public void quietVolume() {
        if (currentVolume <= 0) {
            setCurrentVolume(0);
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}
