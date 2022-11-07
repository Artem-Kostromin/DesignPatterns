package credentional.factory;

class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer hireDeveloper() {
        return new JavaDeveloper();
    }
}
