package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.databind.node.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class zzai implements zzaq {
    private final Double zza;

    public zzai(Double d10) {
        if (d10 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        return this.zza.equals(((zzai) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    public final zzaq zza(String str, zzh zzh, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(zzf());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzf(), str}));
    }

    public final zzaq zzc() {
        return new zzai(this.zza);
    }

    public final Boolean zzd() {
        boolean z10;
        if (Double.isNaN(this.zza.doubleValue()) || this.zza.doubleValue() == 0.0d) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final Double zze() {
        return this.zza;
    }

    public final String zzf() {
        BigDecimal bigDecimal;
        int scale;
        if (Double.isNaN(this.zza.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(this.zza.doubleValue())) {
            BigDecimal valueOf = BigDecimal.valueOf(this.zza.doubleValue());
            if (valueOf.signum() == 0) {
                bigDecimal = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                bigDecimal = a.a(valueOf);
            }
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (bigDecimal.scale() > 0) {
                scale = bigDecimal.precision();
            } else {
                scale = bigDecimal.scale();
            }
            decimalFormat.setMinimumFractionDigits(scale - 1);
            String format = decimalFormat.format(bigDecimal);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return bigDecimal.toPlainString();
        } else if (this.zza.doubleValue() > 0.0d) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    public final Iterator<zzaq> zzh() {
        return null;
    }
}
