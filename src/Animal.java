public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    protected Season season;
    protected Color color;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Season getSeason() {
        return season;
    }

    public Color getColor() {
        return color;
    }

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }
    @Override
    public void changeSeason() {
        int next = (this.season.ordinal() + 1) %  Season.values().length;
        this.season = Season.values()[next];
    }
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        Animal a = (Animal)o;
        if(a.weight< this.weight)
        {return 1;}
        return -1;
    }
}
