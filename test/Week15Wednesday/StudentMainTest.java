package Week15Wednesday;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentMainTest {

 /* @Test
  void giveGrades() {
    //Arrange
    StudentMain main = new StudentMain();
    Student student = new Student("Jens", null);
    int[] expected = {4,7,10,12,10,7,10};
    //Act

    int[] act = main.giveGrades();

    //Assert
    assertArrayEquals(expected, act);
  }
  */
  @Test
  void giveGradesValidation(){
    StudentMain main = new StudentMain();
    Student student = new Student("Jens", null);

  }
}