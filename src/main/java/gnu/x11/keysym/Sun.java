package gnu.x11.keysym;


/**
 * Sun-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/Sunkeysym.h</code>.
 */
public enum Sun {
  /* Floating Accent. */

   FA_GRAVE(0x1005ff00),
   FA_CIRCUM(0x1005ff01),
   FA_TILDE(0x1005ff02),
   FA_ACUTE(0x1005ff03),
   FA_DIAERESIS(0x1005ff04),
   FA_CEDILLA(0x1005ff05),

  
  /* Miscellaneous Functions. */

   F36(0x1005ff10), /* labeled f11 */
   F37(0x1005ff11), /* labeled f12 */

  
  /* International & Multi-Key Character Composition. */

   SYS_REQ(0x1005ff60),
   PRINT_SCREEN(0x0000ff61), /* same as xk_print */
   COMPOSE(0x0000ff20), /* same as xk_multi_key */
   ALT_GRAPH(0x0000ff7e), /* same as xk_mode_switch */


  /* Cursor Control. */ 

   PAGE_UP(0x0000ff55), /* same as xk_prior */
   PAGE_DOWN(0x0000ff56), /* same as xk_next */


  /* Open Look Functions. */

   UNDO(0x0000ff65), /* same as xk_undo */
   AGAIN(0x0000ff66), /* same as xk_redo */
   FIND(0x0000ff68), /* same as xk_find */
   STOP(0x0000ff69), /* same as xk_cancel */
   PROPS(0x1005ff70),
   FRONT(0x1005ff71),
   COPY(0x1005ff72),
   OPEN(0x1005ff73),
   PASTE(0x1005ff74),
   CUT(0x1005ff75),
   POWER_SWITCH(0x1005ff76),
   AUDIO_LOWER_VOLUME(0x1005ff77),
   AUDIO_MUTE(0x1005ff78),
   AUDIO_RAISE_VOLUME(0x1005ff79),
   VIDEO_DEGAUSS(0x1005ff7a),
   VIDEO_LOWER_BRIGHTNESS(0x1005ff7b),
   VIDEO_RAISE_BRIGHTNESS(0x1005ff7c),
   POWER_SWITCH_SHIFT(0x1005ff7d);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Sun(int code) {
       this.code = code;
   }
}
