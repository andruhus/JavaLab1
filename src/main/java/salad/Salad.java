package salad;
import vagetables.Vegetable;
import java.util.List;

public class Salad {
    public List<Vegetable> ingrediens;

    public Integer calculateTotalCaloricContent(){
        Integer total_quantity = 0;
        for (Vegetable item: ingrediens){
            total_quantity += item.weight*item.getCaloricContent();
        }
        return total_quantity;
    }
    
}
