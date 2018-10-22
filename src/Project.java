/**
 *
 * @author Ariyanas
 */
public class Project {
    private String Type;
    private String Name;
    private String Path;
    private String Host = "127.0.0.1";
    private String Port = "8000";
    private String Status = "stopped";
    
    public Project(){
        
    }
    
    public Project(String Type, String Name, String Path, String Host, String Port){
        this.Type = Type;
        this.Name = Name;
        this.Path = Path;
        this.Host = Host;
        this.Port = Port;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String Port) {
        this.Port = Port;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString(){
        return Name;
    }
}
