package Ticket;

public class Cost {
    protected int FirstHrCost;
    protected int NextHrCost;
    public int TotalCost(int EntryTime ,int ExitTime){
        return FirstHrCost +(ExitTime-EntryTime)*NextHrCost;
    }

    public int getNextHrCost() {

        return NextHrCost;
    }

    public void setNextHrCost(int nextHrCost) {
        NextHrCost = nextHrCost;
    }

    public int getFirstHrCost() {
        return FirstHrCost;
    }

    public void setFirstHrCost(int firstHrCost) {
        FirstHrCost = firstHrCost;
    }
}
