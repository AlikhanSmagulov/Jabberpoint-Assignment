package main.java.decorator;

import main.java.model.Slide;

class BorderDecorator extends SlideDecorator {
    public BorderDecorator(Slide decoratedSlide) {
        super(decoratedSlide);
    }

    @Override
    public void display() {
        super.display();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Adding border to slide");
    }
}

