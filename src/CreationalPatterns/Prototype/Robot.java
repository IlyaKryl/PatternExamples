package CreationalPatterns.Prototype;

public class Robot implements Copyable {
    private int id;
    private String company;
    private double version;

    public Robot(int id, String company, double version) {
        this.id = id;
        this.company = company;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public Object copy() {
        return new Robot(id, company, version);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", version=" + version +
                '}';
    }
}
