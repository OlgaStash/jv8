public class Radio {
    private int currentNumberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int amountStation = 10;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getCurrentNumberStation() {

        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < minNumberStation) {
            return;
        }
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void setCurrentNumberStationDefault() {
        this.currentNumberStation = amountStation;
    }

    public void increaseNumberStation() {
        int nextNumberStation = currentNumberStation + 1;
        if (currentNumberStation < maxNumberStation) {
            setCurrentNumberStation(nextNumberStation);
        } else {
            setCurrentNumberStation(minNumberStation);
        }
    }

    public void decreaseNumberStation() {
        int prevNumberStation = currentNumberStation - 1;

        if (currentNumberStation > minNumberStation) {
            setCurrentNumberStation(prevNumberStation);
        } else {
            setCurrentNumberStation(maxNumberStation);
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {

        int nextVolume = currentVolume + 1;
        if (currentVolume < maxVolume) {
            setCurrentVolume(nextVolume);
        } else {
            setCurrentVolume(currentVolume);
        }
    }

    public void decreaseVolume() {

        int prevVolume = currentVolume - 1;
        if (currentVolume > minVolume) {
            setCurrentVolume(prevVolume);
        } else {
            setCurrentVolume(currentVolume);
        }
    }


}