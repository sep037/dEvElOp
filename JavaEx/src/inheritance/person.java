package inheritance;
class person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
}
class student extends person{
    public void set(){
        age = 23;
        name = "박승은";
        height = 170;
        setWeight(60);
    }
}
class inheritanceEx{
    public static void main(String[] args){
        student s = new student();
        s.set();
        System.out.println(s.age+"살 "+s.getWeight()+"kg");
    }
}
