public class Kubek {

    double ileLitrow;
    double pojemnosc;

    Kubek(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    public void setIleLitrow(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    boolean sprawdzenie(double ilosc) {
        double pojemnoscWlej = ileLitrow + ilosc;
        return pojemnoscWlej < pojemnosc;
    }

    void doPelna(double ilosc) {
        double pojemnoscWlej = ilosc + ileLitrow;
        if (pojemnoscWlej > pojemnosc) {
            setIleLitrow(getPojemnosc());
        } else {
            setIleLitrow(ileLitrow + ilosc);
        }
    }

    public void wlej(double ilosc) {
        if (sprawdzenie(ilosc)) {
            this.ileLitrow += ilosc;
        } else {
            doPelna(ilosc);
        }
    }

    boolean wylej(double ilosc) {
        if (ilosc < ileLitrow) {
            this.ileLitrow -= ilosc;
            return true;
        } else {
            return false;
        }
    }

    void przelej(double ilosc, Kubek gdziePrzelac) {
        if (this.wylej(ilosc)) {
            gdziePrzelac.wlej(ilosc);
        } else {
            System.out.println("za malo");
        }
    }
}


