public class FilteredAccount extends Account {
    private int zeroTrans;
    private int totalTrans;
    
    public FilteredAccount (Client c) {
        super(c);
        zeroTrans = 0;
        totalTrans = 0;
    }
    
    public boolean process(Transaction t) {
        totalTrans++;
        if (t.value() == 0) {
            zeroTrans++; 
            return true;
        } else {
            return super.process(t);
        }
    }

    public double percentFiltered() {
        if (totalTrans == 0) {
            return 0.0;
        }
        return zeroTrans * 100.0 / totalTrans;
    }  
}
