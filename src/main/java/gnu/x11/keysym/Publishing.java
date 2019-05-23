package gnu.x11.keysym;


/**
 * Publishing-specific keyboard symbols. Imported from
 * <code>XK_PUBLISHING</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x0a. 
 */
public enum Publishing {
   EMSPACE(0xaa1),
   ENSPACE(0xaa2),
   EM3SPACE(0xaa3),
   EM4SPACE(0xaa4),
   DIGIT_SPACE(0xaa5),
   PUNCT_SPACE(0xaa6),
   THIN_SPACE(0xaa7),
   HAIR_SPACE(0xaa8),
   EMDASH(0xaa9),
   ENDASH(0xaaa),
   SIGN_IF_BLANK(0xaac),
   ELLIPSIS(0xaae),
   DOUB_BASE_LINE_DOT(0xaaf),
   ONE_THIRD(0xab0),
   TWO_THIRDS(0xab1),
   ONE_FIFTH(0xab2),
   TWO_FIFTHS(0xab3),
   THREE_FIFTHS(0xab4),
   FOUR_FIFTHS(0xab5),
   ONE_SIXTH(0xab6),
   FIVE_SIXTHS(0xab7),
   CARE_OF(0xab8),
   FIG_DASH(0xabb),
   LEFT_ANGLE_BRACKET(0xabc),
   DECIMAL_POINT(0xabd),
   RIGH_TANGLE_BRACKET(0xabe),
   MARKER(0xabf),
   ONE_EIGHTH(0xac3),
   THREE_EIGHTHS(0xac4),
   FIVE_EIGHTHS(0xac5),
   SEVEN_EIGHTHS(0xac6),
   TRADEMARK(0xac9),
   SIGNATURE_MARK(0xaca),
   TRADEMARK_IN_CIRCLE(0xacb),
   LEFT_OPEN_TRIANGLE(0xacc),
   RIGHT_OPEN_TRIANGLE(0xacd),
   EM_OPEN_CIRCLE(0xace),
   EM_OPEN_RECTANGLE(0xacf),
   LEFT_SINGLE_QUOTE_MARK(0xad0),
   RIGHT_SINGLE_QUOTE_MARK(0xad1),
   LEFT_DOUBLE_QUOTE_MARK(0xad2),
   RIGHT_DOUBLE_QUOTE_MARK(0xad3),
   PRESCRIPTION(0xad4),
   MINUTES(0xad6),
   SECONDS(0xad7),
   LATIN_CROSS(0xad9),
   HEXAGRAM(0xada),
   FILLED_RECT_BULLET(0xadb),
   FILLED_LEFT_TRI_BULLET(0xadc),
   FILLED_RIGHT_TRI_BULLET(0xadd),
   EM_FILLED_CIRCLE(0xade),
   EM_FILLED_RECT(0xadf),
   EN_OPEN_CIRC_BULLET(0xae0),
   EN_OPEN_SQUARE_BULLET(0xae1),
   OPEN_RECT_BULLET(0xae2),
   OPEN_TRI_BULLET_UP(0xae3),
   OPEN_TRI_BULLET_DOWN(0xae4),
   OPEN_STAR(0xae5),
   EN_FILLED_CIRC_BULLET(0xae6),
   EN_FILLED_SQ_BULLET(0xae7),
   FILLED_TRI_BULLET_UP(0xae8),
   FILLED_TRI_BULLET_DOWN(0xae9),
   LEFT_POINTER(0xaea),
   RIGHT_POINTER(0xaeb),
   CLUB(0xaec),
   DIAMOND(0xaed),
   HEART(0xaee),
   MALTESE_CROSS(0xaf0),
   DAGGER(0xaf1),
   DOUBLE_DAGGER(0xaf2),
   CHECKMARK(0xaf3),
   BALLOT_CROSS(0xaf4),
   MUSICAL_SHARP(0xaf5),
   MUSICAL_FLAT(0xaf6),
   MALE_SYMBOL(0xaf7),
   FEMALE_SYMBOL(0xaf8),
   TELEPHONE(0xaf9),
   TELEPHONE_RECORDER(0xafa),
   PHONOGRAPH_COPYRIGHT(0xafb),
   CARET(0xafc),
   SINGLE_LOW_QUOTE_MARK(0xafd),
   DOUBLE_LOW_QUOTE_MARK(0xafe),
   CURSOR(0xaff);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Publishing(int code) {
       this.code = code;
   }
}
