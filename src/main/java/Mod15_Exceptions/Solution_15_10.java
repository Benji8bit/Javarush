package Mod15_Exceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
Оборачивание исключений
*/

public class Solution_15_10 {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        FileUtils.readFile(sourceFile);
        FileUtils.writeFile(destinationFile);
        //напишите тут ваш код
    }
}

