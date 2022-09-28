public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void prev() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation--;
    }


    public void next() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.currentVolume = volume;
    }

    public void volumePlusOne() {

        if (currentVolume == 10) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 10) {
            this.currentVolume++;
        }
    }


    public void volumeMinusOne() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }
}
