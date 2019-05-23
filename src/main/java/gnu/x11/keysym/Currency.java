package gnu.x11.keysym;

/**
 * Currency-specific keyboard symbols. Imported from
 * <code>XK_CURRENCY</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>.
 */
public enum Currency {
   ECU(0x20a0),
   COLON(0x20a1),
   CRUZEIRO(0x20a2),
   FFRANC(0x20a3),
   LIRA(0x20a4),
   MILL(0x20a5),
   NAIRA(0x20a6),
   PESETA(0x20a7),
   RUPEE(0x20a8),
   WON(0x20a9),
   NEW_SHEQEL(0x20aa),
   DONG(0x20ab),
   EURO(0x20ac);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Currency(int code) {
       this.code = code;
   }
}
