import com.company.Entities.Races;

public class app {
    public static void main(String[] args) {
        /*Races race = Races.values()[(int) Math.floor(Math.random() * 8)];
        System.out.println(race);
        for (int i = 0; i < 20; i++) {
            System.out.println(Math.floor(Math.random() * race.getRole().length));
        }*/
        for (int i = 0; i < 500000; i++) {
           if (Math.random() < 0.0001) System.out.println(i + " " +true);;
        }
    }
}
