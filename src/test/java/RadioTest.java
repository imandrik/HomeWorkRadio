import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // Тестирование работы переключения радиостанций.

    // Включение радиостанции через прямое указание номера в пределах границ .

    @Test
    public void setStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Включение радиостанции через прямое указание номера за пределами верхних границ.

    @Test
    public void setOverMaxLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Включение радиостанции через прямое указание номера за пределами нижних границ.

    @Test
    public void setOverMinLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Переключение радиостанции при помощи кнопки Next.

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.nextStation();
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Переключение радиостанции при помощи кнопки Next при установленной последней станции.

    @Test
    public void nextOverMaxLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Переключение радиостанции при помощи кнопки Prev.

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Переключение радиостанции при помощи кнопки Prev при установленной первой станции.

    @Test
    public void prevOverMinLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    // Тестирование изменения уровня громкости.

    // Увеличение уровня громкости.

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Увеличение уровня громкости при максимальном значении.

    @Test
    public void increaseMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Уменьшение уровня громкости.

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.reduceVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Уменьшение уровня громкости при минимальном значении.

    @Test
    public void reduceMinLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Установление громкости за пределами верхних границ.

    @Test
    public void setOverMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Установление громкости за пределами нижних границ.

    @Test
    public void setOverMinLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


}

