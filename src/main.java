import java.util.ArrayList;

public class main{

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(500);
        list1.add(900);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(800);
        list2.add(600);
        list2.add(300);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(400);
        list3.add(700);
        list3.add(200);
        ArrayOrganizer newA = new ArrayOrganizer();
        ArrayList<Integer> result = new ArrayList<>();
        result = newA.concatAndSort(list1, list2, list3);
        System.out.println(result);

        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");
        Die newD = new Die();
        for(int a = 0; a < 5; a++)
        {
            p1.addScore(newD.rollDie());
            p2.addScore(newD.rollDie());
            p3.addScore(newD.rollDie());
            p4.addScore(newD.rollDie());
        }
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}