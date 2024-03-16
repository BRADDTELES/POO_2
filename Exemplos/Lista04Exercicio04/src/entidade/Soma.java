package entidade;

public class Soma {
    public Integer p1;
    public Integer p2;
    public Integer resultado;
    
    public Integer somar(Integer p1,Integer p2){
        return p1 + p2;
    }
    
    public class TestarSoma{
        
        public static boolean testeSoma(Integer p1,Integer p2,Integer resultado){
            if((p1 + p2) != resultado){
                return false;
            }else{
                return true;
            }
        }
    }
}
