package gnu.x11.keysym;


/**
 * Latin 9 (Latin 0)-specific keyboard symbols. Imported from
 * <code>XK_LATIN9</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3(0x19.
 */
public enum Latin9 {
   OE(0x13bc),
   OE_SMALL(0x13bd);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin9(int code) {
      this.code = code;
  }
}
