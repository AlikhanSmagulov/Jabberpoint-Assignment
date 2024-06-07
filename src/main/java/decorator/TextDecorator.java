package main.java.decorator;

import main.java.model.Slide;

class TextDecorator extends SlideDecorator {
    private String text;

    public TextDecorator(Slide decoratedSlide, String text) {
        super(decoratedSlide);
        this.text = text;
    }

    @Override
    public void display() {
        super.display();
        addText();
    }

    private void addText() {
        System.out.println("Adding text '" + text + "' to slide");
    }
}