package com.google.android.recaptcha.internal;

import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;

public final class zzph extends zzit implements zzkf {
    /* access modifiers changed from: private */
    public static final zzph zzb;
    private int zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;
    private int zzh;
    private zzot zzi;
    private int zzj;
    private zzoq zzk;

    static {
        zzph zzph = new zzph();
        zzb = zzph;
        zzit.zzD(zzph.class, zzph);
    }

    private zzph() {
    }

    static /* synthetic */ void zzH(zzph zzph, int i10) {
        if (i10 != 1) {
            zzph.zze = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    static /* synthetic */ void zzI(zzph zzph, int i10) {
        if (i10 != 1) {
            zzph.zzg = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzpg zzf() {
        return (zzpg) zzb.zzp();
    }

    /* access modifiers changed from: protected */
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzph();
        } else {
            if (i11 == 4) {
                return new zzpg((zzor) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzj() {
        int i10;
        switch (this.zzg) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            case 13:
                i10 = 15;
                break;
            case StdKeyDeserializer.TYPE_URL:
                i10 = 16;
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                i10 = 17;
                break;
            case 16:
                i10 = 18;
                break;
            case 17:
                i10 = 19;
                break;
            case 18:
                i10 = 20;
                break;
            case 19:
                i10 = 21;
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                i10 = 22;
                break;
            case 21:
                i10 = 23;
                break;
            case 22:
                i10 = 24;
                break;
            case 23:
                i10 = 25;
                break;
            case 24:
                i10 = 26;
                break;
            case 25:
                i10 = 27;
                break;
            case 26:
                i10 = 28;
                break;
            case 27:
                i10 = 29;
                break;
            case 28:
                i10 = 30;
                break;
            case 29:
                i10 = 31;
                break;
            case 30:
                i10 = 32;
                break;
            case 31:
                i10 = 33;
                break;
            case c.f37660h:
                i10 = 34;
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
                i10 = 35;
                break;
            case 34:
                i10 = 36;
                break;
            case 35:
                i10 = 37;
                break;
            case 36:
                i10 = 38;
                break;
            case 37:
                i10 = 39;
                break;
            case 38:
                i10 = 40;
                break;
            case 39:
                i10 = 41;
                break;
            case 40:
                i10 = 42;
                break;
            case 41:
                i10 = 43;
                break;
            case 42:
                i10 = 44;
                break;
            case 43:
                i10 = 45;
                break;
            case Carousel.ENTITY_TYPE /*44*/:
                i10 = 46;
                break;
            case 45:
                i10 = 47;
                break;
            case 46:
                i10 = 48;
                break;
            case 47:
                i10 = 49;
                break;
            case 48:
                i10 = 50;
                break;
            case 49:
                i10 = 51;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzk() {
        int i10;
        switch (this.zze) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
