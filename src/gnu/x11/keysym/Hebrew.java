package gnu.x11.keysym;


/**
 * Hebrew-specific keyboard symbols. Imported from
 * <code>XK_HEBREW</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x0c. 
 */
public enum Hebrew {
   DOUBLELOWLINE(0xcdf),
   ALEPH(0xce0),
   BET(0xce1),
   BETH(0xce1), /* deprecated */
   GIMEL(0xce2),
   GIMMEL(0xce2), /* deprecated */
   DALET(0xce3),
   DALETH(0xce3), /* deprecated */
   HE(0xce4),
   WAW(0xce5),
   ZAIN(0xce6),
   ZAYIN(0xce6), /* deprecated */
   CHET(0xce7),
   HET(0xce7), /* deprecated */
   TET(0xce8),
   TETH(0xce8), /* deprecated */
   YOD(0xce9),
   FINALKAPH(0xcea),
   KAPH(0xceb),
   LAMED(0xcec),
   FINALMEM(0xced),
   MEM(0xcee),
   FINALNUN(0xcef),
   NUN(0xcf0),
   SAMECH(0xcf1),
   SAMEKH(0xcf1), /* deprecated */
   AYIN(0xcf2),
   FINALPE(0xcf3),
   PE(0xcf4),
   FINALZADE(0xcf5),
   FINALZADI(0xcf5), /* deprecated */
   ZADE(0xcf6),
   ZADI(0xcf6), /* deprecated */
   QOPH(0xcf7),
   KUF(0xcf7), /* deprecated */
   RESH(0xcf8),
   SHIN(0xcf9),
   TAW(0xcfa),
   TAF(0xcfa), /* deprecated */
   SWITCH(0xff7e); /* alias for mode_switch */
  
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Hebrew(int code) {
      this.code = code;
  }
}
