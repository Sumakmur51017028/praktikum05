package kotak;
class persegi extends bentuk{
    protected int P,L;

public void setSuperP(int P){
super.P=P;
}
public void setSuperL(int L){
super.L=L;
}
public void setP(int P){
this.P=P;
}
public void setL(int L){
this.L=L;}

public void getLuas(){
    System.out.println("Luas super:"+(super.L*super.P));
    System.out.println("luas: "+(this.L*this.P));
} }



