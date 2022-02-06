 class Player {
    String name;
    int id;
    static int PlayerCount=0;
    Player(String name){
        this.name=name;
        id=++PlayerCount;
    }

    void PrintDetails(){
        System.out.println("id:"+id+" Name:"+name);
    }
}

class StaticMembers{
    public static void main(String[] args){
        Player p1=new Player("xyz");
        Player p2=new Player("abc");

        p1.PrintDetails();
        p2.PrintDetails();
    }
}