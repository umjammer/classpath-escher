package gnu.x11.keysym;


/**
 * Thai-specific keyboard symbols. Imported from
 * <code>XK_THAI</code> section of
 * <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3(0x0d. 
 */
public enum Thai {
   KOKAI(0xda1),
   KHOKHAI(0xda2),
   KHOKHUAT(0xda3),
   KHOKHWAI(0xda4),
   KHOKHON(0xda5),
   KHORAKHANG(0xda6),  
   NGONGU(0xda7),  
   CHOCHAN(0xda8),  
   CHOCHING(0xda9),   
   CHOCHANG(0xdaa),  
   SOSO(0xdab),
   CHOCHOE(0xdac),
   YOYING(0xdad),
   DOCHADA(0xdae),
   TOPATAK(0xdaf),
   THOTHAN(0xdb0),
   THONANGMONTHO(0xdb1),
   THOPHUTHAO(0xdb2),
   NONEN(0xdb3),
   DODEK(0xdb4),
   TOTAO(0xdb5),
   THOTHUNG(0xdb6),
   THOTHAHAN(0xdb7),
   THOTHONG(0xdb8),
   NONU(0xdb9),
   BOBAIMAI(0xdba),
   POPLA(0xdbb),
   PHOPHUNG(0xdbc),
   FOFA(0xdbd),
   PHOPHAN(0xdbe),
   FOFAN(0xdbf),
   PHOSAMPHAO(0xdc0),
   MOMA(0xdc1),
   YOYAK(0xdc2),
   RORUA(0xdc3),
   RU(0xdc4),
   LOLING(0xdc5),
   LU(0xdc6),
   WOWAEN(0xdc7),
   SOSALA(0xdc8),
   SORUSI(0xdc9),
   SOSUA(0xdca),
   HOHIP(0xdcb),
   LOCHULA(0xdcc),
   OANG(0xdcd),
   HONOKHUK(0xdce),
   PAIYANNOI(0xdcf),
   SARAA(0xdd0),
   MAIHANAKAT(0xdd1),
   SARAAA(0xdd2),
   SARAAM(0xdd3),
   SARAI(0xdd4),   
   SARAII(0xdd5),   
   SARAUE(0xdd6),    
   SARAUEE(0xdd7),    
   SARAU(0xdd8),    
   SARAUU(0xdd9),   
   PHINTHU(0xdda),
   MAIHANAKAT_MAITHO(0xdde),
   BAHT(0xddf),
   SARAE(0xde0),    
   SARAAE(0xde1),
   SARAO(0xde2),
   SARAAIMAIMUAN(0xde3),   
   SARAAIMAIMALAI(0xde4),  
   LAKKHANGYAO(0xde5),
   MAIYAMOK(0xde6),
   MAITAIKHU(0xde7),
   MAIEK(0xde8),   
   MAITHO(0xde9),
   MAITRI(0xdea),
   MAICHATTAWA(0xdeb),
   THANTHAKHAT(0xdec),
   NIKHAHIT(0xded),
   LEKSUN(0xdf0), 
   LEKNUNG(0xdf1),  
   LEKSONG(0xdf2), 
   LEKSAM(0xdf3),
   LEKSI(0xdf4),  
   LEKHA(0xdf5),  
   LEKHOK(0xdf6),  
   LEKCHET(0xdf7),  
   LEKPAET(0xdf8),  
   LEKKAO(0xdf9);
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Thai(int code) {
       this.code = code;
   }
}
