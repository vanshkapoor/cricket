package example.cricket;

public class MockOver extends Over{
    public MockOver(int i) {
        super(i);
    }

    @Override
    public int currentRun() {
        return 2;
    }

    @Override
    public int RunsThisOVer() {
        return super.RunsThisOVer();
    }
}
