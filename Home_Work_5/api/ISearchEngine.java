package Home_Work_5.api;

@FunctionalInterface
public interface ISearchEngine {
    /**
     * Метод возвращает информацию о кол-ве раз, которое слово встречается в тексте
     * @param text текст в котором ищем
     * @param word слово которое ищем
     * @return сколько раз встречается слово word в тексте text
     */
    long search (String text, String word);
}
