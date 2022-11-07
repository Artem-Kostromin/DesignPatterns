package credentional.buider.firstVariant;

public class EnterpriseSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice");
    }

    @Override
    void buildPrice() {
        website.setPrice(2000);
    }
}
