package gnu.x11.keysym;


/**
 * Technical-specific keyboard symbols. Imported from
 * <code>XK_TECHNICAL</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x08. 
 */
public enum Technical {
   LEFT_RADICAL(0x8a1),
   TOP_LEFT_RADICAL(0x8a2),
   HORIZ_CONNECTOR(0x8a3),
   TOP_INTEGRAL(0x8a4),
   BOT_INTEGRAL(0x8a5),
   VERT_CONNECTOR(0x8a6),
   TOP_LEFT_SQ_BRACKET(0x8a7),
   BOT_LEFT_SQ_BRACKET(0x8a8),
   TOP_RIGHT_SQ_BRACKET(0x8a9),
   BOT_RIGHT_SQ_BRACKET(0x8aa),
   TOP_LEFT_PARENS(0x8ab),
   BOT_LEFT_PARENS(0x8ac),
   TOP_RIGHT_PARENS(0x8ad),
   BOT_RIGHT_PARENS(0x8ae),
   LEFT_MIDDLE_CURLYBRACE(0x8af),
   RIGHT_MIDDLE_CURLYBRACE(0x8b0),
   TOP_LEFT_SUMMATION(0x8b1),
   BOT_LEFT_SUMMATION(0x8b2),
   TOP_VERT_SUMMATION_CONNECTOR(0x8b3),
   BOT_VERT_SUMMATION_CONNECTOR(0x8b4),
   TOP_RIGHT_SUMMATION(0x8b5),
   BOT_RIGHT_SUMMATION(0x8b6),
   RIGHT_MIDDLE_SUMMATION(0x8b7),
   LESS_THAN_EQUAL(0x8bc),
   NOT_EQUAL(0x8bd),
   GREATER_THAN_EQUAL(0x8be),
   INTEGRAL(0x8bf),
   THEREFORE(0x8c0),
   VARIATION(0x8c1),
   INFINITY(0x8c2),
   NABLA(0x8c5),
   APPROXIMATE(0x8c8),
   SIMILAR_EQUAL(0x8c9),
   IF_ONLY_IF(0x8cd),
   IMPLIES(0x8ce),
   IDENTICAL(0x8cf),
   RADICAL(0x8d6),
   INCLUDED_IN(0x8da),
   INCLUDES(0x8db),
   INTERSECTION(0x8dc),
   UNION(0x8dd),
   LOGICAL_AND(0x8de),
   LOGICAL_OR(0x8df),
   PARTIAL_DERIVATIVE(0x8ef),
   FUNCTION(0x8f6),
   LEFT_ARROW(0x8fb),
   UP_ARROW(0x8fc),
   RIGHT_ARROW(0x8fd),
   DOWN_ARROW(0x8fe);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Technical(int code) {
       this.code = code;
   }
}
