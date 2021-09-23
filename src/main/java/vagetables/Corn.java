package vagetables;

public class Corn extends Vegetable{
    public Corn(Integer weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
