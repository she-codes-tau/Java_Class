public class Lesson09 {

    public class Player{
        private String name;
        private int score;

        public Player(String name, int score)
        {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString()
        {
            String player = "Player name: " + this.name + " , Player score: " + this.score;
            return player;
        }

        public void updateScore(int new_points){
            this.score += new_points;
        }

    }

    public class TestingPlayerClass{
        public void mainTest()
        {
            Player player01 = new Player("Shani", 12);
            System.out.println("Player01 description: ");
            System.out.println(player01.toString());
            System.out.println();

            player01.updateScore(4);
            System.out.println("Player01 description after change: ");
            System.out.println(player01.toString());
        }
    }

}
