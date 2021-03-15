package training;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");

        String content;
        try {
            content = Files.readString(file);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        System.out.println(content);

        List<String> contents;
        try {
            contents = Files.readAllLines(file);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        System.out.println(contents);

        Path file2 = Path.of("employees2.txt");

        try {
            Files.writeString(file2, "Jack Doe\n");
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file", e);
        }

        try {
            Files.write(file2, List.of("John Doe", "Jane Doe"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file", e);
        }
    }
}
