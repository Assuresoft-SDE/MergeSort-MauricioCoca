import java.util.List;

public class SearchAlgorithms {
    private List<Integer> nums;

    public SearchAlgorithms(List<Integer> numbs) {
        this.nums = numbs;
    }

    public int jumpSearchNumber(int numb, int jump) throws Exception {
        if (jump >= nums.size() || jump <= 0) {
            throw new Exception("Error");
        }
        if (nums.get(0) > numb) return -1;
        int index = 0, lowerIndex = -1;
        boolean continueSearching = true;
        while (index < nums.size() && continueSearching) {
            int currentNumber = nums.get(index);
            if (currentNumber > numb) {
                lowerIndex = index - jump;
                continueSearching = false;
            } else if (currentNumber == numb) {
                return index;
            }
            index += jump;
        }
        if (lowerIndex == -1) return -1;
        while (lowerIndex < nums.size()) {
            int currentNumber = nums.get(lowerIndex);
            if (currentNumber == numb) {
                return lowerIndex;
            }
            lowerIndex += 1;
        }
        return -1;
    }

}
