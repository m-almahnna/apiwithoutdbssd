public class PersonDetails {
    private int Id = 123;
    private String name = "mohammed";
    private String title = " trying api with DB ";

    public PersonDetails(Integer id) {

    }

    public PersonDetails() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "PersonDetails{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
