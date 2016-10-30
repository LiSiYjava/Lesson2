/**
 * Created by User on 30.10.2016.
 */
    import java.util.Scanner;


    class calculate{
        int radius;
        double height;
        double width;
        double side1;
        double side2;
        double side3;
        void calculateAreaCircle(int r){
            radius=r;
            System.out.println(radius*radius*(Math.PI));
        }
        void calculatePerimeterCircle(int r){
            radius=r;
            System.out.println(2*radius*(Math.PI));
        }
        void calculateAreaRect(double h, double w){
            height=h;
            width=w;
            System.out.println("Площадь равна "+height*width);
        }
        void calculatePerimeterRect(double h,double w){
            height=h;
            width=w;
            System.out.println("Периметр равен "+(height+width)*2);
            System.out.println("А так же,данная фигура состоит из двух треугольников площадью "
                    +height*width/2);
        }
        void calculatePerimeterTriangle2(double s1,double s2){
            side1=s1;
            side2=s2;
            side3=(int)Math.sqrt(side1*side1+side2*side2);
            System.out.println("Периметр равен "+(side1+side2+side3));
        }
        void calculateAreaTriangle2(double s1, double s2){
            side1=s1;
            side2=s2;
            System.out.println("Площадь равна "+(side1*side2*0.5));
        }
        void calculatePerimeterTriangle3(double s1,double s2, double s3){
            side1=s1;
            side2=s2;
            side3=s3;
            System.out.println("Периметр равен "+(side1+side2+side3));
        }
        void calculateAreaTriangle3(double s1, double s2, double s3){
            side1=s1;
            side2=s2;
            side3=s3;
            double P3=(side1+side2+side3)/2; //полупериметр треугольника
            System.out.println("Площадь равна "+(int)Math.sqrt(P3*(P3-side1)*(P3-side2)*(P3-side3)));
        }
    }
    class inKeyboard2 {
        public static void main(String[] agrs)
        {
            int vibor;
            Scanner in = new Scanner(System.in);

            System.out.println("Какую фигуру Вы хотите обсчитать? :");
            System.out.print("1. Окружность \n2. Прямоугольник\n3. Квадрат\n4. Треугольник\nТвой выбор: ");
            vibor = in.nextInt();
            if(vibor==1) {
                calculate Circle=new calculate();
                System.out.println("\nВведите радиус окружности");
                int r = in.nextInt();
                if(r<=0){
                    System.out.println(" Не корректные размеры, размер радиуса не может быть равен или меньше 0");
                }
                else {
                    System.out.print("Площадь окружности равна ");
                    Circle.calculateAreaCircle(r);
                    System.out.print("Периметр окружности равен ");
                    Circle.calculatePerimeterCircle(r);
                }
            }
            else if(vibor==2){
                calculate Rect=new calculate();
                int[] b = new int[2];
                System.out.print("Введите ширину прямоугольника - ");
                b[0] = in.nextInt();
                System.out.print("Введите высоту прямоугольника - ");
                b[1] = in.nextInt();
                if(b[0]<=0||b[1]<=0) {
                    System.out.println(" Не корректные размеры, размер стороны не может быть равен или меньше 0");
                }
                else {
                    Rect.calculateAreaRect(b[0],b[1]);
                    Rect.calculatePerimeterRect(b[0],b[1]);
                }
            }
            else if(vibor==3){
                calculate Rect=new calculate();
                int side;
                System.out.print("Введите размер стороны квадрата - ");
                side = in.nextInt();
                if(side<=0){
                    System.out.println(" Не корректные размеры, размер стороны не может быть равен или меньше 0");
                }
                else {
                    Rect.calculateAreaRect(side,side);
                    Rect.calculatePerimeterRect(side,side);
                }
            }
            else if(vibor==4){
                calculate Triangle=new calculate();
                int triangle;
                System.out.print("Ты хочеш ввести 2 или 3 стороны треугольника? :");
                triangle=in.nextInt();
                switch(triangle){
                    case 2:
                    {
                        System.out.println("Ты выбрал прямоугольный треугольник");
                        int[] с = new int[2];
                        System.out.println("Введите две стороны(катета):");
                        с[0] = in.nextInt();
                        с[1] = in.nextInt();
                        if(с[0]<=0||с[1]<=0){
                            System.out.println(" Не корректные размеры, размер стороны не может быть равен или меньше 0");
                        }
                        else{
                            Triangle.calculateAreaTriangle2(с[0],с[1]);
                            Triangle.calculatePerimeterTriangle2(с[0],с[1]);
                        }
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Теперь введи три размера сторон треугольника");
                        int[] z = new int[3];
                        z[0] = in.nextInt();
                        z[1] = in.nextInt();
                        z[2] = in.nextInt();
                        if(z[0]<=0||z[1]<=0||z[2]<=0){
                            System.out.println(" Не корректные размеры, размер стороны не может быть равен или меньше 0");
                        }
                        else{
                            if(z[0]>(z[1]+z[2])||z[1]>(z[0]+z[2])||z[2]>(z[1]+z[0])) {
                                System.out.println("Введите корректные размеры");
                            }
                            else {
                                Triangle.calculateAreaTriangle3(z[0],z[1],z[2]);
                                Triangle.calculatePerimeterTriangle3(z[0],z[1],z[2]);
                            }
                        }
                    }
                    break;
                    default: System.out.println("Ты сделал неправильный выбор;-)");
                }
            }
        }

    }

