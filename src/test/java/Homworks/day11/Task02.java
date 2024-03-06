package Homworks.day11;

import utility.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task02  {
    public static void main(String[] args) {


        String user = System.getProperty("user.home");
        String sepertor = System.getProperty("file.separator");
        System.out.println("user = " + user);
        System.out.println("sepertor = " + sepertor);

        String path =user + sepertor + "OneDrive"+sepertor+"سطح المكتب"+sepertor+"hi.txt";
      //  String path =user + sepertor + "OneDrive\\سطح المكتب\\hi.txt";
        System.out.println("path = " + path);
        boolean isExists =Files.exists(Path.of(path));
        System.out.println("isExists = " + isExists);
}}
