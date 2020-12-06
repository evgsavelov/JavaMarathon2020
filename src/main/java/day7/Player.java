package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina){
        this.stamina = stamina;
        countPlayers ++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        stamina --;
    }
    public void info(){
        int vacancies = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("“Команды неполные. На поле еще есть " + vacancies + " свободных мест”");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
