package WhatsUpUsers;

public class Group {
    private static long counter = 0;
    private Long id;
    private String name;
    private int phoneNumber;
    private String pasword;
    private Image image;
    private Status status;
    private String password;
    public Group() {
        this.id = ++counter;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.image = new Image("default/path/to/image");
        this.status = new Status("default/path/to/status");

    }

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        Group.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword =pasword;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", pasword='" + pasword + '\'' +
                ", image=" + image +
                ", status=" + status +
                ", password='" + password + '\'' +
                '}';
    }
}
