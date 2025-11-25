/*
Write a test class containing test method that calculates the average 
marks that awarded by two reviewers prints whether writer is shortlisted
if average is >4. The marks are passed as parameters whose values are
passed from testing.xml at test level.
*/
package que1;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AverageMarksTest {

    @Test
    @Parameters({"mark1", "mark2"})
    public void calculateAverage(double mark1, double mark2) {
        System.out.println("Reviewer 1 mark: " + mark1);
        System.out.println("Reviewer 2 mark: " + mark2);

        double average = (mark1 + mark2) / 2.0;
        System.out.println("Average Marks: " + average);

        if (average > 4.0) {
            System.out.println("Writer is shortlisted..");
        } else {
            System.out.println("Writer is NOT shortlisted.");
        }
    }
}
