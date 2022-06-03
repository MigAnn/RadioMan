package ru.netology.domain;

public class Radio {
    private int maxVolume = 100;
    private int numberOfStation = 10;
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation;
    private int minVolume;

    public Radio() {
    }
    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }



    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > (numberOfStation-1)) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }


    public void nextStation() {
        if (currentRadioStation >= (numberOfStation-1)) {
            currentRadioStation = minRadioStation;
        } else {
            setCurrentRadioStation(currentRadioStation +1);
        }
    }

    public void prevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation((numberOfStation-1));
        } else {
            currentRadioStation--;
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