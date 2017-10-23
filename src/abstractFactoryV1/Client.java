package abstractFactoryV1;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        CPU cpu = factory.createCPU();
        System.out.println(cpu);
    }
}
