class InstanceFinalVariables{
    //final int x=100; -- method 1 
    final int x;
    //{x=100;}        // --- initializer block;

    InstanceFinalVariables(){   // -- initialization inside constructor
        x=100;
    }
        public static void main(String[] args){
           InstanceFinalVariables v=new InstanceFinalVariables();
           System.out.println(v.x);
    }
}

