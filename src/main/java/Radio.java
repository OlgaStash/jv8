public class Radio {
    private int currentNumberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


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


    public void increaseNumberStation() {
        int nextNumberStation = currentNumberStation + 1;
        setCurrentNumberStation(nextNumberStation);

    }

    public void decreaseNumberStation() {
        int prevNumberStation = currentNumberStation - 1;
        setCurrentNumberStation(prevNumberStation);
    }

    public void increaseNumber9() {
        int nextNumberStation9 = currentNumberStation + 1;
        setCurrentNumberStation(minNumberStation);
    }

    public void decreaseNumber0() {
        int prevNumberStation0 = currentNumberStation - 1;
        setCurrentNumberStation(maxNumberStation);
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
        setCurrentVolume(nextVolume);
    }

    public void decreaseVolume() {

        int prevVolume = currentVolume - 1;
        setCurrentVolume(prevVolume);
    }

    public void increaseVolume10() {

       int nextVolume10 = currentVolume + 1;
           setCurrentVolume(maxVolume);
        }

    public void decreaseVolume0() {

        int prevVolume0 = currentVolume - 1;
        setCurrentVolume(minVolume);
    }

}