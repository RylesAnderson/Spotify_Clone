import java.awt.Desktop;
import java.io.File;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class SpotifyCloneController {
    public static void main(String args[]) {
        Logger logger = Logger.getLogger(SpotifyCloneController.class.getName());
        try {
            File htmlFile = new File("index.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (Exception e){
            logger.info((Supplier<String>) e);
        }
    }
}
