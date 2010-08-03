package gnu.x11.keysym;

import java.util.HashMap;
import java.util.Map;


/**
 * Miscellaneous keyboard symbols. Imported from <code>XK_MISCELLANY</code>
 * section of <code>/usr/include/X11/keysymdef.h</code>.
 */
public enum Misc {
  /* I use the following emacs lisp code together with some other (dirty)
   * keyboard macro hack to convert `/usr/include/X11/*keysym*.h' to java
   * defintions.
   *
   * (defun mixed-case-to-lisp-case (string)
   *   "Convert SomeMixedCaseString to a_more_readable_lisp_case_string.
   * E.g. XK_Armenian_ligature_ew _> xk_armenian_ligature_ew."
   *   (downcase
   *    (char-list-to-string 
   *     (loop
   *       with previous(? 
   *       for current in (string-to-char-list string)
   *       if (and (lowercasep previous) (uppercasep current))
   *       collect ?_ and collect current
   *       else collect current
   *       do (setq previous current)))))   
   */


   VOID_SYMBOL(0xffffff),


  /* TTY Functions, cleverly chosen to map to ascii, for convenience of
   * programming, but could have been arbitrary (at the cost of lookup
   * tables in client code).
   */

   BACKSPACE(0xff08), /* back space, back char */
   TAB(0xff09),
   LINEFEED(0xff0a), /* linefeed, LF */
   CLEAR(0xff0b),
   RETURN(0xff0d), /* return, enter */
   PAUSE(0xff13), /* pause, hold */
   SCROLL_LOCK(0xff14),
   SYS_REQ(0xff15),
   ESCAPE(0xff1b),
   DELETE(0xffff), /* delete, rubout */


  /* International & multi-key character composition. */

   MULTI_KEY(0xff20), /* multi-key character compose */
   CODEINPUT(0xff37),
   SINGLE_CANDIDATE(0xff3c),
   MULTIPLE_CANDIDATE(0xff3d),
   PREVIOUS_CANDIDATE(0xff3e),



  /* Japanese keyboard support. 0xff31 thru 0xff3f are under XK_KOREAN. */  
  
   KANJI(0xff21), /* kanji, kanji convert */
   MUHENKAN(0xff22), /* cancel conversion */
   HENKAN_MODE(0xff23), /* start/stop conversion */
   HENKAN(0xff23), /* alias for henkan_mode */
   ROMAJI(0xff24), /* to romaji */
   HIRAGANA(0xff25), /* to hiragana */
   KATAKANA(0xff26), /* to katakana */
   HIRAGANA_KATAKANA(0xff27), /* hiragana/katakana toggle */
   ZENKAKU(0xff28), /* to zenkaku */
   HANKAKU(0xff29), /* to hankaku */
   ZENKAKU_HANKAKU(0xff2a), /* zenkaku/hankaku toggle */
   TOUROKU(0xff2b), /* add to dictionary */
   MASSYO(0xff2c), /* delete from dictionary */
   KANA_LOCK(0xff2d), /* kana lock */
   KANA_SHIFT(0xff2e), /* kana shift */
   EISU_SHIFT(0xff2f), /* alphanumeric shift */
   EISU_TOGGLE(0xff30), /* alphanumeric toggle */
   KANJI_BANGOU(0xff37), /* codeinput */
   ZEN_KOHO(0xff3d), /* multiple/all candidate(s) */
   MAE_KOHO(0xff3e), /* previous candidate */


  /** Cursor control & motion. */

   HOME(0xff50),
   LEFT(0xff51), /* move left, left arrow */
   UP(0xff52), /* move up, up arrow */
   RIGHT(0xff53), /* move right, right arrow */
   DOWN(0xff54), /* move down, down arrow */
   PRIOR(0xff55), /* prior, previous */
   PAGE_UP(0xff55),
   NEXT(0xff56), /* next */
   PAGE_DOWN(0xff56),
   END(0xff57), /* eol */
   BEGIN(0xff58), /* bol */


  /* Misc Functions. */

   SELECT(0xff60), /* select, mark */
   PRINT(0xff61),
   EXECUTE(0xff62), /* execute, run, do */
   INSERT(0xff63), /* insert, insert here */
   UNDO(0xff65), /* undo, oops */
   REDO(0xff66), /* redo, again */
   MENU(0xff67),
   FIND(0xff68), /* find, search */
   CANCEL(0xff69), /* cancel, stop, abort, exit */
   HELP(0xff6a), /* help */
   BREAK(0xff6b),
   MODE_SWITCH(0xff7e), /* character set switch */
   SCRIPT_SWITCH(0xff7e), /* alias for mode_switch */
   NUM_LOCK(0xff7f),


  /* Keypad Functions, keypad numbers cleverly chosen to map to ascii. */

