package vagetables;

public class Carrot extends Vegetable {
    public Carrot(int weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
