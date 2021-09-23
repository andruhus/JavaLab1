package vagetables;

public class Carrot extends Vegetable {
    public Carrot(Integer weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
