package Controller.Commands;

import Controller.Command;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static Client.Main.filename;
import static CollectionObjects.Collectionss.stringCollection;

/**
 * Класс Show реализует команду вывода всех элементов коллекции в строковом представлении.
 */
public class Show implements Command {
    /**
     * Возвращает описание команды.
     *
     * @return строка с описанием команды.
     */
    @Override
    public String getDescription() {
        return getName() + " вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    /**
     * Возвращает имя команды.
     *
     * @return строка с именем команды.
     */
    @Override
    public String getName() {
        return "show";
    }

    /**
     * Выполняет команду вывода всех элементов коллекции в строковом представлении.
     *
     * @param arg аргумент команды (в данной реализации не используется).
     */
    @Override
    public void execute(String arg) throws IOException {

        try {
            // Проверка на пустую коллекцию
            if (filename.isEmpty() || filename.equals("null")) {
                System.out.println("Коллекция пуста.");
            } else {
                // Вывод всех элементов коллекции
                System.out.println(stringCollection);
                }

            }
        catch(RuntimeException f){
            System.out.println("Коллекция пуста или же отсутствует");
        }
        }
    }

