package gnu.x11.keysym;


/**
 * Apollo (AP)-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/ap_keysym.h</code>.
 */
public enum Apollo {
   LINE_DEL(0x1000ff00),
   CHAR_DEL(0x1000ff01),
   COPY(0x1000ff02),
   CUT(0x1000ff03),
   PASTE(0x1000ff04),
   MOVE(0x1000ff05),
   GROW(0x1000ff06),
   CMD(0x1000ff07),
   SHELL(0x1000ff08),
   LEFT_BAR(0x1000ff09),
   RIGHT_BAR(0x1000ff0a),
   LEFT_BOX(0x1000ff0b),
   RIGHT_BOX(0x1000ff0c),
   UP_BOX(0x1000ff0d),
   DOWN_BOX(0x1000ff0e),
   POP(0x1000ff0f),
   READ(0x1000ff10),
   EDIT(0x1000ff11),
   SAVE(0x1000ff12),
   EXIT(0x1000ff13),
   REPEAT(0x1000ff14),
   KP_PARENLEFT(0x1000ffa8),
   KP_PARENRIGHT(0x1000ffa9);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Apollo(int code) {
       this.code = code;
   }
}
