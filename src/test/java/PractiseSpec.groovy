import spock.lang.Specification

/**
 * Created by mjha1005 on 11/16/20.
 */
class PractiseSpec extends Specification {

    def 'test for add'() {
        String s = "Hello"
        given:
        PractiseCodingBat practiseCodingBat = new PractiseCodingBat()

        when:
        practiseCodingBat.sumDouble(4, 5)

        then:
        9
        s.equalsIgnoreCase()
    }
/**
 Write a method to test the first 10 fibonacci series and assert the below condition.
 1) Asserts the 10th index int he series is IndexOutOfBound Exception
 2) Asserts the 8th Index is 34
 3) Assert the sum of the the series. calculate is programetly
 4) assert the size of the list is number of time i.e 10
 5) assert the series have number 21 in the list
 6) find the minimum and maximum number in the list
 */
    def 'test for Sum of Fib'() {
        given:
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
        when:
        int sum = 0
        list.each {
            items -> sum += items
        }
        println()
        println('sum is: ' + sum)
        then:
        sum == 143
        assert list.size() == 10

        when:
        list.get(10)

        then:
        final IndexOutOfBoundsException exception = thrown()
        exception.getMessage() != null
        list.get(8) == 34
        list.contains(21)
        list.max() == 55
        list.min() == 1
    }
}
