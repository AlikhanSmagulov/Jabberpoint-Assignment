package main.java.decorator;

import main.java.model.Slide;

abstract class SlideDecorator implements SlideInterface {
    protected Slide decoratedSlide;

    public SlideDecorator(Slide decoratedSlide) {
        this.decoratedSlide = decoratedSlide;
    }

    public void display() {
        decoratedSlide.display();
    }
}

