package pl.camoleo.sda.zdjavapol12.s.Input_Output.myOwnWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws IOException {

        //1.plik zapisany w folderze "recznie"

        File file = new File("nazwa.txt");

        //sprawdzenie czy plik istnieje:
        boolean exists = file.exists();
        System.out.println("czy istnieje: " + exists + "\n");

        //sprawdzenie gdzie ten plik powinien się znajdować:
        String absolutePath = file.getAbsolutePath();
        System.out.println("Ten plik powinien się znajdować w danej lokalizacji: " + absolutePath + "\n");
        //java oczekuje ze plik bedzie znajdowal sie dokladnie w wyswietlonym folderze

        // ODCZYT - pierwsza mozliwosc:


        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {                  //petla wyświetla wszystkie linie tekstu z pliku
            String line = scanner.nextLine();
            System.out.println(line);
        }
//-------------------------------------------------------------------------------------------------------------//
        System.out.println("\n\n");
        //2. utworzenie nowego pliku za pomocą kodu

        File file2 = new File("plik.txt");

        //sprawdzenie czy udalo sie utworzyc nowy plik
        boolean success = file2.createNewFile();

        System.out.println("Czy udalo sie utworzyc nowy plik? " + success);

        //dodanie tresci do nowego pliku
        PrintWriter writer = new PrintWriter(file2);

        // private static int defaultCharBufferSize = 8192; - bufor do zamkniecia przez jave
        for (int i = 0; i < 8100; i++) {
            writer.println('a');
            writer.flush();  //- zapisanie tego co jest w buforze (ale lepiej zamykac przez writer.close();
            //thread.sleep(100); - spowalnia proces
        }


        writer.println("to jest tresc nowego pliku tekstowego");
        writer.println("kolejna linijka tej tresci");

        //powyzsza tresc znajduje sie w buforze - teraz nalezy ja zamknac
        writer.close();


    }
}
