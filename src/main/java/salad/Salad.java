package salad;
import vagetables.Vegetable;

import java.util.Comparator;
import java.util.List;

public class Salad {
    public String name;
    public List<Vegetable> ingrediens;

    public int calculateTotalCaloricContent(){
        int total_quantity = 0;
        for (Vegetable item: ingrediens){
            total_quantity += item.weight*item.caloricContent;
        }
        return total_quantity;
    }

    public void sortWeightwise(){
        Comparator<? super Vegetable> comparator = new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return (o1.weight < o2.weight) ? 1 : 0;
            }
        };
        ingrediens.sort(comparator);
    }
}
