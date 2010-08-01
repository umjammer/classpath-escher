package gnu.x11.keysym;


/**
 * Greek-specific keyboard symbols. Imported from <code>XK_GREEK</code>
 * section of <code>/usr/include/X11/keysymdef.h</code>. Note that byte 3 =
 * 0x07.
 */
public enum Greek {
   ALPHA_ACCENT(0x7a1),
   EPSILON_ACCENT(0x7a2),
   ETA_ACCENT(0x7a3),
   IOTA_ACCENT(0x7a4),
   IOTA_DIERESIS(0x7a5),
   IOTA_DIAERESIS(0x7a7),
   UPSILON_ACCENT(0x7a8),
   UPSILON_DIERESIS(0x7a9),
   OMEGA_ACCENT(0x7ab),
   ACCENT_DIERESIS(0x7ae),
   HORIZBAR(0x7af),

   ALPHA_ACCENT_SMALL(0x7b1),
   EPSILON_ACCENT_SMALL(0x7b2),
   ETA_ACCENT_SMALL(0x7b3),
   IOTA_ACCENT_SMALL(0x7b4),
   IOTA_DIERESIS_SMALL(0x7b5),
   IOTA_ACCENT_DIERESIS_SMALL(0x7b6),
   OMICRON_ACCENT_SMALL(0x7b7),
   UPSILON_ACCENT_SMALL(0x7b8),
   UPSILON_DIERESIS_SMALL(0x7b9),
   UPSILON_ACCENT_DIERESIS_SMALL(0x7ba),
   OMEGA_ACCENT_SMALL(0x7bb),

   ALPHA(0x7c1),
   BETA(0x7c2),
   GAMMA(0x7c3),
   DELTA(0x7c4),
   EPSILON(0x7c5),
   ZETA(0x7c6),
   ETA(0x7c7),
   THETA(0x7c8),
   IOTA(0x7c9),
   KAPPA(0x7ca),
   LAMDA(0x7cb),
   LAMBDA(0x7cb),
   MU(0x7cc),
   NU(0x7cd),
   XI(0x7ce),
   OMICRON(0x7cf),
   PI(0x7d0),
   RHO(0x7d1),
   SIGMA(0x7d2),
   TAU(0x7d4),
   UPSILON(0x7d5),
   PHI(0x7d6),
   CHI(0x7d7),
   PSI(0x7d8),
   OMEGA(0x7d9),

   ALPHA_SMALL(0x7e1),
   BETA_SMALL(0x7e2),
   GAMMA_SMALL(0x7e3),
   DELTA_SMALL(0x7e4),
   EPSILON_SMALL(0x7e5),
   ZETA_SMALL(0x7e6),
   ETA_SMALL(0x7e7),
   THETA_SMALL(0x7e8),
   IOTA_SMALL(0x7e9),
   KAPPA_SMALL(0x7ea),
   LAMDA_SMALL(0x7eb),
   LAMBDA_SMALL(0x7eb),
   MU_SMALL(0x7ec),
   NU_SMALL(0x7ed),
   XI_SMALL(0x7ee),
   OMICRON_SMALL(0x7ef),
   PI_SMALL(0x7f0),
   RHO_SMALL(0x7f1),
   SIGMA_SMALL(0x7f2),
   FINAL_SIGMA_SMALL(0x7f3),
   TAU_SMALL(0x7f4),
   UPSILON_SMALL(0x7f5),
   PHI_SMALL(0x7f6),
   CHI_SMALL(0x7f7),
   PSI_SMALL(0x7f8),
   OMEGA_SMALL(0x7f9),

   SWITCH(0xff7e); /* alias for mode_switch */
   
   
   private int code;
   
   public int getCode() {
       return this.code;
   }
   
   Greek(int code) {
       this.code = code;
   }
}
