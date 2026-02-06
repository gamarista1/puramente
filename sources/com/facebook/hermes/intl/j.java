package com.facebook.hermes.intl;

import M6.b;
import M6.d;
import M6.e;
import M6.g;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import com.facebook.hermes.intl.c;
import io.intercom.android.sdk.models.AttributeType;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private Format f39719a;

    /* renamed from: b  reason: collision with root package name */
    private NumberFormat f39720b;

    /* renamed from: c  reason: collision with root package name */
    private g f39721c;

    /* renamed from: d  reason: collision with root package name */
    private c.h f39722d;

    /* renamed from: e  reason: collision with root package name */
    private MeasureUnit f39723e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39724a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.hermes.intl.c$g[] r0 = com.facebook.hermes.intl.c.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39724a = r0
                com.facebook.hermes.intl.c$g r1 = com.facebook.hermes.intl.c.g.NEVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39724a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.c$g r1 = com.facebook.hermes.intl.c.g.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39724a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.c$g r1 = com.facebook.hermes.intl.c.g.EXCEPTZERO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.j.a.<clinit>():void");
        }
    }

    j() {
    }

    public static int n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new e("Invalid currency code !");
        }
    }

    private void o(NumberFormat numberFormat, b bVar, c.h hVar) {
        this.f39720b = numberFormat;
        this.f39719a = numberFormat;
        this.f39721c = (g) bVar;
        this.f39722d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) {
        for (MeasureUnit next : MeasureUnit.getAvailable()) {
            if (!next.getSubtype().equals(str)) {
                String subtype = next.getSubtype();
                if (subtype.equals(next.getType() + "-" + str)) {
                }
            }
            return next;
        }
        throw new e("Unknown unit: " + str);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.text.AttributedCharacterIterator a(double r6) {
        /*
            r5 = this;
            java.lang.String r0 = "en"
            java.text.Format r1 = r5.f39719a     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            boolean r2 = r1 instanceof android.icu.text.MeasureFormat     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            if (r2 == 0) goto L_0x001c
            android.icu.util.MeasureUnit r2 = r5.f39723e     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            if (r2 == 0) goto L_0x001c
            android.icu.util.Measure r2 = new android.icu.util.Measure     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            java.lang.Double r3 = java.lang.Double.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            android.icu.util.MeasureUnit r4 = r5.f39723e     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            r2.<init>(r3, r4)     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            java.text.AttributedCharacterIterator r6 = r1.formatToCharacterIterator(r2)     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            goto L_0x0024
        L_0x001c:
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
            java.text.AttributedCharacterIterator r6 = r1.formatToCharacterIterator(r2)     // Catch:{ NumberFormatException -> 0x0036, Exception -> 0x0025 }
        L_0x0024:
            return r6
        L_0x0025:
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLanguageTag(r0)
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.text.AttributedCharacterIterator r6 = r0.formatToCharacterIterator(r6)
            return r6
        L_0x0036:
            android.icu.util.ULocale r1 = android.icu.util.ULocale.getDefault()     // Catch:{ RuntimeException -> 0x0047 }
            android.icu.text.NumberFormat r1 = android.icu.text.NumberFormat.getInstance(r1)     // Catch:{ RuntimeException -> 0x0047 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ RuntimeException -> 0x0047 }
            java.text.AttributedCharacterIterator r6 = r1.formatToCharacterIterator(r2)     // Catch:{ RuntimeException -> 0x0047 }
            return r6
        L_0x0047:
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLanguageTag(r0)
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.text.AttributedCharacterIterator r6 = r0.formatToCharacterIterator(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.j.a(double):java.text.AttributedCharacterIterator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.forLanguageTag("en")).format(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        return android.icu.text.NumberFormat.getInstance(android.icu.util.ULocale.getDefault()).format(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(double r5) {
        /*
            r4 = this;
            java.text.Format r0 = r4.f39719a     // Catch:{ NumberFormatException -> 0x0023 }
            boolean r1 = r0 instanceof android.icu.text.MeasureFormat     // Catch:{ NumberFormatException -> 0x0023 }
            if (r1 == 0) goto L_0x001a
            android.icu.util.MeasureUnit r1 = r4.f39723e     // Catch:{ NumberFormatException -> 0x0023 }
            if (r1 == 0) goto L_0x001a
            android.icu.util.Measure r1 = new android.icu.util.Measure     // Catch:{ NumberFormatException -> 0x0023 }
            java.lang.Double r2 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0023 }
            android.icu.util.MeasureUnit r3 = r4.f39723e     // Catch:{ NumberFormatException -> 0x0023 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x0023 }
            java.lang.String r5 = r0.format(r1)     // Catch:{ NumberFormatException -> 0x0023 }
            goto L_0x0022
        L_0x001a:
            java.lang.Double r1 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0023 }
            java.lang.String r5 = r0.format(r1)     // Catch:{ NumberFormatException -> 0x0023 }
        L_0x0022:
            return r5
        L_0x0023:
            android.icu.util.ULocale r0 = android.icu.util.ULocale.getDefault()     // Catch:{ RuntimeException -> 0x0030 }
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)     // Catch:{ RuntimeException -> 0x0030 }
            java.lang.String r5 = r0.format(r5)     // Catch:{ RuntimeException -> 0x0030 }
            return r5
        L_0x0030:
            java.lang.String r0 = "en"
            android.icu.util.ULocale r0 = android.icu.util.ULocale.forLanguageTag(r0)
            android.icu.text.NumberFormat r0 = android.icu.text.NumberFormat.getInstance(r0)
            java.lang.String r5 = r0.format(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.j.b(double):java.lang.String");
    }

    public String c(b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    public String l(AttributedCharacterIterator.Attribute attribute, double d10) {
        if (attribute == NumberFormat.Field.SIGN) {
            if (Double.compare(d10, 0.0d) >= 0) {
                return "plusSign";
            }
            return "minusSign";
        } else if (attribute == NumberFormat.Field.INTEGER) {
            if (Double.isNaN(d10)) {
                return "nan";
            }
            if (Double.isInfinite(d10)) {
                return "infinity";
            }
            return AttributeType.INTEGER;
        } else if (attribute == NumberFormat.Field.FRACTION) {
            return "fraction";
        } else {
            if (attribute == NumberFormat.Field.EXPONENT) {
                return "exponentInteger";
            }
            if (attribute == NumberFormat.Field.EXPONENT_SIGN) {
                return "exponentMinusSign";
            }
            if (attribute == NumberFormat.Field.EXPONENT_SYMBOL) {
                return "exponentSeparator";
            }
            if (attribute == NumberFormat.Field.DECIMAL_SEPARATOR) {
                return "decimal";
            }
            if (attribute == NumberFormat.Field.GROUPING_SEPARATOR) {
                return "group";
            }
            if (attribute == NumberFormat.Field.PERCENT) {
                return "percentSign";
            }
            if (attribute == NumberFormat.Field.PERMILLE) {
                return "permilleSign";
            }
            if (attribute == NumberFormat.Field.CURRENCY) {
                return com.amazon.a.a.o.b.f37469a;
            }
            if (attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
                return "compact";
            }
            return "literal";
        }
    }

    /* renamed from: m */
    public j d(b bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) {
        CompactDecimalFormat.CompactStyle compactStyle;
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(d.h(str)) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(d.h(str));
                    bVar.f("nu", arrayList);
                } else {
                    throw new e("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new e("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            if (bVar2 == c.b.SHORT) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            o(CompactDecimalFormat.getInstance((ULocale) bVar.h(), compactStyle), bVar, hVar);
        } else {
            NumberFormat instance = NumberFormat.getInstance((ULocale) bVar.h(), hVar.b(eVar, dVar));
            if (eVar == c.e.ENGINEERING) {
                instance.setMaximumIntegerDigits(3);
            }
            o(instance, bVar, hVar);
        }
        return this;
    }

    /* renamed from: q */
    public j e(String str, c.C0627c cVar) {
        if (this.f39722d == c.h.CURRENCY) {
            Currency instance = Currency.getInstance(str);
            this.f39720b.setCurrency(instance);
            if (cVar != c.C0627c.CODE) {
                str = instance.getName(this.f39721c.h(), cVar.b(), (boolean[]) null);
            }
            NumberFormat numberFormat = this.f39720b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    /* renamed from: r */
    public j i(c.f fVar, int i10, int i11) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f39720b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f39720b.setMaximumFractionDigits(i11);
            }
            NumberFormat numberFormat = this.f39720b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    /* renamed from: s */
    public j h(boolean z10) {
        this.f39720b.setGroupingUsed(z10);
        return this;
    }

    /* renamed from: t */
    public j g(int i10) {
        if (i10 != -1) {
            this.f39720b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    /* renamed from: u */
    public j k(c.g gVar) {
        NumberFormat numberFormat = this.f39720b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if (Build.VERSION.SDK_INT >= 31) {
                int i10 = a.f39724a[gVar.ordinal()];
                if (i10 == 1) {
                    decimalFormat.setSignAlwaysShown(false);
                } else if (i10 == 2 || i10 == 3) {
                    decimalFormat.setSignAlwaysShown(true);
                }
            } else {
                int i11 = a.f39724a[gVar.ordinal()];
                if (i11 == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                } else if (i11 == 2 || i11 == 3) {
                    if (!decimalFormat.getNegativePrefix().isEmpty()) {
                        decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                    if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                        decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                }
            }
        }
        return this;
    }

    /* renamed from: v */
    public j f(c.f fVar, int i10, int i11) {
        NumberFormat numberFormat = this.f39720b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 >= decimalFormat.getMinimumSignificantDigits()) {
                    decimalFormat.setMaximumSignificantDigits(i11);
                } else {
                    throw new e("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    /* renamed from: w */
    public j j(String str, c.i iVar) {
        if (this.f39722d == c.h.UNIT) {
            this.f39723e = p(str);
            this.f39719a = MeasureFormat.getInstance(this.f39721c.h(), iVar.b(), this.f39720b);
        }
        return this;
    }
}
