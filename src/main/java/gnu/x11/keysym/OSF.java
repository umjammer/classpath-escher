package gnu.x11.keysym;


/**
 * OSF-specific keyboard symbols. Imported from
 * <code>/usr/include/X11/HPkeysym.h</code>.
 */
public enum OSF {
   COPY(0x1004ff02),
   CUT(0x1004ff03),
   PASTE(0x1004ff04),
   BACK_TAB(0x1004ff07),
   BACK_SPACE(0x1004ff08),
   CLEAR(0x1004ff0b),
   ESCAPE(0x1004ff1b),
   ADD_MODE(0x1004ff31),
   PRIMARY_PASTE(0x1004ff32),
   QUICK_PASTE(0x1004ff33),
   PAGE_LEFT(0x1004ff40),
   PAGE_UP(0x1004ff41),
   PAGE_DOWN(0x1004ff42),
   PAGE_RIGHT(0x1004ff43),
   ACTIVATE(0x1004ff44),
   MENU_BAR(0x1004ff45),
   LEFT(0x1004ff51),
   UP(0x1004ff52),
   RIGHT(0x1004ff53),
   DOWN(0x1004ff54),
   END_LINE(0x1004ff57),
   BEGIN_LINE(0x1004ff58),
   END_DATA(0x1004ff59),
   BEGIN_DATA(0x1004ff5a),
   PREV_MENU(0x1004ff5b),
   NEXT_MENU(0x1004ff5c),
   PREV_FIELD(0x1004ff5d),
   NEXT_FIELD(0x1004ff5e),
   SELECT(0x1004ff60),
   INSERT(0x1004ff63),
   UNDO(0x1004ff65),
   MENU(0x1004ff67),
   CANCEL(0x1004ff69),
   HELP(0x1004ff6a),
   SELECTALL(0x1004ff71),
   DESELECTALL(0x1004ff72),
   RESELECT(0x1004ff73),
   EXTEND(0x1004ff74),
   RESTORE(0x1004ff78),
   DELETE(0x1004ffff);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   OSF(int code) {
       this.code = code;
   }
}
