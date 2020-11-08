import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Cat {

    private String cat;

    public String getCat(){
        return cat;
    }
    public void setCat(String cat){
        this.cat = cat;
    }
}
