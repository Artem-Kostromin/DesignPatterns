package credentional.buider.firstVariant;

public abstract class WebsiteBuilder {
    Website website;

    void createWebSite(){
        website = new Website();
    }

    abstract void buildName();

    abstract void buildPrice();

    public Website getWebsite(){
        return website;
    }
}
