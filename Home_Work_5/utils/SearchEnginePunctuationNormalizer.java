package Home_Work_5.utils;

import Home_Work_5.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    ISearchEngine searcher;

    public SearchEnginePunctuationNormalizer(ISearchEngine searcher) {
        this.searcher = searcher;
    }

    @Override
    public long search(String text, String word) {
        if (text == null) {
            throw new NullPointerException("Text is null");
        }
        if (word == null) {
            throw new NullPointerException("Word is null");
        }

        return searcher.search(stringNormalizer(text), word);
    }



    /**
     * Данный метод удаляет из полученной строки специальные символы и двойные пробелы
     * @param text исходный текст
     * @return текстовая строка без специальных символов и двойных пробелов
     */
    public String stringNormalizer(String text){
        if(text == null){
            throw new NullPointerException("Ошибка в тексте!");
        }
        return text.replaceAll("([+*:.,!?*();=,.\\n\\r])|(-{2,})", " ") //Убираем символы + * : . , ! ? ( ) ; = < > -- и строки
                .replaceAll("[\"'|\\[\\]]", " ") //Убираем символы " ' | [ ]
                .replaceAll("(\\s-)|(^-)", " ") ///Убираем символы -
                .replaceAll("\\s{2,}", " ") //Убираем двойные символы
                .trim();
    }
}
