package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    public static abstract class C0203a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        private static class C0204a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f10734a;

            C0204a(IBinder iBinder) {
                this.f10734a = iBinder;
            }

            public void Q() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f10734a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void S(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.d(obtain, mediaMetadataCompat, 0);
                    this.f10734a.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f10734a;
            }

            public void o0(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.d(obtain, parcelableVolumeInfo, 0);
                    this.f10734a.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void p1(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.d(obtain, playbackStateCompat, 0);
                    this.f10734a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0203a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0204a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            boolean z10 = false;
            switch (i10) {
                case 1:
                    q1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    Q();
                    break;
                case 3:
                    p1((PlaybackStateCompat) b.c(parcel, PlaybackStateCompat.CREATOR));
                    break;
                case 4:
                    S((MediaMetadataCompat) b.c(parcel, MediaMetadataCompat.CREATOR));
                    break;
                case 5:
                    u(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                case 6:
                    T0((CharSequence) b.c(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                case 7:
                    D0((Bundle) b.c(parcel, Bundle.CREATOR));
                    break;
                case 8:
                    o0((ParcelableVolumeInfo) b.c(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                case 9:
                    r(parcel.readInt());
                    break;
                case 10:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    S0(z10);
                    break;
                case 11:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    M0(z10);
                    break;
                case 12:
                    a0(parcel.readInt());
                    break;
                case 13:
                    s();
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void D0(Bundle bundle);

    void M0(boolean z10);

    void Q();

    void S(MediaMetadataCompat mediaMetadataCompat);

    void S0(boolean z10);

    void T0(CharSequence charSequence);

    void a0(int i10);

    void o0(ParcelableVolumeInfo parcelableVolumeInfo);

    void p1(PlaybackStateCompat playbackStateCompat);

    void q1(String str, Bundle bundle);

    void r(int i10);

    void s();

    void u(List list);
}
