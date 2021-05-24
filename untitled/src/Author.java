public class Author {

    private String name, email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String n) {
        this.email = n;
    }


    public String toString() {
        return "Author[name="+name+",email="+ email+ "]";
    }
}
