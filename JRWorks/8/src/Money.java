public abstract class Money {
    private int amound;

    public Money(int amound) {
        this.amound = amound;
    }

    int getAmound(){
          return amound;
    }
    abstract String getCurrencyName();



}
