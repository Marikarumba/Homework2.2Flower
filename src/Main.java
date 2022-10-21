public class Main {


    private static void countCostBouquet (Flower ... flowers) {
        System.out.println("Состав букета");
        float costBouquet = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            costBouquet += flower.getCost();
            flower.printFlower();
        }
        System.out.println( "Стоимость букета: "+ costBouquet);
        System.out.println("Срок стояния букета: "+ minimumLifeSpan);
}


    public static void main(String[] args) {


        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f);
        Flower chrysanthemum = new Flower("Хризантема", null, 15f, 5);
        Flower peony = new Flower("Пион", "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5f, 10);

        rose.printFlower();
        chrysanthemum.printFlower();
        peony.printFlower();
        gypsophila.printFlower();

        Flower [] bouquet = {rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila};


        countCostBouquet(bouquet);

    }
}

