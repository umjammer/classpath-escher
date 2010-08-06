/**
 * 
 */
package gnu.x11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Interface implement by the various X11 command enums.
 * 
 * @author Mario Torre <neugens@aicas.com>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface X11Command {

    /**
     * The opcode of this X11Command.
     */
    int opcode();
    
    /**
     * The base length of this X11Command.
     * Some X11 commands can have a variable command length, so the final length
     * is the sum of the value returned by this method and the additional
     * data that the command send.
     */
    int length() default 0;
}
