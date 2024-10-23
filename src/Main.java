//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("задача 2");

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("задача 3");

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("зачада 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("задача 6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var massBoxers1 = boxer1 + boxer2;
        System.out.println("общая масса боксеров " + massBoxers1 + "кг");
        var massBoxers2 = boxer2 - boxer1;
        System.out.println("разница в массе между боксерами " + massBoxers2 + " кг");

        System.out.println("задача 7");

        var massBoxers3 = boxer2 % boxer1;
        System.out.println("отстаток от деления между весами боксеров " + massBoxers3 + " кг");

        System.out.println("задача 8");

        var time = 640;
        var onetimeSotrudnik = 8;
        var sotrudniks = time / onetimeSotrudnik;
        System.out.println("Всего сотрудников в компании " + sotrudniks + " человек");
        sotrudniks = sotrudniks + 94;
        var time2 = sotrudniks * 8;
        System.out.println("Если в компании работает " + sotrudniks + " человека, то всего " + time2 + " часов работы может быть поделено между сотрудниками");






    }
}