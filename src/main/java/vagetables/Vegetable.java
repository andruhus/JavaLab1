package vagetables;

public abstract class Vegetable {
    protected Integer caloricContent;
    public Integer weight;
    public Vegetable(Integer weight_val){
        weight = weight_val;
    }
    abstract public Integer getCaloricContent();
}
