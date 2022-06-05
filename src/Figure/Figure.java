package Figure;

public class Figure {

final double PI = 3.14; // Число Пи
int x; // Координата х
int y; // Координата y

  double a; // Сторона а
  double b; // Сторона b
  double r; // Радиус для круга

  // Конструктор для координат
  Figure(int x, int y) {
    this.x = x;
    this.y = y;
  }
  // Конструктор для прямоугольника
    Figure(double a, double b) {
    this.a = a;
    this.b = b;
  }
  // Конструктор для круга
Figure() {
   this.r = r;
}



  // Методы
   double getPerimeter() {
     System.out.println("Perimetr = ");
     return 0;
   }

    double getArea(){
      System.out.println("Area = ");
      return 0;
   }
   void ChangeOfCoord() {
     System.out.println("Координаты изменены");
    x += 250;
    y += 150;
   }


}
