package Home_Work_5.dto;

import java.util.*;

public class TextFromFileStatistic {
    private String text;
    private List<String> wordsData;
    private Set<String> usedWordsData;

    /**
     * Дефолтный конструктор
     */
    public TextFromFileStatistic() {
    }

    /**
     * Конструктор принимающий текстовую строку.
     * При инициализации происходит разбивка текста на слова без знаков припинания и используемые слова,
     * которые храняться в полях wordsData и usedWordsData. Для их получения можно использовать геттеры.
     * @param text текстовая строка для обработки
     * @throws IllegalArgumentException если текст не содержит слов
     */
    public TextFromFileStatistic(String text) throws IllegalArgumentException {
        this.text = text;
        dataWrite();

    }

    /**
     * Данный метод задает значение поля text
     * Вызов метода приводит к разбивке текста на слова без знаков припинания и используемые слова,
     * которые храняться в полях wordsData и usedWordsData. Для их получения можно использовать геттеры.
     * @param text строка для обработки
     * @throws IllegalArgumentException если текст не содержит слов
     */
    public void setText(String text) throws IllegalArgumentException {
        this.text = text;
        dataWrite();
    }

    /**
     * Метод возвращает текстовую строку содержащую исходный текст
     * @return текстовую строку с исходным текстом
     */
    public String getText() {
        return text;
    }

    /**
     * Метод возвращает List, содержащий все слова текста
     * @return List, содержащий все слова текста
     */
    public List<String> getWordsContainer() {
        return wordsData;
    }

    /**
     *  Метод возвращает общее количество слов в тексте
     * @return общее количество слов в тексте
     */
    public int getWordsNumber() {
        return wordsData.size();
    }

    /**
     * Метод возвращает Set, содержащий все используемые слова текста
     * @return Set, содержащий все используемые слова текста
     */
    public Set<String> getUsedWordsContainer() {
        return this.usedWordsData;
    }

    /**
     * Метод возвращает общее количество используемых слов в тексте
     * @return общее кол-во используемых слов в тексте
     */
    public int getUsedWordsNumber() {
        return usedWordsData.size();
    }

    /**
     * Данный метод возвращает текстовую строку без знаков препинания, множественных пробелов
     * и символов перевода строки
     * @param text текстовая строка
     * @return возвращает екстовую строку без знаков препинания, множественных пробелов и символов перевода строки
     * @throws NullPointerException если text равен null
     */
    public String getTextWithoutPunctuation(String text){
        if(text == null){
            throw new NullPointerException("Ошибка в тексте!");
        }
        return text.replaceAll("([+*:.,!?*();=,.\\n\\r])|(-{2,})", " ") //Убираем символы + * : . , ! ? ( ) ; = < > -- и строки
                .replaceAll("[\"'|\\[\\]]", " ") //Убираем символы " ' | [ ]
                .replaceAll("(\\s-)|(^-)", " ") ///Убираем символы -
                .replaceAll("\\s{2,}", " ") //Убираем двойные символы
                .trim();
    }

    /**
     * Метод заполняет поля wordsData и usedWordsData после обновления поля text
     */
    private void dataWrite (){
        String textWithoutPunctuation = getTextWithoutPunctuation(this.text);
        if (textWithoutPunctuation.equals("")) {
            throw new IllegalArgumentException("Текст не содержит слов");
        }
        this.wordsData = new ArrayList<>((Arrays.asList(textWithoutPunctuation.split(" "))));
        this.usedWordsData = new HashSet<>(this.wordsData);
    }

    /**
     * Метод считает сколько раз каждое слово встречается в переданном списке
     * @return Map, в которой ключ - слово, значение - сколько раз слово встречается в тексте
     */
    public Map<String, Long>  countNumberOfEachWord (){
        Map<String, Long> counter = new HashMap<>();
        //Считаем сколько раз слово встречается в тексте
        for (String word : this.wordsData){
            if(counter.containsKey(word)){
                long count = counter.get(word);
                counter.put(word, ++count);
            }else {
                counter.put(word, 1L);
            }
        }
        return counter;
    }

    /**
     * Метод возвращает число, показывающее сколько раз слово втречается в тексте
     * @param word слово
     * @return сколько раз word встречается в text
     */
    public Long getNumberOfEachWord(String word){
        Map<String, Long> counter = countNumberOfEachWord();
        return counter.get(word);
    }

    /**
     * Метод выполняет сортировку Map по значению
     * Для сортировки используется компаратор MapValueComparator
     * @param unsortedMap неотсортированная Map. Ключ - слово, Значение - сколько раз слово встречается
     * @return отсортированный Map
     */
    private Map<String, Long> sortByValue (Map<String, Long> unsortedMap, boolean sorts){
        Map<String, Long> sortedMap = new TreeMap<String, Long>(new MapValueComparator(unsortedMap, sorts));
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }

    /**
     * Метод возвращает Map самых редких или самых популярных слов в тексте.
     * @param wordNumber количество слов, которые надо передать
     * @param sorts если false - вернет Map популярных слов
     *              если true - вернет Map редких слов.
     * @return Map редких или популярных слов в тексте в количество wordNumber
     */
    private Map<String , Long> numberOfEachWordSortedByValue (long wordNumber, boolean sorts){
        Map<String , Long> numberOfEachWord = countNumberOfEachWord();
        //Сортировка по значению
        Map<String, Long> numberEachWordSortedByValue = sortByValue(numberOfEachWord, sorts);
        Map<String , Long> topWords = new LinkedHashMap<>();

        int i = 0;
        for (String key : numberEachWordSortedByValue.keySet()) {
            if (i++ < wordNumber) {
                topWords.put(key, numberOfEachWord.get(key));
            } else {
                break;
            }
        }
        return topWords;
    }

    /**
     * Метод возвращает Map самых популярных слов в тексте.
     * @param wordNumber кол-во слов, которые надо передать
     * @return Map самых попоулярных слов в тексте в кол-ве wordNumber.
     * @throws IllegalArgumentException если wordNumber отрицательный
     */
    public Map<String, Long> getPopularWords (long wordNumber){
        if(wordNumber < 0){
            throw new IllegalArgumentException("Количество слов не может быть отрицательным");
        }
        return numberOfEachWordSortedByValue(wordNumber, false);
    }

    /**
     * Метод возвращает Map самых редких слов в тексте.
     * @param wordNumber кол-во слов, которые надо передать
     * @return Map самых редких слов в тексте в кол-ве wordNumber.
     * @throws IllegalArgumentException если wordNumber отрицательный
     */
    public Map<String, Long> getRareWords (long wordNumber){
        if(wordNumber < 0){
            throw new IllegalArgumentException("Количество слов не может быть отрицательным");
        }
        return numberOfEachWordSortedByValue(wordNumber, true);
    }

    /**
     * Метод преобразует Map в текстовую строку.
     * @param map Map, где Ключ - слово, Значение - кол-во раз, которое слово встречалось в тексте
     * @return текстовую строку
     * @throws IllegalArgumentException если Map равен null.
     */
    public String topWordToString(Map<String, Long> map) {
        if (map == null){
            throw new IllegalArgumentException("Неверный аргумент");
        }
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for(String key : map.keySet()){
            stringBuilder.append(String.format("%d. \"%s\" - %d раз%n", ++i, key, map.get(key)));
        }
        return stringBuilder.toString();
    }
}
