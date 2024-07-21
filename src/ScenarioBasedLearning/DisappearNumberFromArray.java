package src.ScenarioBasedLearning;
class NumberArray{

    public java.util.List< Integer> findDisappearNumbers ( int[] numberValue ) {
        // First loop: mark the numbers that are present in the array
        for (int i = 0; i < numberValue.length; i++) {
            int val = Math.abs(numberValue[i]) - 1;
            if (numberValue[val] > 0) {
                numberValue[val] = -numberValue[val];
            }
        }
        // Collect numbers that are still positive
        return java.util.stream.IntStream.range(0, numberValue.length)
                .filter(i -> numberValue[i] > 0)
                .mapToObj(i -> i + 1)
                .collect( java.util.stream.Collectors.toList());
    }
}
public class DisappearNumberFromArray {
    public static void main(String[] args){
        NumberArray numberArray = new src.ScenarioBasedLearning.NumberArray ();
        int[] numberValue = {1,4,5,6,8,3,2,1,5,9};
        java.util.List < Integer> disappearNumbers = numberArray.findDisappearNumbers(numberValue);
        System.out.println(disappearNumbers);
    }
}
