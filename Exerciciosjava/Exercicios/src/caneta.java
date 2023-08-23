public class caneta{
    public String modelo;
    public String cor;
    protected int carga;
    private float ponta;
    private boolean tampada;

    public caneta(String m, String c, Float p){ //metódo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public Float getPonta(){
        return this.ponta;
    }
    public void setPonta(Float p){
        this.ponta = p;
    }


    
    public void status(){
        System.out.println("\na caneta é de cor: "+this.cor);
        System.out.println("Modelo da caneta: "+this.getModelo());
        //System.out.println("Carga: "+this.carga);
        System.out.println("ponta: "+this.getPonta());
        System.out.println("esta tampada: "+this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta tampada não posso rabiscar");
        }
        else{
            System.out.println("Rabiscando...");
        } 
    }

    public void tampar(){
        this.tampada = true;
    
    }

    public void destampar(){
        this.tampada = false;
    }


























}