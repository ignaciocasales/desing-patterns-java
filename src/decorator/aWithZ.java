package decorator;

class aWithZ extends A {
    public void doIt() {
        super.doIt();
        doZ();
    }

    public void doZ() {
        System.out.print('Z');
    }
}
