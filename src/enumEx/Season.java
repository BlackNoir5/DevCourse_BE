package enumEx;

public enum Season {
    SPRING("봄"),
    SUMMER("여름"),
    AUTUMN("가을"),
    WINTER("겨울");

    private String season;

    private  Season(String season){
        this.season = season;
    }


    public String getSeason() {
        return season;
    }
}
