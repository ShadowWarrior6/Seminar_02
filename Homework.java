import java.util.Random;
import java.util.Scanner;

/**
 * 1. Полностью разобраться с кодом программы разработанной на семинаре, 
 * переписать программу. Это минимальная задача для сдачи домашней работы.

Усложняем задачу:

2.* Переработать метод проверки победы, логика проверки победы должна работать
 для поля 5х5 и
количества фишек 4. Очень желательно 
не делать это просто набором условий для каждой из
возможных ситуаций! Используйте вспомогательные методы, используйте циклы!
 */



public class Homework {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '*';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    private static final int WIN_COUNT=4;

    static void initialize(){
        fieldSizeX=5;
        fieldSizeY=5;
        field=new char[fieldSizeX][fieldSizeY];

        for (int x = 0; x <fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                field [x][y]=DOT_EMPTY;
            }
        }

    }
    static void printFiled(){
        System.out.println("+");
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.println("-" + (i+1));
        }
        System.out.println("-");
        
        for (int x = 0; x < fieldSizeX; x++) {
            System.out.println(x+1+"|");
            for (int y = 0; y < fieldSizeY; y++) {
                System.out.println(field[x][y]+"|");
            }
            System.out.println();

        }
        for (int i = 0; i < fieldSizeX*2+2; i++) {
            System.out.println("-");
        }
        System.out.println();
         

    }
    static void humanTurn(){
        int x ;
        int y ;
        do {
            System.out.print("Введите координаты хода X и Y\n(от 1 до 3) через пробел: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } 
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[x][y]=DOT_HUMAN;
    }

    static void aiTurn(){
        int x;
        int y;
        do {
            x=random.nextInt(fieldSizeX);
            y=random.nextInt(fieldSizeY);

            
        }
         while (!isCellEmpty(x,y));
         field[x][y]=DOT_AI;
    }
    static boolean isCellEmpty(int x,int y){
        return field[x][y]==DOT_EMPTY;
    }
    static boolean isCellValid(int x,int y){
        return x>=0 && x<fieldSizeX && y>=0 && y<fieldSizeY;
    }

    static boolean checkDraw(){
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y<fieldSizeY; y++) {
               if (isCellEmpty(x, y)) return false;
            }
        }
        return false;
    }
    static boolean checkWin(char dot){
        for (int x=0;x<fieldSizeX;x++){
            for (int y = 0; y < fieldSizeY; y++) {
                
            }
        }
        return false;
    }

    static boolean check1(int x,int y, char dot,int win){
        if(field[x][y+1]==dot && field[x][y+2]==dot && field[x][y+3]==dot && field[x][y+4]==dot ){
            
        }
        return false;
    }
    static boolean check2(int x ,int y, char dot, int win ){
        if(field[x+1][y]==dot && field[x+2][y]==dot && field[x+3][y]==dot && field[x+4][y]==dot){

        }
        return false;
    }
    static boolean check3(int x , int y,char dot,int win ){
     if(field[x+1][y+1]==dot && field[x+2][y+2]==dot && field[x+3][y+3]==dot && field[x+4][y+4]==dot){

     }
    return false;  
     
    }

    


    public static void main(String[] args) {
        
    }
}
