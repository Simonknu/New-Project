public class Controller {
    private MovieList movieList;


    public Controller(){
        movieList = new MovieList("movieList");
    }

    public void createMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieList.createMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }
    public void showMovieList(){
        movieList.showMovieList();
    }

    public void showMovie(String name){
        movieList.showMovie(name);
    }
    public void editMovie(){
        movieList.editMovie();
    }


}
