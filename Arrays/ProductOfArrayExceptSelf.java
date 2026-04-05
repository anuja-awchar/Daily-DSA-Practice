import java.util.*;

public class ProductOfArrayExceptSelf{
  public int[] productExceptsSelf(int[] nums){
    int n = nums.length;
    int[] answer = new int[n];

    for(int i = 0; i < n; i++){
      int product  = 1;

      for(int j = 0; j < n; j++){
        if(i != j){
          product *= nums[j];
        }
      }
      answer[i] = product;
    }
    return answer;
  }
}
