package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minStation) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation > maxStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(currentRadioStation+1);
        }
    }

    public void prevStation() {
        if (currentRadioStation < minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(currentRadioStation-1);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= maxVolume) {
            return;
        }
        if (volume <= minVolume) {
            return;
        }
        this.volume = volume;
    }

    public void highVolume() {
        if (volume < maxVolume) {
            volume = volume+1;
        }
    }

    public void quietVolume() {
        if (volume > minVolume) {
            volume = volume-1;
        }
    }

}
