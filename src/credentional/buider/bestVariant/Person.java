package credentional.buider.bestVariant;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;

    static class Builder{
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder name(String name){
            newPerson.name = name;
            return this;
        }

        public Builder surname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder age(int age){
            newPerson.age = age;
            return this;
        }

        public Builder height(int height){
            newPerson.height = height;
            return this;
        }

        public Builder weight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
