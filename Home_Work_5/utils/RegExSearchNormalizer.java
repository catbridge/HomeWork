package Home_Work_5.utils;

import Home_Work_5.api.ISearchEngine;

public class RegExSearchNormalizer implements ISearchEngine {
    ISearchEngine searcher;
    private boolean caseInsensitive;

    public RegExSearchNormalizer(ISearchEngine searcher) {
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

        return this.caseInsensitive ? searcher.search(text.toLowerCase(), word.toLowerCase())
                : searcher.search(text, word);
    }

    public void setCaseInsensitive(boolean setCaseInsensitive){
        if (searcher instanceof RegExSearchNormalizer){
            ((RegExSearch) searcher).setCaseInsensitive(setCaseInsensitive);
        } else {
            this.caseInsensitive = setCaseInsensitive;
        }
    }
}
