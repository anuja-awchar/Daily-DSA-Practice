import java.util.*;
public class ContainsDuplicate{
  public boolean containsDuplicate(int [] nums){
    HashSet<Integer> set = new HashSet<>();

    for (int num : nums){
      if (set.contains(num)){
        return true;
      }
      set.add(num);
    }
    return false;
  }
}
