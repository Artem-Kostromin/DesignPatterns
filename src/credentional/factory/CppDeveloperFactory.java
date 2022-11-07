package credentional.factory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer hireDeveloper() {
        return new CppDeveloper();
    }
}
