package Pa;

import android.os.Bundle;
import android.os.Parcel;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.C4604f;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.List;

public abstract class g extends zzbx implements e {
    public g() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzbw.zzb(parcel);
                c0((D) zzbw.zza(parcel, D.CREATOR), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzbw.zzb(parcel);
                t0((A5) zzbw.zza(parcel, A5.CREATOR), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zzbw.zzb(parcel);
                O0((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                e((D) zzbw.zza(parcel, D.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbw.zzb(parcel);
                f1((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List i02 = i0((E5) zzbw.zza(parcel, E5.CREATOR), zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(i02);
                return true;
            case 9:
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] T10 = T((D) zzbw.zza(parcel, D.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(T10);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                w(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbw.zzb(parcel);
                String F02 = F0((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(F02);
                return true;
            case 12:
                zzbw.zzb(parcel);
                J0((C4604f) zzbw.zza(parcel, C4604f.CREATOR), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzbw.zzb(parcel);
                P0((C4604f) zzbw.zza(parcel, C4604f.CREATOR));
                parcel2.writeNoException();
                return true;
            case StdKeyDeserializer.TYPE_URL:
                zzbw.zzb(parcel);
                List c12 = c1(parcel.readString(), parcel.readString(), zzbw.zzc(parcel), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(c12);
                return true;
            case StdKeyDeserializer.TYPE_CLASS:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List h10 = h(readString7, readString8, readString9, zzc2);
                parcel2.writeNoException();
                parcel2.writeTypedList(h10);
                return true;
            case 16:
                zzbw.zzb(parcel);
                List d10 = d(parcel.readString(), parcel.readString(), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(d10);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzbw.zzb(parcel);
                List x10 = x(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(x10);
                return true;
            case 18:
                zzbw.zzb(parcel);
                q0((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzbw.zzb(parcel);
                z0((Bundle) zzbw.zza(parcel, Bundle.CREATOR), (E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                zzbw.zzb(parcel);
                y0((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                zzbw.zzb(parcel);
                C4378a W10 = W((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                zzbw.zzb(parcel2, W10);
                return true;
            case 24:
                zzbw.zzb(parcel);
                List f02 = f0((E5) zzbw.zza(parcel, E5.CREATOR), (Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f02);
                return true;
            case 25:
                zzbw.zzb(parcel);
                o1((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                zzbw.zzb(parcel);
                A0((E5) zzbw.zza(parcel, E5.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
