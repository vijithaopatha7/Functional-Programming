object Q2 extends App {

    //Defining the function to convert a Celsius value into Fahrenheit
    def C_to_F (celsius : Int) : Double = celsius * 1.8 + 32

    //Calling the function with Celsius value and printing the result
    println ("35 Celsius = " + C_to_F (35) + " Fahrenheit\n")
    
}