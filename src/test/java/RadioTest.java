import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // Тестирование работы переключения радиостанций.

    // Прямое указание количества радиостанций (новый тест)

    @Test
    public void setStationsQuantity() {
        Radio radio = new Radio(15);

        assertEquals(15, radio.getStationsQuantity());
    }

    // Включение радиостанции через прямое указание номера за пределами верхних границ.

    @Test
    public void setOverMaxLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }

    // Включение радиостанции через прямое указание номера за пределами нижних границ.

    @Test
    public void setOverMinLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);

        assertEquals(0, radio.getCurrentStation());
    }

    // Переключение радиостанции при помощи кнопки Next.

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.nextStation();

        assertEquals(5, radio.getCurrentStation());
    }

    // Переключение радиостанции при помощи кнопки Next при установленной последней станции.

    @Test
    public void nextOverMaxLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    // Переключение радиостанции при помощи кнопки Prev.

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();

        assertEquals(6, radio.getCurrentStation());
    }

    // Переключение радиостанции при помощи кнопки Prev при установленной первой станции.

    @Test
    public void prevOverMinLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    // Тестирование изменения уровня громкости.

    // Увеличение уровня громкости (обновлен с учетом изменения условий задачи).

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(96);
        radio.increaseVolume();

        assertEquals(97, radio.getCurrentVolume());
    }

    // Увеличение уровня громкости при максимальном значении (обновлен с учетом изменения условий задачи).
    @Test
    public void increaseMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    // Уменьшение уровня громкости.

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.reduceVolume();

        assertEquals(5, radio.getCurrentVolume());
    }

    // Уменьшение уровня громкости при минимальном значении.

    @Test
    public void reduceMinLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    // Установление громкости за пределами верхних границ (обновлен с учетом изменения условий задачи).

    @Test
    public void setOverMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(120);

        assertEquals(0, radio.getCurrentVolume());
    }

    // Установление громкости за пределами нижних границ.

    @Test
    public void setOverMinLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }
}

