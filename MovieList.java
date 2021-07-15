import java.util.*;
import java.io.*;
public class MovieList {
    private ArrayList <String> movies;
    public MovieList(String pathname){
        movies = new ArrayList();
        File file = new File(pathname);
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                movies.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }

    public String getRandomMovie(){
        int movieIndex = (int)(Math.random() * movies.size());
        return movies.get(movieIndex);
    }
}
