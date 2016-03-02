package bundle;

import java.util.ListResourceBundle;

public class MyBundle_de extends ListResourceBundle {
    protected Object[][] getContents() {
    	Object[][] bundle = new Object[2][2];
    	bundle[0][0] = "Cancel";
    	bundle[0][1] = "Calcel";

    	bundle[1][0] = "Send";
    	bundle[1][1] = "Sturen";

    	return bundle;
    }
}
