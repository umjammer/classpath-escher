package gnu.x11.keysym;


/**
 * Special-specific keyboard symbols. Imported from
 * <code>XK_SPECIAL</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x09. 
 */
public enum Special {
   BLANK(0x9df),
   SOLID_DIAMOND(0x9e0),
   CHECKER_BOARD(0x9e1),
   HT(0x9e2),
   FF(0x9e3),
   CR(0x9e4),
   LF(0x9e5),
   NL(0x9e8),
   VT(0x9e9),
   LOW_RIGHT_CORNER(0x9ea),
   UP_RIGHT_CORNER(0x9eb),
   UP_LEFT_CORNER(0x9ec),
   LOW_LEFT_CORNER(0x9ed),
   CROSSING_LINES(0x9ee),
   HORIZ_LINE_SCAN1(0x9ef),
   HORIZ_LINE_SCAN3(0x9f0),
   HORIZ_LINE_SCAN5(0x9f1),
   HORIZ_LINE_SCAN7(0x9f2),
   HORIZ_LINE_SCAN9(0x9f3),
   LEFTT(0x9f4),
   RIGHTT(0x9f5),
   BOTT(0x9f6),
   TOPT(0x9f7),
   VERT_BAR(0x9f8);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Special(int code) {
       this.code = code;
   }
}
