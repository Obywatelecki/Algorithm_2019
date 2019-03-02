import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*

    Podejście zachłanne:
    1. Jeżeli coś trzeba zrobić, to trzeba to zrobić, chocby skały srały (JB - 02.03.2019)
    2. Zaczynamy od najbardziej kosztownego elementu, albo tego, który przyniesie najwiecej korzysci
    3. Czy lokalne optimum da się przekuć na globalne optimum?

    ____________________

    jest kajak o pojemnosci 2, o max pojemnosci 200. Wozomy ludzi na drugi brzeg. Jak ich pakujemy?

    1. Bierzemy najciezszego + kolejnego, aby sie zmiescil

    ____________________

    problem desek lezących, które trzeba przybić do podłogi. Gwozdzie o dowolnej długosci. Jak je wbijac,
    aby zuzyc jak najmniej gwozdzi

    _____________________

    Stado potworów, każdy opisany dwoma liczbami: ile kosztuje zabicie (E) i ile zwróci many (M)

     */

    public static class Monster implements Comparable<Monster> {

        private Integer hp;
        private Integer mana;
        private Boolean isAlive;

        Monster(Integer hp, Integer mana) {
            this.hp = hp;
            this.mana = mana;
            this.isAlive = true;
        }

        private Integer diff() {
            return this.mana - this.hp;
        }

        @Override
        public int compareTo(Monster o) {
            return o.diff() - this.diff();
        }
    }

    public static void main(String[] args) {

        Integer myStrenght = 3;
        List<Monster> horde = new ArrayList<>();

        horde.add(0, new Monster(10, 15));
        horde.add(1, new Monster(16, 2));
        horde.add(2, new Monster(9, 0));
        horde.add(3, new Monster(0, 17));

        Collections.sort(horde);

        for (int i = 0; i < horde.size(); ++i) {
            System.out.println(horde.get(i).hp + " " + horde.get(i).mana + " diff: " + horde.get(i).diff());
        }

        while (!horde.isEmpty()) {
            for (int i = 0; i < horde.size(); ++i) {
                if (horde.get(i).hp <= myStrenght) {
                    System.out.println(myStrenght);
                    myStrenght = myStrenght + horde.get(i).diff();
                    horde.remove(i);
                    System.out.println(myStrenght);
                    System.out.println("potwor zabity!");
                    break;
                }
                System.out.println("nie udalo sie");
                return;
            }
        }
        System.out.println("Wszytkie dead!");
    }
}