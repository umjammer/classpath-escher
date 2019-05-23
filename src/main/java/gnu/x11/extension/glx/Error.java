package gnu.x11.extension.glx;


/** GLX Error. */
public class Error extends gnu.x11.Error {

  public enum GlxError {
      BAD_CONTEXT(0) {
        @Override 
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_CONTEXT: parameter not a GLX rendering context";
        }
      },
      
      BAD_CONTEXT_STATE(1) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_CONTEXT_STATE: state of" +
            		" GLX rendering context inconsistent";
        }
      },
      
      BAD_DRAWABLE(2) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_DRAWABLE: parameter" +
            		" not a GLX drawable";
        }
      },
      
      BAD_PIXMAP(3) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_PIXMAP: parameter not" +
            		" a GLX pixmap";
        }
      },
      
      BAD_CONTEXT_TAG(4) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_CONTEXT_TAG: tag of GLX" +
            		" rendering context invalid";
        }
      },
      
      BAD_CURRENT_WINDOW(5) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_CURRENT_WINDOW: current " +
            		"GLX window invalid";
        }
      },
      
      BAD_RENDER_REQUEST(6) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_RENDER_REQUEST: parameter" +
            		" of GLX rendering request invalid";
        }
      },
    
      BAD_LARGE_REQUEST(7) {

        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_LARGE_REQUEST: series of" +
            		" GLX large requests incomplete or invalid";
        }
      },
    
      BAD_PRIVATE_REQUEST(8) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_PRIVATE_REQUEST: bad " +
            		"GLX private request code";
        }
      },
      
      BAD_FB_CONFIG(9) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_FB_CONFIG: parameter not" +
            		" a GLX frame-buffer config";
        }
      },
      
      BAD_PBUFFER(10) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_PBUFFER: parameter not " +
            		"a GLX pbuffer";
        }
      },
      
      BAD_CURRENT_DRAWABLE(11) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_CURRENT_DRAWABLE: current" +
            		" GLX drawable invalid";
        }
      },
    
      BAD_WINDOW(12) {
        @Override
        public String toString() {
            return "\n  code: " + this.code + "BAD_GLX_WINDOW: parameter not a" +
            		" GLX window";
        }
      };
      
      protected int code;
      
      GlxError(int code) {
          this.code = code;
      }
      
      public int getCode() {
          return code;
      }
      
      public abstract String toString();
  }



  public Error (gnu.x11.Display display, int code, int seqNumber, int bad,
                int minorOpcode, int majorOpcode) {
      super(display, GlxError.values()[code].toString(), code, seqNumber, bad,
            GlxError.values()[code].toString(), minorOpcode, majorOpcode);
  }
}
