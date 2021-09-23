package vagetables;

public class Cabbage extends Vegetable{
    public Cabbage(Integer weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }

}
