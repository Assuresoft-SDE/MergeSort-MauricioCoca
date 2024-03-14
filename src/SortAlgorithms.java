import java.util.List;
import java.util.ArrayList;

public class SortAlgorithms {
    private List<Integer> nums;

    public SortAlgorithms(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Integer> mergeSort(List<Integer> nums) {
        if (nums.size() <= 1) {
            return nums;
        } else {
            int middleIndex = nums.size() / 2;
            List<Integer> leftSublist = nums.subList(0, middleIndex);
            List<Integer> rightSublist = nums.subList(middleIndex, nums.size());
            return merge(mergeSort(leftSublist), mergeSort(rightSublist));
        }
    }

    public List<Integer> merge(List<Integer> leftSublist, List<Integer> rightSublist) {
        if (leftSublist.size() == 0) return rightSublist;
        else if (rightSublist.size() == 0) return leftSublist;
        else {
            List<Integer> mergedLists = new ArrayList<>();
            if(leftSublist.get(0) < rightSublist.get(0)){
                mergedLists.add(leftSublist.get(0));
                mergedLists.addAll( merge( leftSublist.subList(1,leftSublist.size()), rightSublist ) );
            }
            else{
                mergedLists.add(rightSublist.get(0));
                mergedLists.addAll( merge(leftSublist, rightSublist.subList(1,rightSublist.size())) );
            }
            return mergedLists;
        }
    }
}
