public class Pet {

    private final String name;

    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false; // Pets are dirty by default
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(final boolean clean) {
        this.clean = clean;
    }

}