object Q1 extends App {

    //Defining the function to find the area of a disk with radius r
    def area (r : Int) : Double = math.Pi * r * r

    //Calling the function area with 5 as the radius and printing the result
    println ("Area of a disk with radius 5 = " + area (5) + " square units")

}