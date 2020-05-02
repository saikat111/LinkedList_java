public class Number {
   private int nam;
    private Number next;

    public Number(int nam) {
        this.nam = nam;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public Number getNext() {
        return next;
    }

    public void setNext(Number next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Number{" +
                "nam=" + nam +
                '}';
    }
}
