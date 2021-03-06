import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] unused) {

        System.out.println("type url and press return");

        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();

        System.out.println(urlToString(url));
        String[] lines = url.split("\n");

        int countNewLines = ;

        String[] trimmedLines = new String[countNewLines];
        for (int i = 0; i < trimmedLines.length; i++) {
            trimmedLines[i] = trimmedLines[i].trim();
        }

    }
}


