public class Sort {

    public void bubbleSort(Representative[] SalesRepresentative) {

        Representative changer = new Representative(0, 0);
        for (int i = 0; i <= SalesRepresentative.length - 1; i++) {
            if (SalesRepresentative[i].sales < SalesRepresentative[i + 1].sales) {
                changer = SalesRepresentative[i];
                SalesRepresentative[i] = SalesRepresentative[i + 1];
                SalesRepresentative[i + 1] = changer;
            }
        }

    }

}
