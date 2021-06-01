public class DrinkTypeExpecion extends Exception{
    private String drink;
    public DrinkTypeExpecion(){

    }
    public DrinkTypeExpecion(String str){
        drink = str;
    }

    public String getMassage(){
        return drink;
    }
}
