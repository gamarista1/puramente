package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.List;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        private static class C0205a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f10735a;

            C0205a(IBinder iBinder) {
                this.f10735a = iBinder;
            }

            public boolean O(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z10 = false;
                    C0206b.f(obtain, keyEvent, 0);
                    this.f10735a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10735a;
            }

            public MediaMetadataCompat getMetadata() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f10735a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return (MediaMetadataCompat) C0206b.d(obtain2, MediaMetadataCompat.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void p0(a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface(aVar);
                    this.f10735a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f10735a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0205a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            boolean z10 = false;
            switch (i10) {
                case 1:
                    b0(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) C0206b.d(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 2:
                    boolean O10 = O((KeyEvent) C0206b.d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(O10 ? 1 : 0);
                    break;
                case 3:
                    p0(a.C0203a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 4:
                    H0(a.C0203a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 5:
                    boolean v02 = v0();
                    parcel2.writeNoException();
                    parcel2.writeInt(v02 ? 1 : 0);
                    break;
                case 6:
                    String l02 = l0();
                    parcel2.writeNoException();
                    parcel2.writeString(l02);
                    break;
                case 7:
                    String m10 = m();
                    parcel2.writeNoException();
                    parcel2.writeString(m10);
                    break;
                case 8:
                    PendingIntent H10 = H();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, H10, 1);
                    break;
                case 9:
                    long D10 = D();
                    parcel2.writeNoException();
                    parcel2.writeLong(D10);
                    break;
                case 10:
                    ParcelableVolumeInfo i12 = i1();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, i12, 1);
                    break;
                case 11:
                    U0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 12:
                    s0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 13:
                    l();
                    parcel2.writeNoException();
                    break;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    L(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                    M(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 16:
                    N((Uri) C0206b.d(parcel, Uri.CREATOR), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 17:
                    g0(parcel.readLong());
                    parcel2.writeNoException();
                    break;
                case 18:
                    pause();
                    parcel2.writeNoException();
                    break;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    next();
                    parcel2.writeNoException();
                    break;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    break;
                case 22:
                    L0();
                    parcel2.writeNoException();
                    break;
                case 23:
                    o();
                    parcel2.writeNoException();
                    break;
                case 24:
                    y(parcel.readLong());
                    parcel2.writeNoException();
                    break;
                case 25:
                    r0((RatingCompat) C0206b.d(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    E(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 27:
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, metadata, 1);
                    break;
                case 28:
                    PlaybackStateCompat k10 = k();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, k10, 1);
                    break;
                case 29:
                    List d12 = d1();
                    parcel2.writeNoException();
                    C0206b.e(parcel2, d12, 1);
                    break;
                case 30:
                    CharSequence E02 = E0();
                    parcel2.writeNoException();
                    if (E02 == null) {
                        parcel2.writeInt(0);
                        break;
                    } else {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(E02, parcel2, 1);
                        break;
                    }
                case 31:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, extras, 1);
                    break;
                case c.f37660h /*32*/:
                    int I10 = I();
                    parcel2.writeNoException();
                    parcel2.writeInt(I10);
                    break;
                case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                    j();
                    parcel2.writeNoException();
                    break;
                case 34:
                    J(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 35:
                    x0(parcel.readString(), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 36:
                    G((Uri) C0206b.d(parcel, Uri.CREATOR), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 37:
                    int n10 = n();
                    parcel2.writeNoException();
                    parcel2.writeInt(n10);
                    break;
                case 38:
                    boolean F10 = F();
                    parcel2.writeNoException();
                    parcel2.writeInt(F10 ? 1 : 0);
                    break;
                case 39:
                    C(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 40:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    h0(z10);
                    parcel2.writeNoException();
                    break;
                case 41:
                    w0((MediaDescriptionCompat) C0206b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 42:
                    R((MediaDescriptionCompat) C0206b.d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 43:
                    u0((MediaDescriptionCompat) C0206b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    break;
                case Carousel.ENTITY_TYPE /*44*/:
                    X(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 45:
                    boolean Y10 = Y();
                    parcel2.writeNoException();
                    parcel2.writeInt(Y10 ? 1 : 0);
                    break;
                case 46:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    W0(z10);
                    parcel2.writeNoException();
                    break;
                case 47:
                    int V10 = V();
                    parcel2.writeNoException();
                    parcel2.writeInt(V10);
                    break;
                case 48:
                    k0(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 49:
                    z(parcel.readFloat());
                    parcel2.writeNoException();
                    break;
                case 50:
                    Bundle K10 = K();
                    parcel2.writeNoException();
                    C0206b.f(parcel2, K10, 1);
                    break;
                case 51:
                    P((RatingCompat) C0206b.d(parcel, RatingCompat.CREATOR), (Bundle) C0206b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    /* renamed from: android.support.v4.media.session.b$b  reason: collision with other inner class name */
    public static class C0206b {
        /* access modifiers changed from: private */
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static void e(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* access modifiers changed from: private */
        public static void f(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void C(int i10);

    long D();

    void E(String str, Bundle bundle);

    CharSequence E0();

    boolean F();

    void G(Uri uri, Bundle bundle);

    PendingIntent H();

    void H0(a aVar);

    int I();

    void J(String str, Bundle bundle);

    Bundle K();

    void L(String str, Bundle bundle);

    void L0();

    void M(String str, Bundle bundle);

    void N(Uri uri, Bundle bundle);

    boolean O(KeyEvent keyEvent);

    void P(RatingCompat ratingCompat, Bundle bundle);

    void R(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void U0(int i10, int i11, String str);

    int V();

    void W0(boolean z10);

    void X(int i10);

    boolean Y();

    void b0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    List d1();

    void g0(long j10);

    Bundle getExtras();

    MediaMetadataCompat getMetadata();

    void h0(boolean z10);

    ParcelableVolumeInfo i1();

    void j();

    PlaybackStateCompat k();

    void k0(int i10);

    void l();

    String l0();

    String m();

    int n();

    void next();

    void o();

    void p0(a aVar);

    void pause();

    void previous();

    void r0(RatingCompat ratingCompat);

    void s0(int i10, int i11, String str);

    void stop();

    void u0(MediaDescriptionCompat mediaDescriptionCompat);

    boolean v0();

    void w0(MediaDescriptionCompat mediaDescriptionCompat);

    void x0(String str, Bundle bundle);

    void y(long j10);

    void z(float f10);
}
