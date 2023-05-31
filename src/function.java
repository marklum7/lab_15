import java.io.Serializable;

public class function implements Serializable {
    double x;
    double y;
    function(double x){
        this.x=x;
    }
    void count(){
        y = x-Math.sin(x);
    }






}
