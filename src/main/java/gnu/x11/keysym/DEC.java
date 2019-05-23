package gnu.x11.keysym;


/**
 * DEC-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/DECkeysym.h</code>. Note that 29th bit is set.
 */
public enum DEC {
  /* Two-key compose sequence initiators, chosen to map to Latin1
   * characters.
   */

   RING_ACCENT(0x1000feb0),
   CIRCUMFLEX_ACCENT(0x1000fe5e),
   CEDILLA_ACCENT(0x1000fe2c),
   ACUTE_ACCENT(0x1000fe27),
   GRAVE_ACCENT(0x1000fe60),
   TILDE(0x1000fe7e),
   DIAERESIS(0x1000fe22),


  /* Special keysym for LK2** "Remove" key on editing keypad. */

   REMOVE(0x1000ff00);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   DEC(int code) {
       this.code = code;
   }
}
