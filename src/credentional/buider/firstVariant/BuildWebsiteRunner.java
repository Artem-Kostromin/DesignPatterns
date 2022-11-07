package credentional.buider.firstVariant;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuider(new EnterpriseSiteBuilder());
        System.out.println(director.buildWebsite());
    }


}
