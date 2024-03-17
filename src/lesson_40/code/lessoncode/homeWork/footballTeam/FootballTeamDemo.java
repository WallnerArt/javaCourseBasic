package lesson_40.code.lessoncode.homeWork.footballTeam;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FootballTeamDemo {

    public static void main(String[] args) {
        List<FootballTeam> footballTeams = Arrays.asList(
                new FootballTeam("Dusseldorf", 7),
                new FootballTeam("Essen", 4),
                new FootballTeam("Cologne", 5),
                new FootballTeam("Dortmund", 6),
                new FootballTeam("Bonn", 3),
                new FootballTeam("Berlin", 6),
                new FootballTeam("Leipzig", 5),
                new FootballTeam("Essen 2", 3),
                new FootballTeam("Essen 3", 3)
        );

        // Отбор самой сильной команды
        FootballTeam strongestTeam = footballTeams.stream()
                .max(Comparator.comparingInt(FootballTeam::getStrength))
                .orElseThrow(() -> new IllegalArgumentException("Коллекция команд пуста"));

        System.out.println("Самая сильная команда: " + strongestTeam);

        // Отбор всех команд из Essen
        List<FootballTeam> essenTeams = footballTeams.stream()
                .filter(team -> team.getName().startsWith("Essen"))
                .toList();

        System.out.println("Команды из Essen: " + essenTeams);
    }
}