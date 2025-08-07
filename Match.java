import java.util.List;
import java.util.stream.Collectors;

public class Match {
    private int id;
    private String date;
    private String endroit;

    public Match(String id, String date, String endroit) {
        this.id = Integer.parseInt(id);
        this.date = date;
        this.endroit = endroit;
    }
    public List<Match> getMatches(List<Match> matches) {
        return matches.stream()
                .filter(m -> m.getId() == this.id).collect(Collectors.toList());


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Match id: " + id);

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEndroit() {
        return endroit;
    }

    public void setEndroit(String endroit) {
        this.endroit = endroit;
        System.out.println("Votre match a été fait: " + endroit);
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", endroit='" + endroit + '\'' +
                '}';
    }

}

