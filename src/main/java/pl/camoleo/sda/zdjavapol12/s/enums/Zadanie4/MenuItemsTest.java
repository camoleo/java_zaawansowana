package pl.camoleo.sda.zdjavapol12.s.enums.Zadanie4;

public class MenuItemsTest {
    public static void main(String[] args) {

        for (int i = 0; i < MenuItems.values().length; i++) {

            System.out.println("\n" + MenuItems.values()[i]);

            for (Language l : Language.values()) {

                System.out.println(l + ":" + MenuItems.values()[i].translate(l));
            }
        }
    }
}