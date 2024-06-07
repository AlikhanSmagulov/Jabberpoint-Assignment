package main.java.decorator;

class BasicSlide implements SlideInterface {
    @Override
    public void display() {
        System.out.println("Displaying basic slide");
    }
}
