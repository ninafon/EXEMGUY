
package earrays;

public class Xogador implements Comparable{
     String nome;
    int dorsal;

    public Xogador() {
    }

    public Xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", dorsal=" + dorsal ;
    }

    public int compareTo(Xogador t) {
        if(this.dorsal< t.dorsal)
            return -1;
        else if (this.dorsal>t.dorsal)
            return 1;
        else 
            return 0;
       
    }

    @Override
    public int compareTo(Object t) {
       Xogador x =(Xogador)t;
        if(this.dorsal< x.dorsal)
            return -1;
        else if (this.dorsal>x.dorsal)
            return 1;
        else 
            return 0;
       
    }
    
}
