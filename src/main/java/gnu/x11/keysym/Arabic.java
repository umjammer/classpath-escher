package gnu.x11.keysym;


/**
 * Arabic-specific keyboard symbols. Imported from
 * <code>XK_ARABIC</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x05. 
 */
public enum Arabic {
   FARSI_0(0x590),
   FARSI_1(0x591),
   FARSI_2(0x592),
   FARSI_3(0x593),
   FARSI_4(0x594),
   FARSI_5(0x595),
   FARSI_6(0x596),
   FARSI_7(0x597),
   FARSI_8(0x598),
   FARSI_9(0x599),
   PERCENT(0x5a5),
   SUPERSCRIPT_ALEF(0x5a6),
   TTEH(0x5a7),
   PEH(0x5a8),
   TCHEH(0x5a9),
   DDAL(0x5aa),
   RREH(0x5ab),
   COMMA(0x5ac),
   FULLSTOP(0x5ae),
   NUM_0(0x5b0),
   NUM_1(0x5b1),
   NUM_2(0x5b2),
   NUM_3(0x5b3),
   NUM_4(0x5b4),
   NUM_5(0x5b5),
   NUM_6(0x5b6),
   NUM_7(0x5b7),
   NUM_8(0x5b8),
   NUM_9(0x5b9),
   SEMICOLON(0x5bb),
   QUESTION_MARK(0x5bf),
   HAMZA(0x5c1),
   MADDAONALEF(0x5c2),
   HAMZAONALEF(0x5c3),
   HAMZAONWAW(0x5c4),
   HAMZAUNDERALEF(0x5c5),
   HAMZAONYEH(0x5c6),
   ALEF(0x5c7),
   BEH(0x5c8),
   TEHMARBUTA(0x5c9),
   TEH(0x5ca),
   THEH(0x5cb),
   JEEM(0x5cc),
   HAH(0x5cd),
   KHAH(0x5ce),
   DAL(0x5cf),
   THAL(0x5d0),
   RA(0x5d1),
   ZAIN(0x5d2),
   SEEN(0x5d3),
   SHEEN(0x5d4),
   SAD(0x5d5),
   DAD(0x5d6),
   TAH(0x5d7),
   ZAH(0x5d8),
   AIN(0x5d9),
   GHAIN(0x5da),
   TATWEEL(0x5e0),
   FEH(0x5e1),
   QAF(0x5e2),
   KAF(0x5e3),
   LAM(0x5e4),
   MEEM(0x5e5),
   NOON(0x5e6),
   HA(0x5e7),
   HEH(0x5e7), /* deprecated */
   WAW(0x5e8),
   ALEFMAKSURA(0x5e9),
   YEH(0x5ea),
   FATHATAN(0x5eb),
   DAMMATAN(0x5ec),
   KASRATAN(0x5ed),
   FATHA(0x5ee),
   DAMMA(0x5ef),
   KASRA(0x5f0),
   SHADDA(0x5f1),
   SUKUN(0x5f2),
   MADDA_ABOVE(0x5f3),
   HAMZA_ABOVE(0x5f4),
   HAMZA_BELOW(0x5f5),
   JEH(0x5f6),
   VEH(0x5f7),
   KEHEH(0x5f8),
   GAF(0x5f9),
   NOON_GHUNNA(0x5fa),
   HEH_DOACHASHMEE(0x5fb),
   FARSI_YEH(0x5fc),
   YEH_BAREE(0x5fd),
   HEH_GOAL(0x5fe),
   SWITCH(0xff7e); /* alias for mode_switch */
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Arabic(int code) {
       this.code = code;
   }
}
