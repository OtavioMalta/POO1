
public class Ponto {
    
    private Integer x;
    private Integer y;


    public Ponto() {
    }

    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String imprimir_ponto() {
        return "(" + getX() +","+getY()+")"; 
    }
    
    public Ponto soma_pontos(Ponto p1, Ponto p2){
        Ponto p3 = new Ponto();
        p3.setX(p1.getX()+p2.getX());
        p3.setY(p1.getY()+p2.getY());
        return p3;
    }

    public void soma_pontos2(Ponto p1, Ponto p2, Ponto p3){
        p3.setX(p1.getX()+p2.getX());
        p3.setY(p1.getY()+p2.getY());
    }

    public static Integer calc_area(Ponto p1, Ponto p2){
        return (int)Math.sqrt( Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
    }

    public void mult(Integer c){
        this.x = x*c;
        this.y = y*c;
    }

    public void inc_dir(char dir){
        if(dir == 'n' || dir == 'N'){
            this.y++;
        }else if(dir=='s' || dir=='S'){
            this.y--;
        }else if(dir=='o' || dir=='O'){
            this.x--;
        }else if(dir=='l' || dir=='L'){
            this.x++;
        }
    }

    public void inc_diag(String dir){
        if(dir=="sudeste"){
            this.x++;
            this.y--;
        }else if(dir=="sudoeste"){
            this.y--;
            this.x--;
        }else if(dir=="noroeste"){
            this.x--;
            this.y++;
        }else if(dir=="nordeste"){
            this.x++;
            this.y++;
        }
    }
}
