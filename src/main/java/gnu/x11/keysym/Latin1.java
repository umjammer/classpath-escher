package gnu.x11.keysym;

import java.util.HashMap;
import java.util.Map;


/**
 * Latin 1-specific keyboard symbols. Imported from
 * <code>XK_LATIN1</code> section of
 * <code>/usr/include/X11/X11/keysymdef.h</code>. 
 * Note that byte 3(0x00.
 */
public enum Latin1 {
   SPACE(0x020),
   EXCLAM(0x021),
   QUOTE_DBL(0x022),
   NUMBER_SIGN(0x023),
   DOLLAR(0x024),
   PERCENT(0x025),
   AMPERSAND(0x026),
   APOSTROPHE(0x027),
   QUOTE_RIGHT(0x027), /* deprecated */
   PAREN_LEFT(0x028),
   PAREN_RIGHT(0x029),
   ASTERISK(0x02a),
   PLUS(0x02b),
   COMMA(0x02c),
   MINUS(0x02d),
   PERIOD(0x02e),
   SLASH(0x02f),
   NUM_0(0x030),
   NUM_1(0x031),
   NUM_2(0x032),
   NUM_3(0x033),
   NUM_4(0x034),
   NUM_5(0x035),
   NUM_6(0x036),
   NUM_7(0x037),
   NUM_8(0x038),
   NUM_9(0x039),
   COLON(0x03a),
   SEMICOLON(0x03b),
   LESS(0x03c),
   EQUAL(0x03d),
   GREATER(0x03e),
   QUESTION(0x03f),
   AT(0x040),
   A(0x041),
   B(0x042),
   C(0x043),
   D(0x044),
   E(0x045),
   F(0x046),
   G(0x047),
   H(0x048),
   I(0x049),
   J(0x04a),
   K(0x04b),
   L(0x04c),
   M(0x04d),
   N(0x04e),
   O(0x04f),
   P(0x050),
   Q(0x051),
   R(0x052),
   S(0x053),
   T(0x054),
   U(0x055),
   V(0x056),
   W(0x057),
   X(0x058),
   Y(0x059),
   Z(0x05a),
   BRACKET_LEFT(0x05b),
   BACKSLASH(0x05c),
   BRACKET_RIGHT(0x05d),
   ASCII_CIRCUM(0x05e),
   UNDERSCORE(0x05f),
   GRAVE(0x060),
   QUOTE_LEFT(0x060), /* deprecated */

   A_SMALL(0x061),
   B_SMALL(0x062),
   C_SMALL(0x063),
   D_SMALL(0x064),
   E_SMALL(0x065),
   F_SMALL(0x066),
   G_SMALL(0x067),
   H_SMALL(0x068),
   I_SMALL(0x069),
   J_SMALL(0x06a),
   K_SMALL(0x06b),
   L_SMALL(0x06c),
   M_SMALL(0x06d),
   N_SMALL(0x06e),
   O_SMALL(0x06f),
   P_SMALL(0x070),
   Q_SMALL(0x071),
   R_SMALL(0x072),
   S_SMALL(0x073),
   T_SMALL(0x074),
   U_SMALL(0x075),
   V_SMALL(0x076),
   W_SMALL(0x077),
   X_SMALL(0x078),
   Y_SMALL(0x079),
   Z_SMALL(0x07a),

   BRACE_LEFT(0x07b),
   BAR(0x07c),
   BRACE_RIGHT(0x07d),
   ASCII_TILDE(0x07e),

