package ex5;

/**
 * Classe exécutable pour tester la classe Inventaire
 *
 * @author ayoubbz
 *
 */
public class Application {

    /**
     * Méthode principale exécutant l'application de gestion de l'inventaire
     *
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {

        Inventaire inv = new Inventaire();
        inv.addItem(new Item("Stylo", 0.05));
        inv.addItem(new Item("Chaise", 6));
        inv.addItem(new Item("Vase", 3.25));
        inv.addItem(new Item("Bureau", 25));

        System.out.println(inv);
    }
}
