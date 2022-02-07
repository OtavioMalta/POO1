public class Main {
    public static void main(String[] args) {
        Item dvd = new DVD("Shrek 5", 80, "Épico!", "James Gunn");
        Item cd = new CD("Teodoro e Sampaio: Só as melhores", 45, "Quem ta com a roela do eno?", "Teodoro e Samapio");
        dvd.print();
        cd.print();
    }
}
