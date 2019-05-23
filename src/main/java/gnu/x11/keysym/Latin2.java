package gnu.x11.keysym;


/**
 * Latin 2-specific keyboard symbols. Imported from
 * <code>XK_LATIN2</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3 = 0x01.
 */
public enum Latin2 {
   AOGONEK(0x1a1),
   BREVE(0x1a2),
   LSTROKE(0x1a3),
   LCARON(0x1a5),
   SACUTE(0x1a6),
   SCARON(0x1a9),
   SCEDILLA(0x1aa),
   TCARON(0x1ab),
   ZACUTE(0x1ac),
   ZCARON(0x1ae),
   ZABOVEDOT(0x1af),

   AOGONEK_SMALL(0x1b1),
   OGONEK_SMALL(0x1b2),
   LSTROKE_SMALL(0x1b3),
   LCARON_SMALL(0x1b5),
   SACUTE_SMALL(0x1b6),
   CARON_SMALL(0x1b7),
   SCARON_SMALL(0x1b9),
   SCEDILLA_SMALL(0x1ba),
   TCARON_SMALL(0x1bb),
   ZACUTE_SMALL(0x1bc),
   DOUBLEACUTE_SMALL(0x1bd),
   ZCARON_SMALL(0x1be),
   ZABOVEDOT_SMALL(0x1bf),

   RACUTE(0x1c0),
   ABREVE(0x1c3),
   LACUTE(0x1c5),
   CACUTE(0x1c6),
   CCARON(0x1c8),
   EOGONEK(0x1ca),
   ECARON(0x1cc),
   DCARON(0x1cf),
   DSTROKE(0x1d0),
   NACUTE(0x1d1),
   NCARON(0x1d2),
   ODOUBLEACUTE(0x1d5),
   RCARON(0x1d8),
   URING(0x1d9),
   UDOUBLEACUTE(0x1db),
   TCEDILLA(0x1de),

   RACUTE_SMALL(0x1e0),
   ABREVE_SMALL(0x1e3),
   LACUTE_SMALL(0x1e5),
   CACUTE_SMALL(0x1e6),
   CCARON_SMALL(0x1e8),
   EOGONEK_SMALL(0x1ea),
   ECARON_SMALL(0x1ec),
   DCARON_SMALL(0x1ef),
   DSTROKE_SMALL(0x1f0),
   NACUTE_SMALL(0x1f1),
   NCARON_SMALL(0x1f2),
   ODOUBLEACUTE_SMALL(0x1f5),
   UDOUBLEACUTE_SMALL(0x1fb),
   RCARON_SMALL(0x1f8),
   URING_SMALL(0x1f9),
   TCEDILLA_SMALL(0x1fe),
   ABOVEDOT_SMALL(0x1ff);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin2(int code) {
      this.code = code;
  }
}
