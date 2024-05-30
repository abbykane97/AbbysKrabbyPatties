package com.pluralsight.com.pluralsight;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    private final String receipts_folder = "receipts/";
    public void generateReceipt(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        String timestamp = LocalDateTime.now().format(formatter);
        String filename = receipts_folder + timestamp + ".txt";

        File folder = new File(receipts_folder);

        if (!folder.exists()) {
            boolean created = folder.mkdir();
            if (!created) {
                System.out.println("Failed");
            }
        }
    }
}

