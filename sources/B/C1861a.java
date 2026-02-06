package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.a  reason: case insensitive filesystem */
public interface C1861a extends IInterface {
    void U(String str, Bundle bundle);

    void b1(int i10, Bundle bundle);

    void j1(String str, Bundle bundle);

    void l1(Bundle bundle);

    void n1(int i10, Uri uri, boolean z10, Bundle bundle);

    Bundle v(String str, Bundle bundle);

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static abstract class C0327a extends Binder implements C1861a {
        public C0327a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                if (r5 == r0) goto L_0x00e0
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 2: goto L_0x00c3;
                    case 3: goto L_0x00a6;
                    case 4: goto L_0x008d;
                    case 5: goto L_0x0070;
                    case 6: goto L_0x003c;
                    case 7: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0028
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0028:
                android.os.Bundle r5 = r4.v(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0038
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x003b
            L_0x0038:
                r7.writeInt(r0)
            L_0x003b:
                return r1
            L_0x003c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0052
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0053
            L_0x0052:
                r8 = r3
            L_0x0053:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005a
                r0 = r1
            L_0x005a:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0069
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r2.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0069:
                r4.n1(r5, r8, r0, r3)
                r7.writeNoException()
                return r1
            L_0x0070:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0086
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0086:
                r4.j1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x009f
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x009f:
                r4.l1(r3)
                r7.writeNoException()
                return r1
            L_0x00a6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00bc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00bc:
                r4.U(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00c3:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d9
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00d9:
                r4.b1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00e0:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.C1861a.C0327a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
