// Scala program to create a currying function
// to add two numbers

object Sample {
  def main(args: Array[String])= {
    var result: Int = 0;

    // Function calling
    result = AddNum(10, 20);

    printf("Result : %d\n", result);
  }
  
  // Function definition of currying function.
  def AddNum(num1: Int, num2: Int) = num1 + num2;
}
