package javafundamental.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.File;

public class bytestream {
    public static void main(String[] args) {
        String dirname = "/javafundamental.exception/latihan1";
        File file = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
