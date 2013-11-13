package praktikum10;

import java.io.File;
//T�iendada FailiNimekiri.trykiFailid meetodit niimoodi, 
//et tr�kitaks v�lja kataloogipuu rekursiivselt 
//(ka failid, mis asuvad alamkataloogides). 
//Tr�ki v�lja k�ikide Eclipse Praktikumid-projekti 
//koodifailide asukohad. See kataloog asub t�en�oliselt:
// /home/kasutajanimi/Documents/workspace/Praktikumid/src
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
