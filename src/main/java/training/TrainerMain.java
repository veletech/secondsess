package training;

public class TrainerMain {
    public static void main(String[] args) {
/*
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.yearOfBirth = 1980;
        System.out.println(trainer.name);
        System.out.println(trainer.yearOfBirth);
        System.out.println();
        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jane Doe";
        anotherTrainer.yearOfBirth = 1972;
        System.out.println(anotherTrainer.name);
        System.out.println(anotherTrainer.yearOfBirth);

        Trainer trainer1 = new Trainer();
        trainer1.name = "Jill Die";
        trainer1.yearOfBirth = 1973;

        System.out.println(trainer1.getNameAndAge());

        System.out.println(trainer1.getAge(2022));


        Trainer trainer2 = new Trainer();
        trainer2.name = "jo Zsi";
        trainer2.changeName("jack doe");
        System.out.println(trainer2.name);
*/
        Trainer trainer = new Trainer();
        trainer.setName("Jo Zsi");
        trainer.setYearOfBirth(2001);
        System.out.println(trainer.getNameAndAge());
        System.out.println(trainer.getName());
        System.out.println(trainer.getAge(2022));
    }
}
