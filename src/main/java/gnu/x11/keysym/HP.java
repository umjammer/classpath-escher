package gnu.x11.keysym;


/**
 * Hewlett-Packard (HP)-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/HPkeysym.h</code>.
 */
public enum HP {
   CLEAR_LINE(0x1000ff6f),
   INSERT_LINE(0x1000ff70),
   DELETE_LINE(0x1000ff71),
   INSERT_CHAR(0x1000ff72),
   DELETE_CHAR(0x1000ff73),
   BACK_TAB(0x1000ff74),
   KP_BACK_TAB(0x1000ff75),
   MODELOCK1(0x1000ff48),
   MODELOCK2(0x1000ff49),
   RESET(0x1000ff6c),
   SYSTEM(0x1000ff6d),
   USER(0x1000ff6e),
   MUTE_ACUTE(0x100000a8),
   MUTE_GRAVE(0x100000a9),
   MUTE_ASCIICIRCUM(0x100000aa),
   MUTE_DIAERESIS(0x100000ab),
   MUTE_ASCIITILDE(0x100000ac),
   LIRA(0x100000af),
   GUILDER(0x100000be),
   YDIAERESIS(0x100000ee),
   IO(0x100000ee),
   LONGMINUS(0x100000f6),
   BLOCK(0x100000fc);
  
  
  private int code;
  
  public int getCode() {
      return this.code;
  }
  
  HP(int code) {
      this.code = code;
  }
}
