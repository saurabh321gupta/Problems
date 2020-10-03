import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVtest {
    public static void main(String[] args) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("/home/local/THEPSI/saurabh.g/PROJECT_CLONES/Problems/src/mytable.csv"));
        String row;
        String str = "INSERT INTO `imagedb`.`image_details` (`id`, `description`, `type`, `size`, `url`) VALUES ('%s', '%s', '%s', '%s', '%s');";
        csvReader.readLine();
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(";");
            System.out.println(String.format(str, data[0], data[1], data[2], data[3], data[4]).replaceAll("\"", ""));
        }
    }
}
