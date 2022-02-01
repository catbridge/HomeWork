package Home_Work_5.utils;

import Home_Work_5.api.ISearchEngine;

public class EasySearch  implements ISearchEngine {

    /**
     * Метод возвращает сколько раз встречается слово в тексте.
     * @param text текст в котором ищем
     * @param word слово которое ищем в тексте
     * @return число раз которое встречается слово word в тексте text
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = text.indexOf(word);

        while (index != -1){
            if (isSingleWord(text, index, word.length())) {
                ++count;
            }
            index = text.indexOf(word, index + word.length());
        }

        return count;
    }

    /**
     * Данный метод проверяет является ли последовательность символов с позиции index и длинной wordLength отдельным словом.
     * @param text текст в котором выполняется поиск
     * @param index позиция с которой выполняется проверка
     * @param wordLength длина слова
     * @return true если строка [index - index+wordLength] является словом, false - если не является словом
     */
    private boolean isSingleWord(String text, int index, int wordLength){
        //Если это начало или конец текста, то считаем что граничные символы это ' ' (пробел)
        int prevCharCode = (index == 0) ? 32 : text.charAt(index - 1);
        int nextCharCode = (index == text.length() - 1 || index + wordLength == wordLength) ? 32 : text.charAt(index + wordLength);

        return (nextCharCode != 45 && !Character.isLetter(prevCharCode) && !Character.isLetter(nextCharCode) );
    }
}
