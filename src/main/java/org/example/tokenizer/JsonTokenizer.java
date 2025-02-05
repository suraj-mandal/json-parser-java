package org.example.tokenizer;

public class JsonTokenizer {

    private String content;

    public JsonTokenizer(String content) {
        this.content = content;
    }

    public JsonTokenizer cleanContent() {
        content = content.trim();
        return this;
    }

    public void checkBoundaries() {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("JSON Content is empty");
        }
        if (!content.startsWith("{") || !content.endsWith("}")) {
            throw new IllegalArgumentException("JSON Content contains invalid characters");
        }
    }

}
