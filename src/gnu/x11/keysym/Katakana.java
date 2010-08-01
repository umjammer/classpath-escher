package gnu.x11.keysym;


/**
 * Katakana-specific keyboard symbols. Imported from
 * <code>XK_KATAKANA</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x04. 
 */
public enum Katakana {
   YDIAERESIS(0x13be),
   OVERLINE(0x47e),
   FULL_STOP(0x4a1),
   OPENING_BRACKET(0x4a2),
   CLOSING_BRACKET(0x4a3),
   COMMA(0x4a4),
   CONJUNCTIVE(0x4a5),
   MIDDLE_DOT(0x4a5), /* deprecated */
   WO(0x4a6),

   A_SMALL(0x4a7),
   I_SMALL(0x4a8),
   U_SMALL(0x4a9),
   E_SMALL(0x4aa),
   O_SMALL(0x4ab),
   YA_SMALL(0x4ac),
   YU_SMALL(0x4ad),
   YO_SMALL(0x4ae),
   TSU_SMALL(0x4af),
   TU_SMALL(0x4af), /* deprecated */

   PROLONGED_SOUND(0x4b0),
   A(0x4b1),
   I(0x4b2),
   U(0x4b3),
   E(0x4b4),
   O(0x4b5),
   KA(0x4b6),
   KI(0x4b7),
   KU(0x4b8),
   KE(0x4b9),
   KO(0x4ba),
   SA(0x4bb),
   SHI(0x4bc),
   SU(0x4bd),
   SE(0x4be),
   SO(0x4bf),
   TA(0x4c0),
   CHI(0x4c1),
   TI(0x4c1), /* deprecated */
   TSU(0x4c2),
   TU(0x4c2), /* deprecated */
   TE(0x4c3),
   TO(0x4c4),
   NA(0x4c5),
   NI(0x4c6),
   NU(0x4c7),
   NE(0x4c8),
   NO(0x4c9),
   HA(0x4ca),
   HI(0x4cb),
   FU(0x4cc),
   HU(0x4cc), /* deprecated */
   HE(0x4cd),
   HO(0x4ce),
   MA(0x4cf),
   MI(0x4d0),
   MU(0x4d1),
   ME(0x4d2),
   MO(0x4d3),

   YA(0x4d4),
   YU(0x4d5),
   YO(0x4d6),

   RA(0x4d7),
   RI(0x4d8),
   RU(0x4d9),
   RE(0x4da),
   RO(0x4db),
   WA(0x4dc),
   N(0x4dd),
   VOICED_SOUND(0x4de),
   SEMI_VOICED_SOUND(0x4df),
   SWITCH(0xff7e); /* alias for mode_switch */
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Katakana(int code) {
      this.code = code;
  }
}
