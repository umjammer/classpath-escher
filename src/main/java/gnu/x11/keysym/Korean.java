package gnu.x11.keysym;


/**
 * Korean-specific keyboard symbols. Imported from
 * <code>XK_KOREAN</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x0e.
 */
public enum Korean {
   TOGGLE(0xff31), /* hangul start/stop(toggle) */
   START(0xff32), /* hangul start */
   END(0xff33), /* hangul end, english start */
   HANJA(0xff34), /* start hangul->hanja conversion */
   JAMO(0xff35), /* hangul jamo mode */
   ROMAJA(0xff36), /* hangul romaja mode */
   CODEINPUT(0xff37), /* hangul code input mode */
   JEONJA(0xff38), /* jeonja mode */
   BANJA(0xff39), /* banja mode */
   PRE_HANJA(0xff3a), /* pre hanja conversion */
   POST_HANJA(0xff3b), /* post hanja conversion */
   SINGLE_CANDIDATE(0xff3c), /* single candidate */
   MULTIPLE_CANDIDATE(0xff3d), /* multiple candidate */
   PREVIOUS_CANDIDATE(0xff3e), /* previous candidate */
   SPECIAL(0xff3f), /* special symbols */
   SWITCH(0xff7e), /* alias for mode_switch */


  /* Hangul Consonant Characters. */

   KIYEOG(0xea1),
   SSANG_KIYEOG(0xea2),
   KIYEOG_SIOS(0xea3),
   NIEUN(0xea4),
   NIEUN_JIEUJ(0xea5),
   NIEUN_HIEUH(0xea6),
   DIKEUD(0xea7),
   SSANG_DIKEUD(0xea8),
   RIEUL(0xea9),
   RIEUL_KIYEOG(0xeaa),
   RIEUL_MIEUM(0xeab),
   RIEUL_PIEUB(0xeac),
   RIEUL_SIOS(0xead),
   RIEUL_TIEUT(0xeae),
   RIEUL_PHIEUF(0xeaf),
   RIEUL_HIEUH(0xeb0),
   MIEUM(0xeb1),
   PIEUB(0xeb2),
   SSANG_PIEUB(0xeb3),
   PIEUB_SIOS(0xeb4),
   SIOS(0xeb5),
   SSANG_SIOS(0xeb6),
   IEUNG(0xeb7),
   JIEUJ(0xeb8),
   SSANG_JIEUJ(0xeb9),
   CIEUC(0xeba),
   KHIEUQ(0xebb),
   TIEUT(0xebc),
   PHIEUF(0xebd),
   HIEUH(0xebe),


  /* Hangul Vowel Characters. */

   A(0xebf),
   AE(0xec0),
   YA(0xec1),
   YAE(0xec2),
   EO(0xec3),
   E(0xec4),
   YEO(0xec5),
   YE(0xec6),
   O(0xec7),
   WA(0xec8),
   WAE(0xec9),
   OE(0xeca),
   YO(0xecb),
   U(0xecc),
   WEO(0xecd),
   WE(0xece),
   WI(0xecf),
   YU(0xed0),
   EU(0xed1),
   YI(0xed2),
   I(0xed3),


  /* Hangul syllable-final (JongSeong) Characters. */

   J_KIYEOG(0xed4),
   J_SSANG_KIYEOG(0xed5),
   J_KIYEOG_SIOS(0xed6),
   J_NIEUN(0xed7),
   J_NIEUN_JIEUJ(0xed8),
   J_NIEUN_HIEUH(0xed9),
   J_DIKEUD(0xeda),
   J_RIEUL(0xedb),
   J_RIEUL_KIYEOG(0xedc),
   J_RIEUL_MIEUM(0xedd),
   J_RIEUL_PIEUB(0xede),
   J_RIEUL_SIOS(0xedf),
   J_RIEUL_TIEUT(0xee0),
   J_RIEUL_PHIEUF(0xee1),
   J_RIEUL_HIEUH(0xee2),
   J_MIEUM(0xee3),
   J_PIEUB(0xee4),
   J_PIEUB_SIOS(0xee5),
   J_SIOS(0xee6),
   J_SSANG_SIOS(0xee7),
   J_IEUNG(0xee8),
   J_JIEUJ(0xee9),
   J_CIEUC(0xeea),
   J_KHIEUQ(0xeeb),
   J_TIEUT(0xeec),
   J_PHIEUF(0xeed),
   J_HIEUH(0xeee),

  
  /* Ancient Hangul Consonant Characters. */

   RIEUL_YEORIN_HIEUH(0xeef),
   SUNKYEONGEUM_MIEUM(0xef0),
   SUNKYEONGEUM_PIEUB(0xef1),
   PAN_SIOS(0xef2),
   KKOGJI_DALRIN_IEUNG(0xef3),
   SUNKYEONGEUM_PHIEUF(0xef4),
   YEORIN_HIEUH(0xef5),


  /* Ancient Hangul Vowel Characters. */

   ARAEA(0xef6),
   ARAEAE(0xef7),


  /* Ancient Hangul syllable-final (JongSeong) Characters. */

   J_PAN_SIOS(0xef8),
   J_KKOGJI_DALRIN_IEUNG(0xef9),
   J_YEORIN_HIEUH(0xefa),


  /* Korean currency symbol. */  
   WON(0xeff);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Korean(int code) {
      this.code = code;
  }
}
