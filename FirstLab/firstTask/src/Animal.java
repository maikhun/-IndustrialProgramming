public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Animal name: " + name);
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        return name.hashCode() * 29;
    }

}
