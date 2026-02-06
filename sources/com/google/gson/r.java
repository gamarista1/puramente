package com.google.gson;

import Pc.B;
import Pc.z;
import java.math.BigDecimal;

public enum r implements s {
    DOUBLE {
        /* renamed from: b */
        public Double a(Sc.a aVar) {
            return Double.valueOf(aVar.f0());
        }
    },
    LAZILY_PARSED_NUMBER {
        public Number a(Sc.a aVar) {
            return new z(aVar.B0());
        }
    },
    LONG_OR_DOUBLE {
        private Number b(String str, Sc.a aVar) {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!aVar.Q()) {
                    throw new Sc.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.F());
                }
                return valueOf;
            } catch (NumberFormatException e10) {
                throw new l("Cannot parse " + str + "; at path " + aVar.F(), e10);
            }
        }

        public Number a(Sc.a aVar) {
            String B02 = aVar.B0();
            if (B02.indexOf(46) >= 0) {
                return b(B02, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(B02));
            } catch (NumberFormatException unused) {
                return b(B02, aVar);
            }
        }
    },
    BIG_DECIMAL {
        /* renamed from: b */
        public BigDecimal a(Sc.a aVar) {
            String B02 = aVar.B0();
            try {
                return B.b(B02);
            } catch (NumberFormatException e10) {
                throw new l("Cannot parse " + B02 + "; at path " + aVar.F(), e10);
            }
        }
    };
}
