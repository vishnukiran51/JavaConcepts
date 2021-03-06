package advancedjava.java8features.lambdaexpressions;

/**
 * @author Vishnu Kandanelly
 */
public class PassingBehaviourInOOP {
    public static void main(String[] args) {
        HelloWorldGreeting helloworldGreeting = new HelloWorldGreeting();
        /*Using Anonymous class*/
        new PassingBehaviourInOOP().greet(helloworldGreeting);

        /*
        Type Inference example

        Greeting helloWorldGreeting = () -> System.out.println("Hello World");
        helloWorldGreeting.perform();
         */
    }

    /**
     * 
     * @param greeting method passed as a parameter
     */
    public void greet(Greeting greeting) {
        greeting.perform();
    }
}

interface Greeting {
    public void perform();
}

class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World!!");
    }
}
