package clientwsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet2")
public class NewDataSet2 {
    
    @Element
    private PeriodicTable2 Table;

    public PeriodicTable2 getTable() {
        return Table;
    }

    public void setTable(PeriodicTable2 Table) {
        this.Table = Table;
    }
}