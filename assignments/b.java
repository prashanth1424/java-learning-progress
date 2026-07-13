if-else:
public class IfElseExample {
    public static void main(String[] args) {
        int number = 15;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}


nested:
if(marks>40){
If(marks>=90){
System.out.println(“Distinct”)}
else{
System.out.println(“Pass”)
}}
else{
system.out.println(“fail”)
}

Switch:
Int day= 2
Switch(day){
Case 1: (system.out.println(“MON”));break;
Case 2: (system.out.println(“TUE”));break;
Case 3: (system.out.println(“WED”));break;
Case 4: (system.out.println(“THU”));break;
Case 5: (system.out.println(“FRI”));break;
Case 6: (system.out.println(“SAT”));break;
Case 7: (system.out.println(“SUN”));break;
Default: (system.out.println(“wrong input”));}

If-Else-If:
Int marks = 99
If(marks>=90){
System.out.println(“A+”)}
else If(marks>=80){
System.out.println(“A”)}
else If(marks>70){
System.out.println(“B+”)}
else If(marks>60){
System.out.println(“B”)}
else If(marks>50){
System.out.println(“C+”)}
else If(marks>40){
System.out.println(“C”)}
Else{
System.out.println(“F”)}

1. For Loop:

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

2. While Loop:

public class WhileLoopExample {
    public static void main(String[] args) {
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
    }
}

3. Do-While Loop:

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
    }
}

