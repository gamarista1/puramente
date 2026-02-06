package F9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;
import k9.C3717q0;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0510a();

    /* renamed from: g  reason: collision with root package name */
    private static final C3717q0 f30800g = new C3717q0.b().e0("application/id3").E();

    /* renamed from: h  reason: collision with root package name */
    private static final C3717q0 f30801h = new C3717q0.b().e0("application/x-scte35").E();

    /* renamed from: a  reason: collision with root package name */
    public final String f30802a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30803b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30804c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30805d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f30806e;

    /* renamed from: f  reason: collision with root package name */
    private int f30807f;

    /* renamed from: F9.a$a  reason: collision with other inner class name */
    class C0510a implements Parcelable.Creator {
        C0510a() {
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
        this.f30802a = str;
        this.f30803b = str2;
        this.f30804c = j10;
        this.f30805d = j11;
        this.f30806e = bArr;
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
        if (this.f30804c != aVar.f30804c || this.f30805d != aVar.f30805d || !M.c(this.f30802a, aVar.f30802a) || !M.c(this.f30803b, aVar.f30803b) || !Arrays.equals(this.f30806e, aVar.f30806e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        if (this.f30807f == 0) {
            String str = this.f30802a;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f30803b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f30804c;
            long j11 = this.f30805d;
            this.f30807f = ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f30806e);
        }
        return this.f30807f;
    }

    public C3717q0 m() {
        String str = this.f30802a;
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
                return f30801h;
            case 1:
            case 2:
                return f30800g;
            default:
                return null;
        }
    }

    public byte[] t() {
        if (m() != null) {
            return this.f30806e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f30802a + ", id=" + this.f30805d + ", durationMs=" + this.f30804c + ", value=" + this.f30803b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30802a);
        parcel.writeString(this.f30803b);
        parcel.writeLong(this.f30804c);
        parcel.writeLong(this.f30805d);
        parcel.writeByteArray(this.f30806e);
    }

    a(Parcel parcel) {
        this.f30802a = (String) M.j(parcel.readString());
        this.f30803b = (String) M.j(parcel.readString());
        this.f30804c = parcel.readLong();
        this.f30805d = parcel.readLong();
        this.f30806e = (byte[]) M.j(parcel.createByteArray());
    }
}
