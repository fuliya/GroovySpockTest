/**
 * Created by mjha1005 on 11/16/20.
 */
class PractiseCodingBat {
    /*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
    */

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b
        } else return 2 * (a + b)
    }



 /*   public static void main(String[] args) {
        int current = 1
        int next = 1
        List<Integer> list = new ArrayList<>()
        10.times {
            print current + ' '
            int newCurrent = next
            next = next + current
            list.add(current)
            current = newCurrent

        }
        int sum = 0
        for (int listInt : list) {
            sum = sum + listInt
        }
        println(' ')
        println('sum is ' + sum)

    }*/

    int sumOfFibonanci(int numberOfTimes) {
        int current = 1
        int next = 1
        List<Integer> list = new ArrayList<>()
        numberOfTimes.times {
            print current + ' '
            int newCurrent = next
            next = next + current
            list.add(current)
            current = newCurrent

        }
        int sum = 0
        for (int listInt : list) {
            sum = sum + listInt
        }
        return sum
    }

}
