public class CatFamily {
    private int ears;
    private int legs;
    private   boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }


    public void showInfo(){
        System.out.println("Количество ушей: "+ears+" Количество лап: "+legs+" Наличе больчих ногтей: "+bigClaws);
    }


    public void setEars(int ears) {
        this.ears = ears;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void   eat(){
        System.out.println("Кушаю ");
    }

}
