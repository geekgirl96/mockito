public class LearningMockito {
    public void singleCall(Dependency dependency) {
        dependency.doSomething();
    }

    public void twoCalls(Dependency dependency) {
        dependency.doSomething();
        dependency.doSomething();
    }

    public void singleCallWithParameter(Dependency dependency) {
        dependency.acceptParameter("Hello world");
    }

    public void chainingCalls(Dependency dependency) {
        String result = dependency.doSomething();
        dependency.acceptParameter(result);
    }
}