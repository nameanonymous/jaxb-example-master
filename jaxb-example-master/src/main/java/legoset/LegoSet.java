package legoset;
import album.Track;
import lombok.*;
import java.time.Year;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {
    @XmlAttribute
    private String number;

    private String name;
    private String theme;
    private int year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<Tags> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    @XmlElement(name = "weight")
    private List<Weight> weight;

    private String url;

}
