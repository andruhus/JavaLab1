package vagetables;

public class Tomato extends Vegetable {
    public Tomato(int weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
