package gnu.x11.keysym;


/**
 * Georgian-specific keyboard symbols. Imported from
 * <code>XK_GEORGIAN</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x15.
 */
public enum Georgian {
   AN(0x15d0),
   BAN(0x15d1),
   GAN(0x15d2),
   DON(0x15d3),
   EN(0x15d4),
   VIN(0x15d5),
   ZEN(0x15d6),
   TAN(0x15d7),
   IN(0x15d8),
   KAN(0x15d9),
   LAS(0x15da),
   MAN(0x15db),
   NAR(0x15dc),
   ON(0x15dd),
   PAR(0x15de),
   ZHAR(0x15df),
   RAE(0x15e0),
   SAN(0x15e1),
   TAR(0x15e2),
   UN(0x15e3),
   PHAR(0x15e4),
   KHAR(0x15e5),
   GHAN(0x15e6),
   QAR(0x15e7),
   SHIN(0x15e8),
   CHIN(0x15e9),
   CAN(0x15ea),
   JIL(0x15eb),
   CIL(0x15ec),
   CHAR(0x15ed),
   XAN(0x15ee),
   JHAN(0x15ef),
   HAE(0x15f0),
   HE(0x15f1),
   HIE(0x15f2),
   WE(0x15f3),
   HAR(0x15f4),
   HOE(0x15f5),
   FI(0x15f6);
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Georgian(int code) {
       this.code = code;
   }
}
