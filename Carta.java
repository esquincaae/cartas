package Actividad;

import java.util.Objects;
public class Carta implements Comparable<Carta>{
    Integer num;
    String ltr;

    public Carta(Integer num, String ltr) {
        this.num = num;
        this.ltr = ltr;
    }
    
    @Override
    public int compareTo(Carta o) {
        int resultado = ltr.compareTo(o.getLtr());
        if (resultado != 0){
            return resultado;
        }
        if (this.getNum() == o.getNum()){
            return 0;
        }
        if (this.getNum() <= o.getNum()){
            return -1;
        } else{
            return  1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta that = (Carta) o; //cast
        return getNum() == that.getNum() &&
                Objects.equals(getLtr(), that.getLtr());
    }

    public Integer getNum(){
        return this.num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLtr() {
        return this.ltr;
    }

    public void setLtr(String ltr) {
        this.ltr = ltr;
    }

    public String toString() {
        return getLtr()+getNum();
    }
}