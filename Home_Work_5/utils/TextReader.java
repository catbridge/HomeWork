package Home_Work_5.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class TextReader {

    /**
     * Данный метод выполняет чтение текста из файла
     * @param textFilePath - полный путь к файлу
     * @return - возвращает строку, содержащую текст, прочитанный из файла
     * @throws Exception если файл не найден или произошла ошибка чтения
     */
    public static String readTextFromFile (String textFilePath) throws Exception{
        StringBuilder textFileData = new StringBuilder();
        String textLine;

        FileReader fileReader = new FileReader(textFilePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            textLine = bufferedReader.readLine();
            while (textLine != null) {
                textFileData.append(textLine);
                textFileData.append("\n");
                textLine = bufferedReader.readLine();
            }

        }catch (FileNotFoundException e){
            throw new FileNotFoundException("Ошибка, файл не найден. Путь к файлу: " +textFilePath);
        } catch (IOException | NullPointerException e) {
            throw e;
        }
            if(textFileData.length() == 0){
                return ("Файл пуст!");
            }else {
                return textFileData.toString();
            }
    }
}
