package pl.camoleo.sda.zdjavapol12.s.Exceptions.zadanie_2;

import java.util.Random;

public class ImprezaAkademik {

    public static void party() throws HangoverException {
        Random random = new Random();
        int drunkLevel = random.nextInt(30);
        if (drunkLevel < 5) {
            throw new UnsupportedOperationException();
        } else if (drunkLevel < 10) {
        } else if (drunkLevel < 20) {
            throw new HangoverException();
        } else if (drunkLevel < 30) {
            throw new LoosedKeyException();
        } else if (drunkLevel < 40) {
            throw new BurningBabilonException();
        } else if (drunkLevel < 50) {
            throw new MarsMissionException();
        }
    }


    public static void main(String[] args) {
        ImprezaAkademik imprezaAkademik = new ImprezaAkademik();
        try {
            ImprezaAkademik.party();
            System.out.println(" fajna impreza nie stało się nic złego");
        } catch (MarsMissionException e) {
            System.out.println("Chciałeś ruszyć z misją ratunkową za kolegami którzy wystartowali na marsa. To cud że jeszcze żyjesz!");
        } catch (BurningBabilonException e) {
            System.out.println("Gratulacje, teraz cały Kraków o was mówi, drogo zapłacisz za swoją głupotę");
        } catch (HangoverException e) {
            e.printStackTrace();
        }

    }
}
