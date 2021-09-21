package example.cricket;

public class MockBatsman extends Batsman {

    public MockBatsman(BatsmanType batsmanType) {
        super(batsmanType);
    }

    @Override
    public int bat() {
        if(batsmanType == BatsmanType.HITTER){
            return 4;
        }
        return 2;
    }
}


