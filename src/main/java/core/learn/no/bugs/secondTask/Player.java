package core.learn.no.bugs.secondTask;

public class Player {
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public void levelUp() {
        this.level+=1;
    }

    public void addScore(int points) {
        this.score += points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", score=" + score +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
