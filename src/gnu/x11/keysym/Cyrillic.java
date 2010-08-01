package gnu.x11.keysym;


/**
 * Cyrillic-specific keyboard symbols. Imported from
 * <code>XK_CYRILLIC</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x06. 
 */
public enum Cyrillic {
   GHE_BAR(0x680),
   GHE_BAR_SMALL(0x690),
   ZHE_DESCENDER(0x681),
   ZHE_DESCENDER_SMALL(0x691),
   KA_DESCENDER(0x682),
   KA_DESCENDER_SMALL(0x692),
   KA_VERTSTROKE(0x683),
   KA_VERTSTROKE_SMALL(0x693),
   EN_DESCENDER(0x684),
   EN_DESCENDER_SMALL(0x694),
   U_STRAIGHT(0x685),
   U_STRAIGHT_SMALL(0x695),
   U_STRAIGHT_BAR(0x686),
   U_STRAIGHT_BAR_SMALL(0x696),
   HA_DESCENDER(0x687),
   HA_DESCENDER_SMALL(0x697),
   CHE_DESCENDER(0x688),
   CHE_DESCENDER_SMALL(0x698),
   CHE_VERTSTROKE(0x689),
   CHE_VERTSTROKE_SMALL(0x699),
   SHHA(0x68a),
   SHHA_SMALL(0x69a),

   SCHWA(0x68c),
   SCHWA_SMALL(0x69c),
   I_MACRON(0x68d),
   I_MACRON_SMALL(0x69d),
   O_BAR(0x68e),
   O_BAR_SMALL(0x69e),
   U_MACRON(0x68f),
   U_MACRON_SMALL(0x69f),

   SERBIAN_DJE_SMALL(0x6a1),
   MACEDONIA_GJE_SMALL(0x6a2),
   IO_SMALL(0x6a3),
   UKRAINIAN_IE_SMALL(0x6a4),
   UKRANIAN_JE_SMALL(0x6a4), /* deprecated */
   MACEDONIA_DSE_SMALL(0x6a5),
   UKRAINIAN_I_SMALL(0x6a6),
   UKRANIAN_I_SMALL(0x6a6), /* deprecated */
   UKRAINIAN_YI_SMALL(0x6a7),
   UKRANIAN_YI_SMALL(0x6a7), /* deprecated */
   JE_SMALL(0x6a8),
   SERBIAN_JE_SMALL(0x6a8), /* deprecated */
   LJE_SMALL(0x6a9),
   SERBIAN_LJE_SMALL(0x6a9), /* deprecated */
   NJE_SMALL(0x6aa),
   SERBIAN_NJE_SMALL(0x6aa), /* deprecated */
   SERBIAN_TSHE_SMALL(0x6ab),
   MACEDONIA_KJE_SMALL(0x6ac),
   UKRAINIAN_GHE_WITH_UPTURN_SMALL(0x6ad),
   BYELORUSSIAN_SHORTU_SMALL(0x6ae),
   DZHE_SMALL(0x6af),
   SERBIAN_DZE_SMALL(0x6af), /* deprecated */

   NUMEROSIGN(0x6b0),
   SERBIAN_DJE(0x6b1),
   MACEDONIA_GJE(0x6b2),
   IO(0x6b3),
   UKRAINIAN_IE(0x6b4),
   UKRANIAN_JE(0x6b4), /* deprecated */
   MACEDONIA_DSE(0x6b5),
   UKRAINIAN_I(0x6b6),
   UKRANIAN_I(0x6b6), /* deprecated */
   UKRAINIAN_YI(0x6b7),
   UKRANIAN_YI(0x6b7), /* deprecated */
   JE(0x6b8),
   SERBIAN_JE(0x6b8), /* deprecated */
   LJE(0x6b9),
   SERBIAN_LJE(0x6b9), /* deprecated */
   NJE(0x6ba),
   SERBIAN_NJE(0x6ba), /* deprecated */
   SERBIAN_TSHE(0x6bb),
   MACEDONIA_KJE(0x6bc),
   UKRAINIAN_GHE_WITH_UPTURN(0x6bd),
   BYELORUSSIAN_SHORTU(0x6be),
   DZHE(0x6bf),
   SERBIAN_DZE(0x6bf), /* deprecated */

   YU_SMALL(0x6c0),
   A_SMALL(0x6c1),
   BE_SMALL(0x6c2),
   TSE_SMALL(0x6c3),
   DE_SMALL(0x6c4),
   IE_SMALL(0x6c5),
   EF_SMALL(0x6c6),
   GHE_SMALL(0x6c7),
   HA_SMALL(0x6c8),
   I_SMALL(0x6c9),
   SHORTI_SMALL(0x6ca),
   KA_SMALL(0x6cb),
   EL_SMALL(0x6cc),
   EM_SMALL(0x6cd),
   EN_SMALL(0x6ce),
   O_SMALL(0x6cf),
   PE_SMALL(0x6d0),
   YA_SMALL(0x6d1),
   ER_SMALL(0x6d2),
   ES_SMALL(0x6d3),
   TE_SMALL(0x6d4),
   U_SMALL(0x6d5),
   ZHE_SMALL(0x6d6),
   VE_SMALL(0x6d7),
   SOFTSIGN_SMALL(0x6d8),
   YERU_SMALL(0x6d9),
   ZE_SMALL(0x6da),
   SHA_SMALL(0x6db),
   E_SMALL(0x6dc),
   SHCHA_SMALL(0x6dd),
   CHE_SMALL(0x6de),
   HARDSIGN_SMALL(0x6df),

   YU(0x6e0),
   A(0x6e1),
   BE(0x6e2),
   TSE(0x6e3),
   DE(0x6e4),
   IE(0x6e5),
   EF(0x6e6),
   GHE(0x6e7),
   HA(0x6e8),
   I(0x6e9),
   SHORTI(0x6ea),
   KA(0x6eb),
   EL(0x6ec),
   EM(0x6ed),
   EN(0x6ee),
   O(0x6ef),
   PE(0x6f0),
   YA(0x6f1),
   ER(0x6f2),
   ES(0x6f3),
   TE(0x6f4),
   U(0x6f5),
   ZHE(0x6f6),
   VE(0x6f7),
   SOFTSIGN(0x6f8),
   YERU(0x6f9),
   ZE(0x6fa),
   SHA(0x6fb),
   E(0x6fc),
   SHCHA(0x6fd),
   CHE(0x6fe),
   HARDSIGN(0x6ff);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Cyrillic(int code) {
       this.code = code;
   }
}
