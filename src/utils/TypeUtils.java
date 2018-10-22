package utils;

import classes.Type;
import java.util.ArrayList;

/**
 *
 * @author Ariyanas
 */
public final class TypeUtils {
    ArrayList<Type> types;
    
    public TypeUtils(){
        types = new ArrayList<>();
        
        this.setTypes();
    }
    
    public void setTypes(){
        types.add(new Type("Laravel","8000","php artisan serve"));
        types.add(new Type("React","3000","npm start"));
        types.add(new Type("Angular","4200","ng serve"));
        types.add(new Type("Code Igniter","8080","php artisan serve"));
        types.add(new Type("Django","8000","npm start"));
        types.add(new Type("Spring","4200","ng serve"));
        types.add(new Type("Spring Boot","4200","ng serve"));
    }
    
    public Type getType(String type) {
        Type rs = null;
        
        for(Type t : types) {
            if(t.getType().equals(type))
                rs = t;
        }
        
        return rs;
    }
}
