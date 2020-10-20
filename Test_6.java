package Exercise;

public class Test_6 {
    public static void main(String[] args) {
        AS a11 = new AS(20,"22");
        AS a22 = new AS(20,"22");
        System.out.println(a11.equals(a22));
    }
}
class AS {
    int name ;
    String b;
    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof AS))
            return false;
        if(this==obj)
            return true;
        AS a1 = (AS)obj;
        if(this.name==a1.name &&this.b.equals(a1.b)){
            return true;
        }
        return false;
    }
public AS(int a,String b){
        this.name=a;
        this.b=b;
    }
}
