package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
import za.c;

/* renamed from: La.h  reason: case insensitive filesystem */
public class C4347h extends C4351j {
    public static final Parcelable.Creator<C4347h> CREATOR = new u0();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51596a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51597b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51598c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f51599d;

    C4347h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f51596a = (byte[]) C4536s.l(bArr);
        this.f51597b = (byte[]) C4536s.l(bArr2);
        this.f51598c = (byte[]) C4536s.l(bArr3);
        this.f51599d = (String[]) C4536s.l(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4347h)) {
            return false;
        }
        C4347h hVar = (C4347h) obj;
        if (!Arrays.equals(this.f51596a, hVar.f51596a) || !Arrays.equals(this.f51597b, hVar.f51597b) || !Arrays.equals(this.f51598c, hVar.f51598c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(Arrays.hashCode(this.f51596a)), Integer.valueOf(Arrays.hashCode(this.f51597b)), Integer.valueOf(Arrays.hashCode(this.f51598c)));
    }

    public byte[] o0() {
        return this.f51598c;
    }

    public byte[] p0() {
        return this.f51597b;
    }

    public byte[] q0() {
        return this.f51596a;
    }

    public String[] r0() {
        return this.f51599d;
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f51596a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f51597b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f51598c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f51599d));
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, q0(), false);
        c.k(parcel, 3, p0(), false);
        c.k(parcel, 4, o0(), false);
        c.E(parcel, 5, r0(), false);
        c.b(parcel, a10);
    }
}
