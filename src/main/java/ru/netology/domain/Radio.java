package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation;
    private int maxRadioStation = 9;
    private int minVolume;
    private int maxVolume = 100;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation() {

        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation() {
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


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}
