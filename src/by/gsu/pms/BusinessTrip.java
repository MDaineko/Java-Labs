package by.gsu.pms;

public class BusinessTrip {
    public final int DAILY_RATE = 25000;
    private String account;
    private int transport ;
    private int days;

    // Default constructor
    public BusinessTrip() {
        super();
    }

    // General-purpose constructor
    public BusinessTrip(String account, int transport, int days) {
        super();
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    // Methods
    public int getTotal() {
        return DAILY_RATE * days + transport;
    }

    public void show() {
        System.out.println("rate = " + DAILY_RATE +
                "\naccount = " + account +
                "\ntransport = " + transport +
                "\ndays = " + days +
                "\ntotal = " + getTotal());
    }

    @Override
    public String toString() {
        return DAILY_RATE + "; " + account + "; " + transport + "; " + days + "; " + getTotal();
    }
}
