public class Main {

    /*
    Zrób pętlę, która wywołuje bitwy pomiędzy graczami i przerywa, jeżeli któryś zdobywa 3 punkty.
    Każdy przebieg pętli powinien drukować:
    - wyświetlić typy ataku i obrony obu graczy
    - wyświetlić czy się udały ataki obu graczy
    - zadeklarować komu przydziela punkt (albo, że runda jest bez punktu)
     */

    public static void main(String args[]) {
        Player one = new Player();
        Player two = new Player();

        /// pętla
        while(one.getScore() < 3 && two.getScore() <3)
        {
            prepare(one, two);
            System.out.println("Random one Player1 attack: "+one.getAttack().getType()+", defense: "+ one.getDefence().getType());
            System.out.println("Random one Player2 attack: "+two.getAttack().getType()+", defense: "+ two.getDefence().getType());
            battle(one, two);
            System.out.println("Points Player1: " + one.getScore() + " | Points Player2: "+two.getScore());

        }
    }

    static void prepare(Player one, Player two) {
        one.randomAttack();
        one.randomDefense();
        two.randomAttack();
        two.randomDefense();
    }

    static void battle(Player one, Player two) {
        if ( (Type.attackSuccess(one.getAttack(), two.getDefence()))   /////// działanie metody
          && (!Type.attackSuccess(two.getAttack(), one.getDefence())) ) {
            System.out.println("Player1 attack succeeded and Player2 attack failed");
            one.addPoint();
        } else if ( (!Type.attackSuccess(one.getAttack(), two.getDefence()))
                 && (Type.attackSuccess(two.getAttack(), one.getDefence())) ) {
            System.out.println("Player1 attack failed and Player2 attack succeeded");
            two.addPoint();
        } else {
            System.out.print("Draw: ");
            if(Type.attackSuccess(one.getAttack(), two.getDefence())) {
                System.out.println("Both attacks succeeded");
            } else {
                System.out.println("Both attacks failed");
            }
        }
    }
}
