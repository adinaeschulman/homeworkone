public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Color getLeavesColor() {
        return leavesColor;
    }

    public void setLeavesColor(Color leavesColor) {
        this.leavesColor = leavesColor;
    }

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
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
        Tree t = (Tree)o;
        if(t.height< this.height)
        {return 1;}
        return -1;
    }
    }

