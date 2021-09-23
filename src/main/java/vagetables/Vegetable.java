package vagetables;

abstract class Vegetable {
    protected Integer caloricContent;
    public int weight;
    public Vegetable(int weight_val){
        weight = weight_val;
    }
    abstract public Integer getCaloricContent();
}
