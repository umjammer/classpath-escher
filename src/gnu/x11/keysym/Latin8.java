package gnu.x11.keysym;


/**
 * Latin 8-specific keyboard symbols. Imported from
 * <code>XK_LATIN8</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3 = 0x18
 */
public enum Latin8 {
   BABOVEDOT(0x12a1),
   BABOVEDOT_SMALL(0x12a2),
   DABOVEDOT(0x12a6),
   WGRAVE(0x12a8),
   WACUTE(0x12aa),
   DABOVEDOT_SMALL(0x12ab),
   YGRAVE(0x12ac),
   FABOVEDOT(0x12b0),
   FABOVEDOT_SMALL(0x12b1),
   MABOVEDOT(0x12b4),
   MABOVEDOT_SMALL(0x12b5),
   PABOVEDOT(0x12b7),
   WGRAVE_SMALL(0x12b8),
   PABOVEDOT_SMALL(0x12b9),
   WACUTE_SMALL(0x12ba),
   SABOVEDOT(0x12bb),
   YGRAVE_SMALL(0x12bc),
   WDIAERESIS(0x12bd),
   WDIAERESIS_SMALL(0x12be),
   SABOVEDOT_SMALL(0x12bf),
   WCIRCUMFLEX(0x12d0),
   TABOVEDOT(0x12d7),
   YCIRCUMFLEX(0x12de),
   WCIRCUMFLEX_SMALL(0x12f0),
   TABOVEDOT_SMALL(0x12f7),
   YCIRCUMFLEX_SMALL(0x12fe);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin8(int code) {
      this.code = code;
  }
}
