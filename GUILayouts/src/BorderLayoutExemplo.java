import javax.swing.JFrame;
import java.awt.*;

public class BorderLayoutExemplo {
    public static final Object CENTER = null;
    public static final Object NORTH = null;
    public static final Object WEST = null;
    public static final Object SOUTH = null;

    public BorderLayoutExemplo() {
        super();
        //criando uma janela
        JFrame janela3 = new JFrame("Janela Principal");
        BorderLayout border = new BorderLayout();
        janela3.setLayout((LayoutManager) border);
    
    }
}
