package Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Интерфейс Command определяет контракт для всех команд, которые могут быть выполнены в приложении.
 * Каждая команда должна реализовывать методы для получения описания, имени и выполнения команды.
 */
public interface Command {

    /**
     * Возвращает описание команды.
     *
     * @return строка с описанием команды.
     */
    String getDescription();

    /**
     * Возвращает имя команды.
     *
     * @return строка с именем команды.
     */
    String getName();

    /**
     * Выполняет команду с указанным аргументом.
     *
     * @param arg аргумент команды (может быть пустым или null, в зависимости от команды).
     */
    void execute(String arg) throws IOException;
}