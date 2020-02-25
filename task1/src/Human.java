public class Human {

    enum Nationality{
        Russian,
        American,
        Australian,
        Unknown
    };

    private final String name;
    private final double height;
    private final double weight;
    private final int age;
    private final Nationality nationality;
    private boolean isSleep=false;
    private static int count=0;

    Human(){
        name="Unknown";
        height=1;
        weight=1;
        age=1;
        nationality=Nationality.Unknown;
        increment();
    }

    Human(final String name,
          final double height,
          final double weight,
          final int age,
          final Nationality nationality){
        if(name.isEmpty()||height<=0||weight<=0||age<0){
            throw new RuntimeException("ошибка при создании человека");
        }
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.age=age;
        this.nationality=nationality;
        increment();
    }

    public boolean isSleep() {
        return isSleep;
    }

    private void increment(){
        count++;
    }

    public void introduce(){
        if (isSleep) {
            System.out.println("Zzzz...");
        } else {
            System.out.println("Меня зовут " + name + ". Мне " + age + " лет. Я - " + nationality);
        }
    }

    public void eat(final String foodName){
        if (isSleep) {
            System.out.println("Zzzz...");
        } else {
            System.out.println(name + " съел еду " + foodName);
        }
    }

    public void walk(){
        if (isSleep) {
            System.out.println("Zzzz...");
        } else {
            System.out.println(name + " погулял");
        }
    }

    public void sleep(){
        isSleep=!isSleep;
        if (isSleep){
            System.out.println(name+" лег спать");
        } else {
            System.out.println(name+" поспал");
        }
    }
    public double getBodyMassRatio(){
        if (Math.abs(height) < 2 * Double.MIN_VALUE) {
            return 0;
        }
        return weight/(height*height);
    }

    public String getName(){
        return name;
    }
}
