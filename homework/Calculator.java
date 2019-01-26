public interface Calculator {

/** Returns a+b */
public int add(int a, int b);

/** Returns a-b */
public int subtract(int a, int b);

/** Returns a*b */
public int multiply(int a, int b);

/** Returns minimum of a and b */
public int min(int a, int b);

/** Calculate cross sum */
public int crosssum(int a);
}    


public class Calculator implements Calculator {

public int a
public int b

public int add(int a, int b) 
    System.out.println("Calculator - add " + a + " und " + b);
    return a + b;
    }

public int subtract(int a, int b) {
    System.out.println("Calculator - subtract " + a + " und " + b);
    return a - b;
}

public int multiply(int a, int b) {
    System.out.println("Calculator - multiply " + a + " und " + b);
    return a * b;
}

public int min(int a, int b) {
    System.out.println("Calculator - min " + a + " und " + b);
    if (a < b)
        return a;
    else
        return b;
}

public int crosssum(int a) {
    System.out.println("Calculator - crosssum " + a);
    int sum = 0;
    while (0 != a) {
        sum = sum + (a % 10);
        a = a / 10;
    }
    return sum;
}
    
    