class Overloading {
    public int area(int a){
        return a*a;
    }
    public int area(int l, int b){
        return l*b;
    }
    public int area(int l, int b, int h){
        return l*b*h;
    }

    public static void main(String[] args){
        Overloading ob = new Overloading();
        System.out.println("Area of square : "+ ob.area(5));
        System.out.println("Area of rectangle : "+ ob.area(5,2));
        System.out.println("Volume of cuboid : "+ ob.area(5, 2, 3));

    }
}

