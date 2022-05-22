package com.foth.petinder.Classes.Message;

public class Message {
    private String senderPhoto;
    private String senderName;
    private String lastMessage;

    public Message(String senderPhoto, String senderName, String lastMessage) {
        this.senderPhoto = senderPhoto;
        this.senderName = senderName;
        this.lastMessage = lastMessage;
    }

    public String getSenderPhoto() {
        return senderPhoto;
    }

    public void setSenderPhoto(String senderPhoto) {
        this.senderPhoto = senderPhoto;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }


    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
