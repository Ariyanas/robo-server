package classes;

/**
 *
 * @author Ariyanas
 */
public class Type {
    String type;
    String port;
    String cmd;
    
    public Type(){}

    public Type(String type, String port, String cmd) {
        this.type = type;
        this.port = port;
        this.cmd = cmd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }
    
    
}
