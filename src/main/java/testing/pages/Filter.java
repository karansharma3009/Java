package testing.pages;

public interface  Filter {

    public ListingPage applyrefundableFilter(String refundabable);
    public ListingPage applyFlightFilter(String Filter);
    public ListingPage applyNoOfStopsFilter(String stops);

}
