package gnu.x11.keysym;


/**
 * Armenian-specific keyboard symbols. Imported from
 * <code>XK_ARMENIAN</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x14.
 */
public enum Armenian {
   ETERNITY(0x14a1),
   LIGATURE_EW(0x14a2),
   FULL_STOP(0x14a3),
   VERJAKET(0x14a3),
   PARENRIGHT(0x14a4),
   PARENLEFT(0x14a5),
   GUILLEMOTRIGHT(0x14a6),
   GUILLEMOTLEFT(0x14a7),
   EM_DASH(0x14a8),
   DOT(0x14a9),
   MIJAKET(0x14a9),
   SEPARATION_MARK(0x14aa),
   BUT(0x14aa),
   COMMA(0x14ab),
   EN_DASH(0x14ac),
   HYPHEN(0x14ad),
   YENTAMNA(0x14ad),
   ELLIPSIS(0x14ae),
   EXCLAM(0x14af),
   AMANAK(0x14af),
   ACCENT(0x14b0),
   SHESHT(0x14b0),
   QUESTION(0x14b1),
   PARUYK(0x14b1),
   AYB(0x14b2),
   AYB_SMALL(0x14b3),
   BEN(0x14b4),
   BEN_SMALL(0x14b5),
   GIM(0x14b6),
   GIM_SMALL(0x14b7),
   DA(0x14b8),
   DA_SMALL(0x14b9),
   YECH(0x14ba),
   YECH_SMALL(0x14bb),
   ZA(0x14bc),
   ZA_SMALL(0x14bd),
   E(0x14be),
   E_SMALL(0x14bf),
   AT(0x14c0),
   AT_SMALL(0x14c1),
   TO(0x14c2),
   TO_SMALL(0x14c3),
   ZHE(0x14c4),
   ZHE_SMALL(0x14c5),
   INI(0x14c6),
   INI_SMALL(0x14c7),
   LYUN(0x14c8),
   LYUN_SMALL(0x14c9),
   KHE(0x14ca),
   KHE_SMALL(0x14cb),
   TSA(0x14cc),
   TSA_SMALL(0x14cd),
   KEN(0x14ce),
   KEN_SMALL(0x14cf),
   HO(0x14d0),
   HO_SMALL(0x14d1),
   DZA(0x14d2),
   DZA_SMALL(0x14d3),
   GHAT(0x14d4),
   GHAT_SMALL(0x14d5),
   TCHE(0x14d6),
   TCHE_SMALL(0x14d7),
   MEN(0x14d8),
   MEN_SMALL(0x14d9),
   HI(0x14da),
   HI_SMALL(0x14db),
   NU(0x14dc),
   NU_SMALL(0x14dd),
   SHA(0x14de),
   SHA_SMALL(0x14df),
   VO(0x14e0),
   VO_SMALL(0x14e1),
   CHA(0x14e2),
   CHA_SMALL(0x14e3),
   PE(0x14e4),
   PE_SMALL(0x14e5),
   JE(0x14e6),
   JE_SMALL(0x14e7),
   RA(0x14e8),
   RA_SMALL(0x14e9),
   SE(0x14ea),
   SE_SMALL(0x14eb),
   VEV(0x14ec),
   VEV_SMALL(0x14ed),
   TYUN(0x14ee),
   TYUN_SMALL(0x14ef),
   RE(0x14f0),
   RE_SMALL(0x14f1),
   TSO(0x14f2),
   TSO_SMALL(0x14f3),
   VYUN(0x14f4),
   VYUN_SMALL(0x14f5),
   PYUR(0x14f6),
   PYUR_SMALL(0x14f7),
   KE(0x14f8),
   KE_SMALL(0x14f9),
   O(0x14fa),
   O_SMALL(0x14fb),
   FE(0x14fc),
   FE_SMALL(0x14fd),
   APOSTROPHE(0x14fe),
   SECTION_SIGN(0x14ff);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Armenian(int code) {
       this.code = code;
   }
}
