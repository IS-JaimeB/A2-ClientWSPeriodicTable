package clientwsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet1")
public class NewDataSet1 {
    
    @Element
    private PeriodicTable Table;

    public PeriodicTable getTable() {
        return Table;
    }

    public void setTable(PeriodicTable Table) {
        this.Table = Table;
    }
}