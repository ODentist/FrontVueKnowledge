package com.itheima;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class TestBase64 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of("heima.png"));

        System.out.println(Base64.getEncoder().encodeToString(bytes));

        System.out.println("""
               --123
               Content-Disposition: form-data; name="username"
               
               lisi
               --123
               Content-Disposition: form-data; name="avatar"; filename="a.png"
               Content-Type: image/png
               
               
               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
               --123--""".length());
    }
}
