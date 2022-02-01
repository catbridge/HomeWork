package Home_Work_5;

import Home_Work_5.api.ISearchEngine;
import Home_Work_5.dto.TextFromFileStatistic;
import Home_Work_5.utils.*;


import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork5Main {
    public static void main(String[] args) {
        //Чтение файла
        String textFromFile;

        try {
            textFromFile = TextReader.readTextFromFile("HomeWork/src/Home_Work_5/source/Война и мир_книга.txt");

        }catch (FileNotFoundException e){
            System.out.println("Ошибка, файл не найден.");
            return;
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }
        //System.out.println(textFromFile);


        //Работа с текстом
        TextFromFileStatistic textFromFileStatistic;
        try {
            textFromFileStatistic = new TextFromFileStatistic(textFromFile);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }

        //2.1 Найти в тексте все используемые слова и поместить их в Set
        Set<String> usedWords = textFromFileStatistic.getUsedWordsContainer();
        System.out.println("Слов в тексте: " + textFromFileStatistic.getWordsNumber());
        System.out.println("Количество используемых (уникальных) слов: " + usedWords.size());

        System.out.println(" ");

        //2.2 Найти в тексте топ N слов и вывести их кол-во
        System.out.println("Для получения списка самых популярных и списка самых редких слов, \n" + "ведите число, указывающее кол-во позиций в списке: ");
        Scanner console = new Scanner(System.in);
        int wordsNumberForTop = console.nextInt();
        Map<String, Long> topWords = textFromFileStatistic.getPopularWords(wordsNumberForTop);

        System.out.println("Топ " + wordsNumberForTop + " популярных слов:");
        System.out.println(textFromFileStatistic.topWordToString(topWords));

        //топ редких слов
        topWords = textFromFileStatistic.getRareWords(wordsNumberForTop);

        System.out.println("Топ " + wordsNumberForTop + " редких слов:");
        System.out.println(textFromFileStatistic.topWordToString(topWords));

        //4.1 EasySearch / без учета регистра
        String textLowerCase =textFromFile.toLowerCase(Locale.ROOT);
        String[] searchWords = {"Война", "и", "мир"};

        EasySearch easySearch = new EasySearch();
        System.out.println("Поиск с помощью EasySearch: ");
        for (String searchWord : searchWords){
            long searchWordNumber = easySearch.search(textLowerCase, searchWord.toLowerCase(Locale.ROOT));
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

        System.out.println(" ");

        //4.2 RegExSearch / без учёта регистра
        RegExSearch regExSearch = new RegExSearch();
        System.out.println("Поиск с помощью RegExSearch: ");
        for (String searchWord : searchWords){
            long searchWordNumber = regExSearch.search(textLowerCase, searchWord.toLowerCase(Locale.ROOT));
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

        System.out.println(" ");

        //4.3 SearchEngineNormalizer / без учета регистра

        ISearchEngine easySearchWithNormalizedString = new SearchEnginePunctuationNormalizer(new EasySearch());
        System.out.println("Поиск с использованием SearchEnginePunctuationNormalizer(new EasySearch()):  ");
        for (String searchWord : searchWords){
            long searchWordNumber = easySearchWithNormalizedString.search(textLowerCase, searchWord.toLowerCase(Locale.ROOT));
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

        System.out.println(" ");

        ISearchEngine rexExSearchWithNormalizedString = new SearchEnginePunctuationNormalizer(new RegExSearch());
        System.out.println("Поиск с использованием SearchEnginePunctuationNormalizer(new RegExSearch()):  ");
        for (String searchWord : searchWords){
            long searchWordNumber = easySearchWithNormalizedString.search(textLowerCase, searchWord.toLowerCase(Locale.ROOT));
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

        System.out.println(" ");


        //4.4 RegExSearchNormalizer

        RegExSearchNormalizer RegExSearchNormalizer1 = new RegExSearchNormalizer(new EasySearch());
        RegExSearchNormalizer1.setCaseInsensitive(false);

        System.out.println("Поиск с использованием RegExSearchNormalizer(new EasySearch()) (c учетом регистра)");
        for (String searchWord : searchWords) {
            long searchWordNumber = RegExSearchNormalizer1.search(textFromFile, searchWord);
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

        System.out.println(" ");

        RegExSearchNormalizer RegExSearchNormalizer2 = new RegExSearchNormalizer(new RegExSearch());
        RegExSearchNormalizer2.setCaseInsensitive(true);

        System.out.println("Поиск с использованием RegExSearchNormalizer(new RegExSearch()) (без учета регистра)");
        for (String searchWord : searchWords) {
            long searchWordNumber = RegExSearchNormalizer2.search(textFromFile, searchWord);
            System.out.println("Cлово [" + searchWord + "] встречается: " + searchWordNumber + " раз");
        }

    }
}
