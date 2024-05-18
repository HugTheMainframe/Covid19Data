import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> data = fh.loadData();
        Collections.sort(data, new AldersGruppeComparator());

        Scanner input = new Scanner(System.in);
        String userChoice = "";
        while(!userChoice.equals("4")) {
            System.out.println("Welcome to covid19data sortings program");
            System.out.println("Vælg venlist en af mulighederne nedenuner: ");
            System.out.println("1. sorter efter region");
            System.out.println("2. sorter efter aldersgruppe");
            System.out.println("3. sorter efter 1 og 2 kriteria");
            System.out.println("4. slut program");
            userChoice = input.nextLine();

            switch (userChoice){
                case "1" -> {
                    Collections.sort(data, new RegionComparator());
                    for (Covid19Data cd : data) {
                        System.out.println(cd);
                    }
                }
                case "2" -> {
                    Collections.sort(data, new AldersGruppeComparator());
                    for(Covid19Data cd : data){
                        System.out.println(cd);
                    }
                }
                case "3" -> {
                    System.out.println("Vælg 1 for at sorter først region og derefter aldersgruppe");
                    System.out.println("Vælg 2 for at sorter først aldersgruppe og derefter region");
                    System.out.println("Vælg 3 for at sorter først region og derefter smittetilfælde");
                    userChoice = input.nextLine();
                    if(userChoice.equals("1")) {
                        Comparator<Covid19Data> regionOgAlderGruppe = Comparator.comparing(Covid19Data::getRegion).
                                thenComparing(Covid19Data::getAldersgruppe);
                        Collections.sort(data, regionOgAlderGruppe);
                        for (Covid19Data cd : data){
                            System.out.println(cd);
                        }
                    } else if(userChoice.equals("2")){
                        Comparator<Covid19Data> alderGruppeOgRegion = Comparator.comparing(Covid19Data::getAldersgruppe).
                                thenComparing(Covid19Data::getRegion);
                        Collections.sort(data, alderGruppeOgRegion);
                        for (Covid19Data cd : data){
                            System.out.println(cd);
                        }
                    } else if(userChoice.equals("3")){
                        Comparator<Covid19Data> regionOgSmittetryk = Comparator.comparing(Covid19Data::getRegion).
                                thenComparing(Covid19Data::getBekræftedeTilfælde);
                        Collections.sort(data, regionOgSmittetryk);
                        for (Covid19Data cd : data){
                            System.out.println(cd);
                        }
                    } else {
                        System.out.println("Ugyldig input");
                    }
                }
            }
        }
    }
}
