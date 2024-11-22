package fiboncci.es.issoterohernandez.daw.endes;


public class Fibonacci 
{
    
    	public static void fibonacci(int MAX) {

    		int firstNumber = 0;
    		int secondNumber = 1;
    		int fibonacci = '\0';

    		System.out.print(firstNumber + " ");
    		System.out.print(secondNumber + " ");

    		for (int i = 2; i < MAX; i++) {

    			fibonacci = firstNumber + secondNumber;
    			System.out.print(fibonacci + " ");

    			firstNumber = secondNumber;
    			secondNumber = fibonacci;
    		}
    	}

    	
    
}
