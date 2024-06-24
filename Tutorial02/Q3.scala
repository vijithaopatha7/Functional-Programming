object Q3 extends App {
    
    def normal (n_hrs : Int) : Int = n_hrs * 250

    def ot (ot_hrs : Int) : Int = ot_hrs * 85

    def tot_sal (n_hrs : Int, ot_hrs : Int) : Int = normal(n_hrs) + ot(ot_hrs)
    
    def final_sal (n_hrs : Int, ot_hrs : Int) : Double = tot_sal(n_hrs, ot_hrs) *  .88

    printf ("Take home salary = Rs. %.2f", final_sal(40,30))
}