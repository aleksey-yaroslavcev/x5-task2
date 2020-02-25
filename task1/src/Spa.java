public class Spa {

    private int humanCount=0;

    public int getHumanCount() {
        return humanCount;
    }

    public void service(Human human){
        if (human.isSleep()){
            throw new RuntimeException("Спящий человек не может прийти в Спа");
        }
        System.out.println(human.getName()+" пришёл");
        human.introduce();
        human.sleep();
        human.sleep();
        human.walk();
        human.eat("Бургер");
        System.out.println(human.getName()+" отдохнул");
        humanCount++;
    }
    public void service(Human human1, Human human2){
        service(human1);
        service(human2);
    }
    public void service(Human human1, Human human2, Human human3) {
        service(human1);
        service(human2);
        service(human3);
    }
}
