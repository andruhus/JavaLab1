package vagetables;

public class Cucumber extends Vegetable {
    public Cucumber(Integer weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
