package com.example.gossipgirl;

import java.util.Date;

public class Message{
    String originalText;
    String rephrasedText;
    Date timestamp;
    final String author = "anonymous";

    public Message(String originalText, String rephrasedText,  Date timestamp,  String author  ) {
        this.originalText = originalText;
        this.rephrasedText = rephrasedText;
        this.timestamp = timestamp;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getRephrasedText() {
        return rephrasedText;
    }

    public void setRephrasedText(String rephrasedText) {
        this.rephrasedText = rephrasedText;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }
}
