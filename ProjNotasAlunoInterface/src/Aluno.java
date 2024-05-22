public class Aluno {
    public String Nome;
    public String Curso;
    private double nota1;
    private double nota2;
    
    public double getN1(){
        return this.nota1;
    }
    
    public double getN2(){
        return this.nota2;
    }
    
    public void setN1(double n){
        this.nota1 = n;
    }
    
    public void setN2(double n){
        this.nota2 = n;
    }
    
    public double CalcMedia(){
        double media = (this.nota1 + this.nota2)/2;
        return media;
    }
}
