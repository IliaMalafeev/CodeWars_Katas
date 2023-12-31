package CodeWarsKatas5KYU;

import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    For this exercise you will be strengthening your page-fu mastery.
    You will complete the PaginationHelper class, which is a utility
    class helpful for querying paging information related to an array.

    The class is designed to take in an array of values and an integer
    indicating how many items will be allowed per each page. The types
    of values contained within the collection/array are not relevant.

    The following are some examples of how this class is used:

        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

        helper.pageCount(); // should == 2
        helper.itemCount(); // should == 6
        helper.pageItemCount(0); // should == 4
        helper.pageItemCount(1); // last page - should == 2
        helper.pageItemCount(2); // should == -1 since the page is invalid

        // pageIndex takes an item index and returns the page that it belongs on
        helper.pageIndex(5); // should == 1 (zero based index)
        helper.pageIndex(2); // should == 0
        helper.pageIndex(20); // should == -1
        helper.pageIndex(-10); // should == -1
---------------------------------------------------> */

public class K19_PaginationHelper {

    public static void main(String[] args) {

        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

        System.out.println(helper.pageCount()); // should == 2
        System.out.println(helper.itemCount()); // should == 6
        System.out.println(helper.pageItemCount(0)); // should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid
        System.out.println(helper.pageIndex(5)); // should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); // should == 0
        System.out.println(helper.pageIndex(20)); // should == -1
        System.out.println(helper.pageIndex(-10)); // should == -1


        System.out.println("---------------------------------------------------");


        PaginationHelper<Character> helper2 = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3);

        System.out.println(helper2.pageCount()); // should == 4
        System.out.println(helper2.itemCount()); // should == 11
        System.out.println(helper2.pageItemCount(0)); // should == 3
        System.out.println(helper2.pageItemCount(2)); // should == 3
        System.out.println(helper2.pageItemCount(3)); // last page - should == 2
        System.out.println(helper2.pageItemCount(5)); // should == -1 since the page is invalid
        System.out.println(helper2.pageIndex(5)); // should == 1 (zero based index)
        System.out.println(helper2.pageIndex(2)); // should == 0
        System.out.println(helper2.pageIndex(20)); // should == -1
        System.out.println(helper2.pageIndex(-10)); // should == -1


        System.out.println("---------------------------------------------------");


        PaginationHelper<Character> helper3 = new PaginationHelper<>(List.of(), 10);

        System.out.println(helper3.pageCount()); // should == 0
        System.out.println(helper3.itemCount()); // should == 0
        System.out.println(helper3.pageItemCount(0)); // should == -1
        System.out.println(helper3.pageItemCount(1)); // should == -1
        System.out.println(helper3.pageIndex(0)); // should == -1
        System.out.println(helper3.pageIndex(1)); // should == -1
        System.out.println(helper3.pageIndex(-1)); // should == -1
    }

}


class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and an integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {

        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {

        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {

        return (int) Math.ceil((this.collection.size() * 1.0) / this.itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if (itemCount() == 0) return -1;

        if (pageIndex < 0 || pageIndex >= pageCount()) return -1;

        if (pageIndex < (pageCount() - 1)) return this.itemsPerPage;

        if (pageIndex == (pageCount() - 1)) return itemCount() - (pageIndex * this.itemsPerPage);

        return 0;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if (itemCount() == 0) return -1;

        if (itemIndex < 0 || itemIndex > (itemCount() - 1)) return -1;

        return itemIndex / this.itemsPerPage;
    }
}