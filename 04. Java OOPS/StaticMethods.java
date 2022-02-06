class Player{
    String name;
    static int PlayerCount;
    int id;

    Player(String name){
        this.name=name;
        id=++PlayerCount;
    }

    static int getPlayerCount(){
        return PlayerCount;
    }
}

public class StaticMethods {
    public static void main(String[] args){
        System.out.println(Player.getPlayerCount());
        Player p1=new Player("abc");
        System.out.println(Player.getPlayerCount());
    }
}
