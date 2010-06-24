package gnu.x11;


/** X font. */
public class Font extends Fontable {
  /** 
   * Predefined font.
   *
   * @see Window#NONE
   */
  public static final Font NONE = new Font (0);


  public String name;


  /** Predefined. */
  public Font (int id) {
    super (id);
  }


  // opcode 45 - open font
  /**
   * @see <a href="XLoadFont.html">XLoadFont</a>
   */
  public Font (Display display, String name) {

    super (display);
    this.name = name;

    int n = name.length ();
    int p = RequestOutputStream.pad (n);

    RequestOutputStream o = display.out;
    synchronized (o) {
      o.beginRequest (45, 0, 3 + (n + p) / 4);
      o.writeInt32 (id);
      o.writeInt16 (name.length ());
      o.skip (2);
      o.writeString8 (name);
      o.send ();
    }
  }


  // opcode 46 - close font
  /**
   * @see <a href="XFreeFont.html">XFreeFont</a>
   */
  public void close () {

    RequestOutputStream o = display.out;
    synchronized (o) {
      o.beginRequest (46, 0, 2);
      o.writeInt32 (id);
      o.send ();
    }
  }


  public String toString () {
    return "#Font: " + name + " " +  super.toString ();
  }
}
