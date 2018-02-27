package clientwsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class PeriodicTable2 {
    @Element(name="Table")
    private String ElementName;

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }
}