package io.internship.learn.try_with_resource;

import java.io.FileInputStream;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        // lire un fichier de la source

        try (FileInputStream inputStream = new FileInputStream("README.md")) {
            // on peut faire ce que on veut
        } catch (Exception e) {
            // dans certain cas on aura qq Exceptions qui ont suppreme de la stack
            // on peut les trouver en utilisant la method getSuppressed()
            // on aura besion de ca car dans certain cas on a oblige de consulter la trace de les exceptions
            Throwable[] suppressed = e.getSuppressed();
        }
    }
}