   NO_BREAKSPACE(0x0a0),
   EXCLAM_DOWN(0x0a1),
   CENT(0x0a2),
   STERLING(0x0a3),
   CURRENCY(0x0a4),
   YEN(0x0a5),
   BROKEN_BAR(0x0a6),
   SECTION(0x0a7),
   DIAERESIS(0x0a8),
   COPYRIGHT(0x0a9),
   ORDFEMININE(0x0aa),
   GUILLEMOT_LEFT(0x0ab), /* left angle quotation mark */
   NOT_SIGN(0x0ac),
   HYPHEN(0x0ad),
   REGISTERED(0x0ae),
   MACRON(0x0af),
   DEGREE(0x0b0),
   PLUS_MINUS(0x0b1),
   TWO_SUPERIOR(0x0b2),
   THREE_SUPERIOR(0x0b3),
   ACUTE(0x0b4),
   MU(0x0b5),
   PARAGRAPH(0x0b6),
   PERIOD_CENTERED(0x0b7),
   CEDILLA(0x0b8),
   ONE_SUPERIOR(0x0b9),
   MASCULINE(0x0ba),
   GUILLEMOT_RIGHT(0x0bb), /* right angle quotation mark */
   ONE_QUARTER(0x0bc),
   ONE_HALF(0x0bd),
   THREE_QUARTERS(0x0be),
   QUESTION_DOWN(0x0bf),
   A_GRAVE(0x0c0),
   A_ACUTE(0x0c1),
   A_CIRCUMFLEX(0x0c2),
   A_TILDE(0x0c3),
   A_DIAERESIS(0x0c4),
   A_RING(0x0c5),
   AE(0x0c6),
   C_CEDILLA(0x0c7),
   E_GRAVE(0x0c8),
   E_ACUTE(0x0c9),
   E_CIRCUMFLEX(0x0ca),
   E_DIAERESIS(0x0cb),
   I_GRAVE(0x0cc),
   I_ACUTE(0x0cd),
   I_CIRCUMFLEX(0x0ce),
   I_DIAERESIS(0x0cf),
   E_TH(0x0d0),
   N_TILDE(0x0d1),
   O_GRAVE(0x0d2),
   O_ACUTE(0x0d3),
   O_CIRCUMFLEX(0x0d4),
   O_TILDE(0x0d5),
   O_DIAERESIS(0x0d6),
   MULTIPLY(0x0d7),
   O_OBLIQUE(0x0d8),
   O_SLASH(0x0d9),
   U_ACUTE(0x0da),
   U_CIRCUMFLEX(0x0db),
   U_DIAERESIS(0x0dc),
   Y_ACUTE(0x0dd),
   T_HORN(0x0de),
   S_SHARP(0x0df),

   A_GRAVE_SMALL(0x0e0),
   A_ACUTE_SMALL(0x0e1),
   A_CIRCUMFLEX_SMALL(0x0e2),
   A_TILDE_SMALL(0x0e3),
   A_DIAERESIS_SMALL(0x0e4),
   A_RING_SMALL(0x0e5),
   AE_SMALL(0x0e6),
   C_CEDILLA_SMALL(0x0e7),
   E_GRAVE_SMALL(0x0e8),
   E_ACUTE_SMALL(0x0e9),
   E_CIRCUMFLEX_SMALL(0x0ea),
   E_DIAERESIS_SMALL(0x0eb),
   I_GRAVE_SMALL(0x0ec),
   I_ACUTE_SMALL(0x0ed),
   I_CIRCUMFLEX_SMALL(0x0ee),
   I_DIAERESIS_SMALL(0x0ef),
   E_TH_SMALL(0x0f0),
   N_TILDE_SMALL(0x0f1),
   O_GRAVE_SMALL(0x0f2),
   O_ACUTE_SMALL(0x0f3),
   O_CIRCUMFLEX_SMALL(0x0f4),
   O_TILDE_SMALL(0x0f5),
   O_DIAERESIS_SMALL(0x0f6),
   DIVISION_SMALL(0x0f7),
   O_SLASH_SMALL(0x0f8),
   O_OBLIQUE_SMALL(0x0f9),
   UA_CUTE_SMALL(0x0fa),
   U_CIRCUMFLEX_SMALL(0x0fb),
   U_DIAERESIS_SMALL(0x0fc),
   YA_CUTE_SMALL(0x0fd),
   T_HORN_SMALL(0x0fe),
   Y_DIAERESIS_SMALL(0x0ff),
   UNKNOWN_KEY(-1);

  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  Latin1(int code) {
      this.code = code;
  }
  
  private static Map<Integer, Latin1> keyCodes;
  
  private static Map<Integer, Latin1> getKeyCodes() {
      if (keyCodes == null) {
          keyCodes = new HashMap<>();
          for (Latin1 key : Latin1.values())
              keyCodes.put(key.code, key);
      }
      
      return keyCodes;
  }
  
  public static Latin1 getCode(int id) {
    Latin1 code = getKeyCodes().get(id);
    return (code == null) ? UNKNOWN_KEY : code;
  }
}
