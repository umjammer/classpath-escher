package gnu.x11.keysym;


/**
 * Latin 4-specific keyboard symbols. Imported from
 * <code>XK_LATIN4</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3 = 0x03.
 */
public enum Latin4 {
   KRA(0x3a2),
   KAPPA(0x3a2), /* deprecated */
   RCEDILLA(0x3a3),
   ITILDE(0x3a5),
   LCEDILLA(0x3a6),
   EMACRON(0x3aa),
   GCEDILLA(0x3ab),
   TSLASH(0x3ac),

   RCEDILLA_SMALL(0x3b3),
   ITILDE_SMALL(0x3b5),
   LCEDILLA_SMALL(0x3b6),
   EMACRON_SMALL(0x3ba),
   GCEDILLA_SMALL(0x3bb),
   TSLASH_SMALL(0x3bc),

   ENG(0x3bd),
   ENG_SMALL(0x3bf),

   AMACRON(0x3c0),
   IOGONEK(0x3c7),
   EABOVEDOT(0x3cc),
   IMACRON(0x3cf),
   NCEDILLA(0x3d1),
   OMACRON(0x3d2),
   KCEDILLA(0x3d3),
   UOGONEK(0x3d9),
   UTILDE(0x3dd),
   UMACRON(0x3de),

   AMACRON_SMALL(0x3e0),
   IOGONEK_SMALL(0x3e7),
   EABOVEDOT_SMALL(0x3ec),
   IMACRON_SMALL(0x3ef),
   NCEDILLA_SMALL(0x3f1),
   OMACRON_SMALL(0x3f2),
   KCEDILLA_SMALL(0x3f3),
   UOGONEK_SMALL(0x3f9),
   UTILDE_SMALL(0x3fd),
   UMACRON_SMALL(0x3fe);
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin4(int code) {
      this.code = code;
  }
}
