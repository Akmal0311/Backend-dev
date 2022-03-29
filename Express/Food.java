package Express;

public class Food {
    private String name;
    private String description;
    private float cost;
    private float time;
    private boolean have;

    public Food(String name, String description, float cost, float time) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
}
