package praktikum10;

import java.io.File;
import java.util.Arrays;

public class FailiNimekiri {

    public static void trykiFailid(String kataloogiTee) {

        File kataloog = new File(kataloogiTee);
        File[] failid = kataloog.listFiles();
        Arrays.sort(failid);

        for (File file : failid) {
            if (file.isDirectory()) {
                System.out.print("Kataloog: ");
            }
            else {
                System.out.print("Fail:     ");
            }
            System.out.println(file.getAbsoluteFile());
        }
    }

    public static void main(String[] args) {
        trykiFailid("/");
    }

}
