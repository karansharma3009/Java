package Builder.BuilderPattern;

 class ListingPage
 {

     private String flight ;
     private String URL;

     public ListingPage( ListingPageBuilder lpb)  // this is one of the important Step
     {
         this.flight = lpb.flight;
         this.URL = lpb.URL;
     }
     public void scrollToEnd()
     {
         System.out.println("scrolling List till end of page");
     }

     public void login()
     {
         System.out.println("login into login module");
     }

     public void logout()
     {
         System.out.println("logout from listingpage SSO section");
     }

     public void applyFilter(String flight)
     {
         System.out.println("Appliying Filter "+ flight);
     }

     public void removeFilter(String flight)
     {
         System.out.println("removing  Filter "+ flight);
     }


     public static class ListingPageBuilder // This is another step
     {
         private String flight ;
         private String URL;
         public ListingPageBuilder  (String URL)
         {
             this.URL = URL;
            // System.out.println(a);
         }

         public ListingPageBuilder scrollToEnd()
         {
             System.out.println("scrolling List till end of page");
             return this;
         }

         public ListingPageBuilder login()
         {
             System.out.println("login into login module");
             return this;
         }

         public ListingPageBuilder logout()
         {
             System.out.println("logout from listingpage SSO section");
             return this;
         }

         public ListingPageBuilder applyFilter(String flight)
         {
             System.out.println("Appliying Filter "+ flight);
             return this;
         }

         public ListingPageBuilder removeFilter(String flight)
         {
             System.out.println("removing  Filter "+ flight);
             return this;
         }

         public ListingPage build()  // Finally this is one
         {
             ListingPage lp = new ListingPage(this);
             return lp;
         }

     }


}


public class UserBuilder {

    public static void main(String[] args) {
        System.out.println("FirstCase");
        ListingPage listingPage = new ListingPage.ListingPageBuilder("www.listing.com").applyFilter("6E").build();
        System.out.println("Second Case");
        listingPage = new ListingPage.ListingPageBuilder("www.listing.com").applyFilter("6E").removeFilter("6E").login().logout().build();
    }
}


