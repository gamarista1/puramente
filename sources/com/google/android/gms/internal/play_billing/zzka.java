package com.google.android.gms.internal.play_billing;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

final class zzka implements zzhm {
    static final zzhm zza = new zzka();

    private zzka() {
    }

    public final boolean zza(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
