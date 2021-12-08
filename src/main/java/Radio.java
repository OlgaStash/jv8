//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class Radio {

    private int currentNumberStation;
    private int amountStation = 10;
    private int maxNumberStation;
    private int minNumberStation = 0;


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int currentNumberStation, int amountStation) {
        this.currentNumberStation = currentNumberStation;
        this.amountStation = amountStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxNumberStation() {
        if (amountStation > 0) {
            return amountStation - 1;
        }
        return 0;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < getMinNumberStation()) {
            return;
        }
        if (currentNumberStation > getMaxNumberStation()) {
            currentNumberStation = getMinNumberStation();
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void increaseNumberStation() {
        int nextNumberStation = currentNumberStation + 1;
        if (currentNumberStation < getMaxNumberStation()) {
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
            setCurrentNumberStation(getMaxNumberStation());
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