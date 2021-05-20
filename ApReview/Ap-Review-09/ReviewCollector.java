public class ProductReview {
    private String name;
    private String review;

    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    public String getName() { return name; }

    public String getReview() { return review; }
}

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    // Part A
    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if (productList.indexOf(prodReview.getName()) == -1) productList.add(prodReview.getName());
    }

    // Part B
    public int getNumGoodReviews(String prodName) {
        int count = 0;
        for (ProductReview x : reviewList) {
            if (x.getName().equals(prodName) && x.getReview().indexOf("best") != -1) count++;
        }
        return count;
    }

}
