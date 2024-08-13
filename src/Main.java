public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        System.out.println("Первый боксер весит " + firstBoxerWeight + "кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Второй боксер весит " + secondBoxerWeight + "кг");
        var resultBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println ("Общий вес боксеров " + resultBoxersWeight + "кг");
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Первый боксер меньше второго на " + differenceBoxersWeight + "кг");

        System.out.println("Задание 7");
        var remains = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток " + remains + "кг");

        System.out.println("Задание 8");
        var totalTime = 640;
        System.out.println("Общее время сотрудников " + totalTime + " часов");
        var oneEmployeeWorking = 8;
        System.out.println("Один сотрудник посвещает работе " + oneEmployeeWorking + " часов");
        var worker = totalTime / oneEmployeeWorking;
        System.out.println("Всего работников в компании " + worker + " человек");
        var workerCompany = worker + 94;
        System.out.println("Если в компании работает " + workerCompany + " человек, то всего " + (workerCompany * oneEmployeeWorking) + " часов работы может быть поделено между сотрудниками");






    }
}