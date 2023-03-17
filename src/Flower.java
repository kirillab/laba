public abstract class Flower{
    private final String name, color;
    private final int length, freshLevel;
    private int price;

    protected Flower(String name, String color, int length, int freshLevel, int price) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.freshLevel = freshLevel;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getLength() {
        return length;
    }
    public int getFreshLevel() {
        return freshLevel;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Название: " + name + "\n" +
                "Цвет: " + color + "\n" +
                "Длина стебля: " + length + "\n" +
                "Уровень свежести: " + freshLevel + "\n" +
                "Цена: " + price + "\n" + "-----------------------" + "\n";
    }

}







