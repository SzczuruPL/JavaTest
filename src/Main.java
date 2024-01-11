import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        /*PROSTOKAT:
        double h;
        double p;

        System.out.println("Wprowadź wysokość: ");
        Scanner s = new Scanner(System.in);
        h = s.nextDouble();

        System.out.println("Wprowadź podstawę: ");
        Scanner t = new Scanner(System.in);
        p = t.nextDouble();

        System.out.println("Obwod prostokąta o wymiarach " + h + " * " + p + " wynosi: " + (2*p + 2*h));
        System.out.println("Pole powierzchni prostokąta o wymiarach " + h + " * " + p + " wynosi: " + (p * h));*/

        /*TABLICZKA MNOŻENIA:
        int wynik;

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                wynik = i * j;
                System.out.print(wynik + "\t");
            }
            System.out.println();
        }*/

        /*DNI TYGODNIA:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer dnia tygodnia: ");
        int nr_dnia = scanner.nextInt();

        String nz_dnia;
        switch(nr_dnia) {
            case 1:
                nz_dnia = "poniedziałek";
                break;
            case 2:
                nz_dnia = "wtorek";
                break;
            case 3:
                nz_dnia = "środa";
                break;
            case 4:
                nz_dnia = "czwartek";
                break;
            case 5:
                nz_dnia = "piątek";
                break;
            case 6:
                nz_dnia = "sobota";
                break;
            case 7:
                nz_dnia = "niedziela";
                break;
            default:
                nz_dnia = "jesteś chujem";
                break;
        }

        System.out.println("Nazwa dnia tygodnia: " + nz_dnia);*/

        /*SUMA LICZB OD 1 DO 100:
        int suma = 0;
        int i = 1;

        do {
            suma += i;
            i++;
        } while (i <= 100);

        System.out.println("Suma liczb od 1 do 100: " + suma);*/

        /* LICZBY OD 9 DO 0:
        int[] tablica = new int[10];

        for(int i = 0; i < 10; i++){
            tablica[i] = 9 - i;
        }

        for (int i = 0; i < 10; i++){
            System.out.print(tablica[i] + " ");
        }*/

        //10 ELEMENTOWA TABLICA I TE CZARY Z NIA ZWIAZANE:
        int[] tablica = new int[10];
        Random rand = new Random();
        int min = 0, max = 0, suma = 0, mniejsze = 0, wieksze = 0;
        double srednia = 0;

        for(int i = 0; i < 10; i++){
            tablica[i] = rand.nextInt(41) - 20;
        }

        min = tablica[0];
        max = tablica[0];

        for (int i = 0; i < 10; i++) {
            if(tablica[i] < min){
                min = tablica[i];
            }
            if(tablica[i] > max){
                max = tablica[i];
            }
            suma += tablica[i];
        }

        srednia = (double) suma / 10;

        for(int i = 0; i < 10; i++){
            if (tablica[i] < srednia){
                mniejsze++;
            }
            if (tablica[i] > srednia){
                wieksze++;
            }
        }

        int[] ilosc = new int[41];
        for(int i = 0; i < 10; i++){
            ilosc[tablica[i] + 20]++;
        }

        System.out.println("Wygenerowana tablica: ");
        for (int i = 0; i < 10; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println("\nNajmniejszy element: " + min);
        System.out.println("Najwiekszy element: " + max);
        System.out.println("Srednia arytmetyczna: " + srednia);
        System.out.println("Ilosc elementów mniejszych od średniej: " + mniejsze);
        System.out.println("Ilosc elementów większych od średniej: " + wieksze);
        for (int i = 0; i < 41; i++){
            if(ilosc[i] > 0){
                if(ilosc[i] > 1) {
                    System.out.println("Liczba " + (i - 20) + " powtarza się " + ilosc[i] + " razy");
                }
                else{
                    System.out.println("Liczba " + (i - 20) + " nie powtarza się.");
                }
            }
        }
    }
}
