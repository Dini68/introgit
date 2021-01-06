package training.interfaceintro;

public interface Writable {

    int DEFAULT_CONTENT_SIZE = 100;

    boolean write(String text);
}
