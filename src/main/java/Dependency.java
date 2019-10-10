public class Dependency {
    public void acceptParameter(String param) {
        throw new RuntimeException("This should never be called!!");
    }

    public String doSomething() {
        throw new RuntimeException("This should never be called!!");
    }
}