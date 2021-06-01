public class Cup {
    private Drink drink;
    private Shuger[] shugers;
    private Stick stick;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Shuger[] getShugers() {
        return shugers;
    }

    public void setShugers(Shuger[] shugers) {
        this.shugers = shugers;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public void setSugars(int sugarqaunt) {
        shugers= new Shuger[sugarqaunt];
        for (int i = 0; i < sugarqaunt; i++) {
            shugers[i]=new Shuger();
        }
    }
}
