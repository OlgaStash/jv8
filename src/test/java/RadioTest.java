import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldGetAndSetNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);

        int actual = radio.getCurrentNumberStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckWhenAmountStation0() {
        Radio radio = new Radio(0, 0);

        int actual = radio.getCurrentNumberStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        Radio radio = new Radio(15, 20);

        radio.increaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 16;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        Radio radio = new Radio(6, 11);

        radio.decreaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 5;

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
    public void shouldIncreaseVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation0() {
        Radio radio = new Radio(0, 16);

        radio.decreaseNumberStation();

        int actual = radio.getCurrentNumberStation();
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation9() {
        Radio radio = new Radio(9, 10);

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
    public void shouldGetAndSetVolume110() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountStationDefault() {
        Radio radio = new Radio();

        int actual = radio.getAmountStation();
        int expected = 10;

        assertEquals(expected, actual);
    }
}