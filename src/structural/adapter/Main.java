package structural.adapter;

/*Паттерн трансформирует интерфейс или данные одного объекта в такой вид, чтобы он стал понятен другому объекту. */

import javax.crypto.Cipher;

public class Main {
    public static void main(String[] args) {
        CircleHole circleHole = new CircleHole(12);
        CirclePeg circlePeg = new CirclePeg(11);
        SquarePeg squarePeg = new SquarePeg(500, 29);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        String answer = circleHole.TryToInsert(squarePegAdapter) ? "You did it!" : "Sorry - its so big!";
        System.out.println(answer);
    }

}
