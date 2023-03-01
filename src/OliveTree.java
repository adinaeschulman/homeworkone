public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN );
    }

    @Override
    public String toString() {
        if (getCurrentSeason()==Season.FALL) {
            return ("Olive tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor);
        }
        return ("Olive tree. My height is: " + height + " and my color is: " + leavesColor );
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (getCurrentSeason() == Season.WINTER || getCurrentSeason() == Season.FALL) {
            this.height += 5;
        } else if (getCurrentSeason() == Season.SPRING || getCurrentSeason() == Season.SUMMER) {
            this.height += 10;
        }
    }
}
