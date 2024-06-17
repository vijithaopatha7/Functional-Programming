object Q5 extends App {

    //Defining the function to find time taken for easy pace
    def easy (distance : Int) : Int = distance * 8

    //Defining the function to find time taken for tempo pace
    def tempo (distance : Int) : Int = distance * 7

    //Defining the function to get the total time taken for easy and tempo paces
    def total (easy_dist : Int, tempo_dist : Int) : Int = easy (easy_dist) + tempo (tempo_dist)

    //Calling the function total with distance of each pace and printing the result
    println ("Total running time = " + total (4 , 3) + " minutes") 
    
}