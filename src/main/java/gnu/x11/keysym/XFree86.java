package gnu.x11.keysym;


/**
 * XFree86-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/XF86keysym.h</code>.
 */
public enum XFree86 {
  /* ModeLock. This one is old, and not really used any more since XKB
   * offers this functionality.
   */

   MODE_LOCK(0x1008ff01), /* mode switch lock */

  
  /* "Internet" keyboards. */

   STANDBY(0x1008ff10),
   AUDIO_LOWER_VOLUME(0x1008ff11),
   AUDIO_MUTE(0x1008ff12),
   AUDIO_RAISE_VOLUME(0x1008ff13),
   AUDIO_PLAY(0x1008ff14),
   AUDIO_STOP(0x1008ff15),
   AUDIO_PREV(0x1008ff16),
   AUDIO_NEXT(0x1008ff17),
   HOME_PAGE(0x1008ff18),
   MAIL(0x1008ff19),
   START(0x1008ff1a),
   SEARCH(0x1008ff1b),
   AUDIO_RECORD(0x1008ff1c),


  /* PDA's (e.g. Palm, PocketPC or elsewhere). */

   CALCULATOR(0x1008ff1d),
   MEMO(0x1008ff1e),
   TO_DO_LIST(0x1008ff1f),
   CALENDAR(0x1008ff20),
   POWER_DOWN(0x1008ff21),
   CONTRASTADJUST(0x1008ff22),
   ROCKER_UP(0x1008ff23),
   ROCKER_DOWN(0x1008ff24),
   ROCKER_ENTER(0x1008ff25),
   BACK(0x1008ff26),
   FORWARD(0x1008ff27),
   STOP(0x1008ff28),
   REFRESH(0x1008ff29),
   POWER_OFF(0x1008ff1a),
   WAKE_UP(0x1008ff1b),


  /* Note, 0x1008ff02 - 0x1008ff0f are free and should be used for misc new
   * keysyms that don't fit into any of the groups below.
   */

  
  /* Misc. */

   FAVORITES(0x1008ff30),
   AUDIO_PAUSE(0x1008ff31),
   AUDIO_MEDIA(0x1008ff32),
   MY_COMPUTER(0x1008ff33),
   VENDOR_HOME(0x1008ff34),
   LIGHT_BULB(0x1008ff35),
   SHOP(0x1008ff36);

   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   XFree86(int code) {
       this.code = code;
   }
}
