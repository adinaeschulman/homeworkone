public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight,season, Color.BROWN);
        if(season == Season.WINTER)
            color = Color.WHITE;
    }

    @Override
    public String toString() {
        if (getCurrentSeason()==Season.WINTER) {
            return ("Caribou: I am migrating south. My weight is: " + weight + " and my color is: " + Color.WHITE);
        }
        if (getCurrentSeason()==Season.SUMMER) {
            return ("Caribou: I am migrating north. My weight is: " + weight + " and my color is: " + Color.BROWN );
        }
        return ("Caribou: My weight is: " + weight + " and my color is: " + this.color);
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        if (getCurrentSeason()==Season.WINTER) {
            color = Color.WHITE;
        } else if (getCurrentSeason()==Season.SPRING ) {
            color = Color.BROWN;
        }}
}
