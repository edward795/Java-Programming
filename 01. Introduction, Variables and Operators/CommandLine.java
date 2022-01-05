class CommandLine{
    public static void main(String[] args){
        if(args.length>0){
            System.out.println("Arquements are:");
            for(String x:args){
                System.out.println("Args:"+x);
            }
        }
        else
        System.out.println("No arguements!");
    }
}