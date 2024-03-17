package enumExamples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        //public, static and final
        //since its final you cant create child enums
        // type is Week

        Week() {
            System.out.println("constructor called for "+ this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // becuz this is not the enum objects
        // enums are used when we want a fixed number of objects

        // internally: public static final Week Monday = new Week();
        
        // enums can implement as many interfaces, but it can't extend
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
//        for (Week day:Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week);
        System.out.println(week.ordinal()); // gives the pos
    }
}
