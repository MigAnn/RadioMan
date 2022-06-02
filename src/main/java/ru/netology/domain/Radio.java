package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation;
    private int maxRadioStation = 9;
    private int minVolume;
    private int maxVolume = 100;
    private int numberOfStation = 10;

    public Radio() {
    }

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }


    public void nextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minRadioStation) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void highVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }


    public void quietVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}
