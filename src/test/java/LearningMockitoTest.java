import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.*;

class LearningMockitoTest {

    private Dependency dependency;
    private LearningMockito classBeingTested;

    @BeforeEach
    public void setUp() {
        classBeingTested = new LearningMockito();
        dependency = mock(Dependency.class);

    }

    @Test
    public void verifyingWhenACallHappensOnce() {
        classBeingTested.singleCall(dependency);
        verify(dependency).doSomething();
    }

    @Test
    public void verifyingWhenACallHappensTwice() {
        classBeingTested.twoCalls(dependency);
        verify(dependency, times(2)).doSomething();

    }

    @Test
    public void verifyingWhenAMethodIsCalledWithAParameter() {
        classBeingTested.singleCallWithParameter(dependency);

        verify(dependency).acceptParameter("Hello world");
    }

    @Test
    public void verifyingWhenAMethodIsCalledWithAnyParameter() {
        classBeingTested.singleCallWithParameter(dependency);

        verify(dependency).acceptParameter(anyString());
    }

    @Test
    public void settingUpTheMockToReturnAValue() {
        String result  = "Hello Word";
        willReturn(result).given(dependency).doSomething();
        classBeingTested.chainingCalls(dependency);

        verify(dependency).acceptParameter(result );
    }
}