package normal;

import java.util.ArrayList;
import java.util.Random;

public class UseRandom {

    //    输入百分比概率prob，中 则返回true；
    public static Boolean rollDice(Integer prob) {
        Random random = new Random();
        if (random.nextInt(99) <= prob)
            return true;
        else
            return false;
    }

    //    从min 和 max之间选一个数
    public static Integer rollRandom(Integer min, Integer max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    //    从min和max之间选取num个不相同的数组成列；
    public static ArrayList<Integer> rollRandomList(Integer min, Integer max, Integer num) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            Boolean flag = true;
            Integer selectNum = 0;
            while (flag) {
                selectNum = random.nextInt(max - min) + min;
                if(integerList.size()>0){
                    for (int j = 0; j < integerList.size(); j++) {
                        if (selectNum == integerList.get(j))
                            flag = flag | true;
                        else flag = false;
                    }
                }else flag = false;
            }
            integerList.add(selectNum);
        }
        return integerList;
    }

}
