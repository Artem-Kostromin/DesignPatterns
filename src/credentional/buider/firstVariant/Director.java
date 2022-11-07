package credentional.buider.firstVariant;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuider(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public Website buildWebsite(){
        websiteBuilder.createWebSite();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();
        Website website = websiteBuilder.getWebsite();
        return website;
    }
}
