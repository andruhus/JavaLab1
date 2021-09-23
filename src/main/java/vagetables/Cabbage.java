package vagetables;

public class Cabbage extends Vegetable{
    public Cabbage(int weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }

}
