import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {

        Representative r1 = new Representative(10, 500);
        Representative r2 = new Representative(7, 800);
        Representative r3 = new Representative(9, 250);

        Representative[] SalesRepresentative = {r1, r2, r3};

        Sort sort = new Sort();

        sort.bubbleSort(SalesRepresentative);

        

    }

}
