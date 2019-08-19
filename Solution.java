import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>>generate(int numRows){
        //list 是一种引用，List类型接口引用
        //list 逻辑上是一种 线性表
        //线性表的元素类型是 List<Integer>
        //                  List类型接口引用
        //                  元素类型是Integer类类型的引用
        //                  Integer 是 int 的包装类 Integer是引用
        List<List<Integer>> list=new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>(i+1));
        }
        list.get(0).add(1);
        list.get(1).add(1);
        list.get(1).add(1);
        for(int i=2;i<numRows;i++){
            List<Integer> nums=list.get(i);
            nums.add(1);
            for(int j=1;j<i;j++){
                int num=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                nums.add(num);
            }
            nums.add(1);
        }
        return list;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.generate(4));

    }
}