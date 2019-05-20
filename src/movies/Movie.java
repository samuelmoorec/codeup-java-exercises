package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String title,String genre){
        this.name = title;
        this.category = genre;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
