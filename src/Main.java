import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,6,12,15,19,24));
        SearchAlgorithms sa = new SearchAlgorithms(nums);
        try{
            int result = sa.jumpSearchNumber(12,5);
            System.out.println(result);
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }

        List<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        List<Integer> b = new ArrayList<>(Arrays.asList(4,2,34,2,5,7,12));
        List<Integer> c = new ArrayList<>();
        System.out.println(a);
        SortAlgorithms so = new SortAlgorithms(a);
        System.out.println( so.mergeSort(a) );

    }
}