class Car{
    String carName;
    String carType;

    Car(String name,String type){
        this.carType=type;
        this.carName=name;
    }

    private String getCarName(){
        return this.carName;
    }

    class Engine{
        String engineType;

        void setEngine(){
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("Crysler")){
                    this.engineType="Smaller";
                }
                else{
                    this.engineType="Larger";
                }
            }else{
                this.engineType="Larger";
            }
        }

        String getEngineType(){
            return this.engineType;
        }
    }
}



public class AccessOuterClass {
    public static void main(String[] args){
       Car car=new Car("Mazda","8WD");
       Car.Engine engine = car.new Engine();
       engine.setEngine();
       System.out.println("The Engine Type for 8WD is:"+engine.getEngineType());
    }
}
