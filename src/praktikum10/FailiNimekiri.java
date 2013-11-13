package praktikum10;

import java.io.File;
//Täiendada FailiNimekiri.trykiFailid meetodit niimoodi, 
//et trükitaks välja kataloogipuu rekursiivselt 
//(ka failid, mis asuvad alamkataloogides). 
//Trüki välja kõikide Eclipse Praktikumid-projekti 
//koodifailide asukohad. See kataloog asub tõenäoliselt:
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
