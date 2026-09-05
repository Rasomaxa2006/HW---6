//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    for(int i = 1; i < 11; i = i + 1){
        System.out.println("Repetition cycle " + i);
    }
    for(int i = 10; i > 0; i = i - 1){
        System.out.println("Repetition cycle " + i);

    }
    for(int i = 0; i <= 17; i = i +2){
        System.out.println(i);

    }

    for (int i = 10; i >= -10; i --){
        System.out.println("Repetition cycle " + i);
    }


    for (int i = 1904; i < 2096; i = i + 4){
        System.out.println("The year is a leap year " + i);
    }

    for ( int i = 7; i <= 98; i = i + 7){
        System.out.println(i);
    }

    for ( int i = 1; i <= 512; i = i * 2){
        System.out.println(i);
    }
    int salary = 29000;
    int total = 0;
    for (int i = 0; i < 12; i++) {
        total = total + salary;
        System.out.println("Mont " + i + " Outcome " + total);
    }
    System.out.println(total);


    int salary1 = 29000;
    int total1 = 0;
    for (int i = 0; i < 12; i++) {
        total1 = total1 + total/100;
        total1 = total1 + salary1;
        System.out.println("Mont " + i + " Outcome " + total1);
    }
    System.out.println(total1);

    for (int i = 1; i < 11; i++){
        System.out.println("2*" + i + " = " + (2 * i));
    }

}
