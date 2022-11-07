package credentional.buider.firstVariant;

public class VisitCardWebsiteBuider extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
