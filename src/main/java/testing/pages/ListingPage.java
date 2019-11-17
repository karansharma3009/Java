package testing.pages;

public class ListingPage implements  Filter{

    private ListingPage lp;
    public ListingPage()
    {

    }
    public ListingPage applyrefundableFilter(String refundabable) {
        System.out.println("Applied Listing Filter"+ refundabable);
        return this;
    }

    public ListingPage applyFlightFilter(String Filter) {
        System.out.println("Applied FLight Filter" + Filter);
        return this;
    }

    public ListingPage applyNoOfStopsFilter(String stops) {
        System.out.println("Applied STop Filter"+ stops);
        return this;
    }
}