   KP_SPACE(0xff80), /* space */
   KP_TAB(0xff89),
   KP_ENTER(0xff8d), /* enter */
   KP_F1(0xff91), /* pf1, kp_a, ... */
   KP_F2(0xff92),
   KP_F3(0xff93),
   KP_F4(0xff94),
   KP_HOME(0xff95),
   KP_LEFT(0xff96),
   KP_UP(0xff97),
   KP_RIGHT(0xff98),
   KP_DOWN(0xff99),
   KP_PRIOR(0xff9a),
   KP_PAGE_UP(0xff9a),
   KP_NEXT(0xff9b),
   KP_PAGE_DOWN(0xff9b),
   KP_END(0xff9c),
   KP_BEGIN(0xff9d),
   KP_INSERT(0xff9e),
   KP_DELETE(0xff9f),
   KP_EQUAL(0xffbd), /* equals */
   KP_MULTIPLY(0xffaa),
   KP_ADD(0xffab),
   KP_SEPARATOR(0xffac), /* separator, often comma */
   KP_SUBTRACT(0xffad),
   KP_DECIMAL(0xffae),
   KP_DIVIDE(0xffaf),

   KP_0(0xffb0),
   KP_1(0xffb1),
   KP_2(0xffb2),
   KP_3(0xffb3),
   KP_4(0xffb4),
   KP_5(0xffb5),
   KP_6(0xffb6),
   KP_7(0xffb7),
   KP_8(0xffb8),
   KP_9(0xffb9),



  /* Auxilliary Functions), note the duplicate definitions for left and
   * right function keys), Sun keyboards and a few other manufactures have
   * such function key groups on the left and/or right sides of the
   * keyboard. We've not found a keyboard with more than 35 function keys
   * total.
   */

   F1(0xffbe),
   F2(0xffbf),
   F3(0xffc0),
   F4(0xffc1),
   F5(0xffc2),
   F6(0xffc3),
   F7(0xffc4),
   F8(0xffc5),
   F9(0xffc6),
   F10(0xffc7),
   F11(0xffc8),
   L1(0xffc8),
   F12(0xffc9),
   L2(0xffc9),
   F13(0xffca),
   L3(0xffca),
   F14(0xffcb),
   L4(0xffcb),
   F15(0xffcc),
   L5(0xffcc),
   F16(0xffcd),
   L6(0xffcd),
   F17(0xffce),
   L7(0xffce),
   F18(0xffcf),
   L8(0xffcf),
   F19(0xffd0),
   L9(0xffd0),
   F20(0xffd1),
   L10(0xffd1),
   F21(0xffd2),
   R1(0xffd2),
   F22(0xffd3),
   R2(0xffd3),
   F23(0xffd4),
   R3(0xffd4),
   F24(0xffd5),
   R4(0xffd5),
   F25(0xffd6),
   R5(0xffd6),
   F26(0xffd7),
   R6(0xffd7),
   F27(0xffd8),
   R7(0xffd8),
   F28(0xffd9),
   R8(0xffd9),
   F29(0xffda),
   R9(0xffda),
   F30(0xffdb),
   R10(0xffdb),
   F31(0xffdc),
   R11(0xffdc),
   F32(0xffdd),
   R12(0xffdd),
   F33(0xffde),
   R13(0xffde),
   F34(0xffdf),
   R14(0xffdf),
   F35(0xffe0),
   R15(0xffe0),


  /* Modifiers. */

   SHIFT_L(0xffe1), /* left shift */
   SHIFT_R(0xffe2), /* right shift */
   CONTROL_L(0xffe3), /* left control */
   CONTROL_R(0xffe4), /* right control */
   CAPS_LOCK(0xffe5), /* caps lock */
   SHIFT_LOCK(0xffe6), /* shift lock */

   META_L(0xffe7), /* left meta */
   META_R(0xffe8), /* right meta */
   ALT_L(0xffe9), /* left alt */
   ALT_R(0xffea), /* right alt */
   SUPER_L(0xffeb), /* left super */
   SUPER_R(0xffec), /* right super */
   HYPER_L(0xffed), /* left hyper */
   HYPER_R(0xffee), /* right hyper */  
   UNKNOWN_KEY(-1);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Misc(int code) {
       this.code = code;
   }
   
   private static Map<Integer, Misc> keyCodes;
   
   private static Map<Integer, Misc> getKeyCodes() {
       if (keyCodes == null) {
           keyCodes = new HashMap<Integer, Misc>();
           for (Misc key : Misc.values())
               keyCodes.put(key.code, key);
       }
       
       return keyCodes;
   }
   
   public static Misc getCode(int id) {
     Misc code = getKeyCodes().get(id);
     return (code == null) ? UNKNOWN_KEY : code;
   }
}
