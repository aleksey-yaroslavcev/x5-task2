public class Main {
    public static void main(String[] args) {
        Human h1=new Human("John",10,20,30, Human.Nationality.American);
        Human h2=new Human("Peter",20,30,40, Human.Nationality.Russian);
        Human h3=new Human("Nataly",30,40,50, Human.Nationality.Australian);
        Human h4=new Human("Eva",40,50,60, Human.Nationality.American);
        Human h5=new Human("Anna",50,60,70, Human.Nationality.American);

        Spa spa=new Spa();

        spa.service(h1);
        spa.service(h2);
        spa.service(h3);
        spa.service(h4);
        spa.service(h5);

        System.out.println("В Спа отдохнуло "+spa.getHumanCount()+" людей");
    }
}
