import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Kubek [] kubek = new Kubek[4];

        //kubek[0] = new Kubek(5, 10);
        //kubek[1] = new Kubek(6, 15);
       // kubek[2] = new Kubek(4, 20);
       // kubek[3] = new Ku bek(3, 25);

        //List<Kubek> listaKubkow = new ArrayList<>();


        Kubek kubek1 = new Kubek(2,10);
        Kubek kubek2 = new Kubek(6,15);
        Kubek kubek3 = new Kubek(4, 20);

        kubek1.wlej(15);

        System.out.println(kubek1.getIleLitrow());
        //System.out.println(kubek[0].ileLitrow);
        //System.out.println(kubek[2].ileLitrow);

//        List<Kubek> listaXyz = List.of(new Kubek(9,10),
//                new Kubek(6,15),
//                new Kubek(4, 20));
//        listaXyz.get(0).
    }
}
