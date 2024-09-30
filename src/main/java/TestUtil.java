import com.learning.java.util.LinkUtil;

public class TestUtil {

    public static void main(String[] args) {
        System.out.println(

                LinkUtil.getResponseCode("https://the-internet.herokuapp.com/broken_images")
        );
    }
}
