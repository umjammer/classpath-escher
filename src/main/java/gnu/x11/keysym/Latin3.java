package gnu.x11.keysym;


/**
 * Latin 3-specific keyboard symbols. Imported from
 * <code>XK_LATIN3</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3(0x02.
 */
public enum Latin3 {
   HSTROKE(0x2a1),
   HCIRCUMFLEX(0x2a6),
   IABOVEDOT(0x2a9),
   GBREVE(0x2ab),
   JCIRCUMFLEX(0x2ac),

   HSTROKE_SMALL(0x2b1),
   HCIRCUMFLEX_SMALL(0x2b6),
   IDOTLESS_SMALL(0x2b9),
   GBREVE_SMALL(0x2bb),
   JCIRCUMFLEX_SMALL(0x2bc),

   CABOVEDOT(0x2c5),
   CCIRCUMFLEX(0x2c6),
   GABOVEDOT(0x2d5),
   GCIRCUMFLEX(0x2d8),
   UBREVE(0x2dd),
   SCIRCUMFLEX(0x2de),

   CABOVEDOT_SMALL(0x2e5),
   CCIRCUMFLEX_SMALL(0x2e6),
   GABOVEDOT_SMALL(0x2f5),
   GCIRCUMFLEX_SMALL(0x2f8),
   UBREVE_SMALL(0x2fd),
   SCIRCUMFLEX_SMALL(0x2fe);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin3(int code) {
      this.code = code;
  }
}
