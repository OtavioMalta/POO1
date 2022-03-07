public class ProvaException extends IllegalArgumentException{
    
    private String msg;
    public ProvaException(String msg){
       
      this.msg = msg;
    }
    public String getMessage(){
      return msg;
    }
  
}
