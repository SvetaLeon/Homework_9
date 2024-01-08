package homework9.regular;

public enum EnumSingleton {
    INSTANCE("Black");

    private String color;

    EnumSingleton(String color) {
        this.color = color;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        EnumSingleton colorCar1 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(colorCar1.getColor());

        EnumSingleton colorCar2 = EnumSingleton.INSTANCE.getInstance();
        colorCar2.setColor("Red");

        System.out.println(colorCar1.getColor());
        System.out.println(colorCar2.getColor());
    }
}
