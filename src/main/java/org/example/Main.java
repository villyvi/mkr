package org.example;
public class Main {
    public static void main(String[] args) {
        String baseMessage = "Добрий день, гарного Вам дня";

        textCompress compressionProcessor = new textCompress();
        String compressedMessage = compressionProcessor.process(baseMessage);
        System.out.println("Стиснене повідомлення: " + compressedMessage);


        shifr encryptionProcessor = new shifr();
        String encryptedMessage = encryptionProcessor.process(compressedMessage);
        System.out.println("Зашифроване повідомлення: " + encryptedMessage);


        timeAndDate timestampProcessor = new timeAndDate();
        String timestampedMessage = timestampProcessor.process(encryptedMessage);
        System.out.println("Повідомлення з позначкою дати та часу: " + timestampedMessage);


        String authorName = "Абоба Абобобович";
        pibname authorProcessor = new pibname(authorName);
        String authorMessage = authorProcessor.process(timestampedMessage);
        System.out.println("Повідомлення з ПІБ автора: " + authorMessage);
    }
}
