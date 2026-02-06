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

/* renamed from: La.g  reason: case insensitive filesystem */
public class C4345g extends C4351j {
    public static final Parcelable.Creator<C4345g> CREATOR = new t0();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f51591a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f51592b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f51593c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f51594d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f51595e;

    C4345g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f51591a = (byte[]) C4536s.l(bArr);
        this.f51592b = (byte[]) C4536s.l(bArr2);
        this.f51593c = (byte[]) C4536s.l(bArr3);
        this.f51594d = (byte[]) C4536s.l(bArr4);
        this.f51595e = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4345g)) {
            return false;
        }
        C4345g gVar = (C4345g) obj;
        if (!Arrays.equals(this.f51591a, gVar.f51591a) || !Arrays.equals(this.f51592b, gVar.f51592b) || !Arrays.equals(this.f51593c, gVar.f51593c) || !Arrays.equals(this.f51594d, gVar.f51594d) || !Arrays.equals(this.f51595e, gVar.f51595e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(Integer.valueOf(Arrays.hashCode(this.f51591a)), Integer.valueOf(Arrays.hashCode(this.f51592b)), Integer.valueOf(Arrays.hashCode(this.f51593c)), Integer.valueOf(Arrays.hashCode(this.f51594d)), Integer.valueOf(Arrays.hashCode(this.f51595e)));
    }

    public byte[] o0() {
        return this.f51593c;
    }

    public byte[] p0() {
        return this.f51592b;
    }

    public byte[] q0() {
        return this.f51591a;
    }

    public byte[] r0() {
        return this.f51594d;
    }

    public byte[] s0() {
        return this.f51595e;
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f51591a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f51592b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f51593c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f51594d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f51595e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, q0(), false);
        c.k(parcel, 3, p0(), false);
        c.k(parcel, 4, o0(), false);
        c.k(parcel, 5, r0(), false);
        c.k(parcel, 6, s0(), false);
        c.b(parcel, a10);
    }
}
