class Area {
    int Length;
    int Breadth;

    public void setDim(int len,int bre){
        Length=len;
        Breadth=bre;
    }
    public int getArea(){
        return Length * Breadth;
    }
    public static void main (String args[]) {
        Area area=new Area();
        area.Length=5;
        area.Breadth=10;
        System.out.println("The area of the rectangle is:" + area.getArea());

    }
}