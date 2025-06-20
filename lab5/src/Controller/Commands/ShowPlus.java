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
public class ShowPlus implements Command {
    String inputFileName;
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
        return "show+";
    }

    /**
     * Выполняет команду вывода всех элементов коллекции в строковом представлении.
     *
     * @param arg аргумент команды (в данной реализации не используется).
     */
    @Override
    public void execute(String arg) throws IOException {

        try {
            System.out.println("Введите название файла");
            Scanner scanner = new Scanner(System.in);
            inputFileName = scanner.nextLine();

            // Проверка на пустую коллекцию
            if (inputFileName.isEmpty() || inputFileName.equals("null")) {
                System.out.println("Коллекция пуста.");
            } else {
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line + "\n");
                }
                // Вывод всех элементов коллекции
                System.out.println(stringCollection);
            }
        }
        catch(FileNotFoundException a){
            System.out.println("Коллекция пуста или же отсутствует");
        }
    }
}
