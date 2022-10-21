public class Flower {

    private String flowerColor;
    private String country;
    private float cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, float cost, int lifeSpan) {

        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan < 0 && lifeSpan > -14)
            this.lifeSpan = Math.abs(lifeSpan);
        if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerColor, String country, float cost) {

        this(flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {

        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }


    @Override
    public String toString() {
        return "Цветок: " + flowerColor + ", " +
                "Страна производства: " + country + ", " +
                "Цена: " + cost + ", " +
                "Срок цветения: " + lifeSpan;
    }
    public void printFlower() {
        System.out.println(toString());

    }
}
