public class ক্যালকুলেটর {
    private int যোগ(int ক, int খ) {return ক + খ;}
    private int বিয়োগ(int ক, int খ) {return ক - খ;}

    public static void main(String[] args) {
        int ক = 55;
        int খ = 45;

        ক্যালকুলেটর ক্যালকুলেটর = new ক্যালকুলেটর();

        int যোগফল = ক্যালকুলেটর.যোগ(ক, খ);
        int বিয়োগফল = ক্যালকুলেটর.বিয়োগ(ক, খ);

        System.out.println("যোগফলঃ " + যোগফল);
        System.out.println("বিয়োগফলঃ " + বিয়োগফল);
    }
}
