public class Bear extends Animal {

    Bear(int weight, Season season) {

        super(weight,season,Color.BROWN);
    }
    @Override
    public String toString() {
        if (getCurrentSeason()==Season.WINTER) {
            return ("Bear: I am sleeping. My weight is: " + weight + " and my color is: BROWN");
        }
        return ("Bear: My weight is: " + weight + " and my color is: BROWN");
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (getCurrentSeason()==Season.WINTER) {
            this.setWeight((int) (weight * 0.8));
        } else if (getCurrentSeason()==Season.SPRING ) {
            this.setWeight((int) (weight * 0.75));
        } else if ( getCurrentSeason()==Season.SUMMER) {
            this.setWeight((int) (weight * 1.33));
        } else if (getCurrentSeason()==Season.FALL) {
            this.setWeight((int) (weight * 1.25));
        }
    }
}
