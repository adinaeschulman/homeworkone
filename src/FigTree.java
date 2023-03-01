public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,null );
        if(season==Season.SPRING)
        {leavesColor=Color.GREEN;}
        if (season ==Season.FALL)
        {leavesColor=Color.YELLOW;}
    }

    @Override
    public String toString() {
        if (getCurrentSeason()==Season.WINTER) {
            return ("Fig tree. I have no leaves My height is: " + height);
        } else if (getCurrentSeason()==Season.SUMMER) {
            return ("Fig tree. My height is: "  + height + " I give fruit"  );
        } else if (getCurrentSeason()==Season.SPRING ) {
            return("Fig tree. My height is: " + height  + " and my color is: " + leavesColor  );
        } else if (getCurrentSeason()==Season.FALL) {
            return("Fig tree. My height is: " + height + " and my color is: " + leavesColor );

        }


        return null;
    }
    @Override
    public void changeSeason() {
       super.changeSeason();
        if (getCurrentSeason()== Season.WINTER)
        {
            this.height+=20;

        } else if (getCurrentSeason()== Season.SPRING) {
            this.height+=30;
            setLeavesColor(Color.GREEN);
        } else if (getCurrentSeason()== Season.FALL) {
            this.height+=20;
            setLeavesColor(Color.YELLOW);
        } else if (getCurrentSeason()== Season.SUMMER) {
            this.height+=30;
        }
    }
}
