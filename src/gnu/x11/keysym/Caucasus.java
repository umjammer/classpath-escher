package gnu.x11.keysym;


/**
 * Caucasus-specific keyboard symbols. Imported from
 * <code>XK_CAUCASUS</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x16. 
 */
public enum Caucasus {
  /* Azeri (and other Turkic or Caucasian languages of ex-USSR). */

   CCEDILLAABOVEDOT(0x16a2),
   XABOVEDOT(0x16a3),
   QABOVEDOT(0x16a5),
   IBREVE(0x16a6),
   IE(0x16a7),
   UO(0x16a8),
   ZSTROKE(0x16a9),
   GCARON(0x16aa),
   OBARRED(0x16af),

   CCEDILLAABOVEDOT_SMALL(0x16b2),
   XABOVEDOT_SMALL(0x16b3),

   OCARON(0x16b4),

   QABOVEDOT_SMALL(0x16b5),
   IBREVE_SMALL(0x16b6),
   IE_SMALL(0x16b7),
   UO_SMALL(0x16b8),
   ZSTROKE_SMALL(0x16b9),
   GCARON_SMALL(0x16ba),
   OCARON_SMALL(0x16bd),
   OBARRED_SMALL(0x16bf),

   SCHWA(0x16c6),
   SCHWA_SMALL(0x16f6),


  /* Inupiak (not really Caucasus). */

   LBELOWDOT(0x16d1),
   LSTROKEBELOWDOT(0x16d2),
   LBELOWDOT_SMALL(0x16e1),
   LSTROKEBELOWDOT_SMALL(0x16e2),


  /* Guarani (not really Caucasus). */

   GTILDE(0x16d3),
   GTILDE_SMALL(0x16e3);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Caucasus(int code) {
       this.code = code;
   }
}
