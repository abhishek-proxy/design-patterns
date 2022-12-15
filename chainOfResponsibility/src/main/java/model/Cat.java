package model;

public class Cat implements IAnimal {
    private Integer legs;
    private Boolean canFly;
    private Boolean canSwim;

    public Cat(Integer legs, Boolean canFly, Boolean canSwim) {
        this.legs = legs;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    @Override
    public Integer getLegs() {
        return null;
    }

    @Override
    public Boolean canFly() {
        return null;
    }

    @Override
    public Boolean canSwim() {
        return null;
    }
}
