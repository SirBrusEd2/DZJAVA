
/*Цвет контура гипотинузы выводится только тогда, когда есть пересечения при отрисовке прямоугольного треугольника, то есть если точка (с её координатами)
 * точно по формуле пренадлежит (её координаты) гипотинузе, то контур выведется, в ином случае ничего не поятися (чем больше треугольник тем больше точность*/
//контур
public class Prymougolnic {
    private char contourSymbol = '0'; //контур
    private char fillSymbol = '-'; //заливка
    private char emptiness = ' '; //пустота

    public Prymougolnic(char contourSymbol, char fillSymbol) {
        this.contourSymbol = contourSymbol;
        this.fillSymbol = fillSymbol;
    }

    public char getContourSymbol() {
        return contourSymbol;
    }

    public void setContourSymbol(char contourSymbol) {
        this.contourSymbol = contourSymbol;
    }

    public char getFillSymbol() {
        return fillSymbol;
    }

    public void setFillSymbol(char fillSymbol) {
        this.fillSymbol = fillSymbol;
    }

    public void drawContour(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", contourSymbol);                    }
                    else {
                        System.out.printf(" %c ", emptiness);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
    //заливка
    public void fillFigure(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", emptiness);
                    }
                    else {
                        System.out.printf(" %c ", fillSymbol);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
    //полная фигура
    public void drawFilledFigure(double a, double b) {
        for(int y = (int) a; y>0; y--){
            for(int x = 0; x< (int)b; x++) {
                if (y <= -(a / b * x) + a) {
                    if(y == 1 || x == 0 || y == -(a / b * x) + a){
                        System.out.printf(" %c ", contourSymbol);
                    }
                    else {
                        System.out.printf(" %c ", fillSymbol);
                    }
                }
                else {
                    System.out.printf(" %c ", emptiness);
                }
            }
            System.out.print("\n");
        }
    }
}

