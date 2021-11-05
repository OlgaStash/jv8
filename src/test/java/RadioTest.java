import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldGetAndSetNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);

        int actual = radio.getCurrentNumberStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);

        radio.increaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);

        radio.decreaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume10();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume0();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation0() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);

        radio.decreaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation9() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);

        radio.increaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetNumberStationMinus1() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(-1);

        int actual = radio.getCurrentNumberStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetNumberStation10() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(10);

        int actual = radio.getCurrentNumberStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetVolume11() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}