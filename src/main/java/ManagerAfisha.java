public class ManagerAfisha {

    private String[] movies = new String[0];
    private int limit;

    public ManagerAfisha() {
        limit = 10;
    }

    public ManagerAfisha(int limit) {
        this.limit = limit;
    }


    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = limit < movies.length ? limit : movies.length;

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }
}
