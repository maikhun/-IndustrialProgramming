public class Puppy extends Dog{
    public Puppy(String name) {
        super(name);
    }
    @Override
    public int hashCode() {
        return super.hashCode()*31;
    }
}
