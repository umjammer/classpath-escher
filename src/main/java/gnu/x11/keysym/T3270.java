package gnu.x11.keysym;


/**
 * 3270 Terminal-specific keyboard symbols. Imported from
 * <code>XK_3270</code> section of <code>/usr/include/X11/keysymdef.h</code>. 
 * Note that byte 3(0xfd.
 */
public enum T3270 {
   DUPLICATE(0xfd01),
   FIELD_MARK(0xfd02),
   RIGHT2(0xfd03),
   LEFT2(0xfd04),
   BACK_TAB(0xfd05),
   ERASE_EOF(0xfd06),
   ERASE_INPUT(0xfd07),
   RESET(0xfd08),
   QUIT(0xfd09),
   PA1(0xfd0a),
   PA2(0xfd0b),
   PA3(0xfd0c),
   TEST(0xfd0d),
   ATTN(0xfd0e),
   CURSOR_BLINK(0xfd0f),
   ALT_CURSOR(0xfd10),
   KEY_CLICK(0xfd11),
   JUMP(0xfd12),
   IDENT(0xfd13),
   RULE(0xfd14),
   COPY(0xfd15),
   PLAY(0xfd16),
   SETUP(0xfd17),
   RECORD(0xfd18),
   CHANGE_SCREEN(0xfd19),
   DELETE_WORD(0xfd1a),
   EX_SELECT(0xfd1b),
   CURSOR_SELECT(0xfd1c),
   PRINT_SCREEN(0xfd1d),
   ENTER(0xfd1e);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   T3270(int code) {
       this.code = code;
   }
}
