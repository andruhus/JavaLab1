package vagetables;

public class Onion extends Vegetable{
    public Onion(int weight_val) {
        super(weight_val);
    }

    @Override
    public Integer getCaloricContent() {
        return caloricContent;
    }
}
