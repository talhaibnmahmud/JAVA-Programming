public class LevelExample {
    public static void main(String[] args) {
        Level[] levels = Level.values();

        for(Level level : levels) {
            System.out.println(level + " " + level.getLevelCode());
        }
    }
}
