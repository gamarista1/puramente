package K2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.s;
import f2.z;
import i2.L;
import java.util.Arrays;

public final class a implements z.b {
    public static final Parcelable.Creator<a> CREATOR = new C0093a();

    /* renamed from: g  reason: collision with root package name */
    private static final s f4004g = new s.b().o0("application/id3").K();

    /* renamed from: h  reason: collision with root package name */
    private static final s f4005h = new s.b().o0("application/x-scte35").K();

    /* renamed from: a  reason: collision with root package name */
    public final String f4006a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4007b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4008c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4009d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4010e;

    /* renamed from: f  reason: collision with root package name */
    private int f4011f;

    /* renamed from: K2.a$a  reason: collision with other inner class name */
    class C0093a implements Parcelable.Creator {
        C0093a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f4006a = str;
        this.f4007b = str2;
        this.f4008c = j10;
        this.f4009d = j11;
        this.f4010e = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4008c != aVar.f4008c || this.f4009d != aVar.f4009d || !L.c(this.f4006a, aVar.f4006a) || !L.c(this.f4007b, aVar.f4007b) || !Arrays.equals(this.f4010e, aVar.f4010e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        if (this.f4011f == 0) {
            String str = this.f4006a;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f4007b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f4008c;
            long j11 = this.f4009d;
            this.f4011f = ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f4010e);
        }
        return this.f4011f;
    }

    public s m() {
        String str = this.f4006a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f4005h;
            case 1:
            case 2:
                return f4004g;
            default:
                return null;
        }
    }

    public byte[] t() {
        if (m() != null) {
            return this.f4010e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f4006a + ", id=" + this.f4009d + ", durationMs=" + this.f4008c + ", value=" + this.f4007b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4006a);
        parcel.writeString(this.f4007b);
        parcel.writeLong(this.f4008c);
        parcel.writeLong(this.f4009d);
        parcel.writeByteArray(this.f4010e);
    }

    a(Parcel parcel) {
        this.f4006a = (String) L.h(parcel.readString());
        this.f4007b = (String) L.h(parcel.readString());
        this.f4008c = parcel.readLong();
        this.f4009d = parcel.readLong();
        this.f4010e = (byte[]) L.h(parcel.createByteArray());
    }
}
