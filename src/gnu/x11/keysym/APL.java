package gnu.x11.keysym;


/**
 * APL-specific keyboard symbols. Imported from
 * <code>XK_APL</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x0b.
 */
public enum APL {
   LEFT_CARET(0xba3),
   RIGHT_CARET(0xba6),
   DOWN_CARET(0xba8),
   UP_CARET(0xba9),
   OVER_BAR(0xbc0),
   DOWN_TACK(0xbc2),
   UP_SHOE(0xbc3),
   DOWN_STILE(0xbc4),
   UNDER_BAR(0xbc6),
   JOT(0xbca),
   QUAD(0xbcc),
   UP_TACK(0xbce),
   CIRCLE(0xbcf),
   UP_STILE(0xbd3),
   DOWN_SHOE(0xbd6),
   RIGHT_SHOE(0xbd8),
   LEFT_SHOE(0xbda),
   LEFT_TACK(0xbdc),
   RIGHT_TACK(0xbfc);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   APL(int code) {
       this.code = code;
   }
   
}
