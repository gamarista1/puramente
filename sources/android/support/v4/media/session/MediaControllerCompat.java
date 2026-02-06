package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    private final b f10654a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaSessionCompat.Token f10655b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f10656c;

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a  reason: collision with root package name */
        protected final MediaController f10657a;

        /* renamed from: b  reason: collision with root package name */
        final Object f10658b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final List f10659c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private HashMap f10660d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        final MediaSessionCompat.Token f10661e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a  reason: collision with root package name */
            private WeakReference f10662a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f10662a = new WeakReference(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f10662a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f10658b) {
                        mediaControllerImplApi21.f10661e.d(b.a.a(androidx.core.app.g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f10661e.e(G3.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.c();
                    }
                }
            }
        }

        private static class a extends a.C0201a {
            a(a aVar) {
                super(aVar);
            }

            public void D0(Bundle bundle) {
                throw new AssertionError();
            }

            public void Q() {
                throw new AssertionError();
            }

            public void S(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public void T0(CharSequence charSequence) {
                throw new AssertionError();
            }

            public void o0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            public void u(List list) {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f10661e = token;
            this.f10657a = new MediaController(context, (MediaSession.Token) token.c());
            if (token.a() == null) {
                d();
            }
        }

        private void d() {
            e("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        public d a() {
            MediaController.TransportControls transportControls = this.f10657a.getTransportControls();
            if (Build.VERSION.SDK_INT >= 29) {
                return new h(transportControls);
            }
            return new g(transportControls);
        }

        public boolean b(KeyEvent keyEvent) {
            return this.f10657a.dispatchMediaButtonEvent(keyEvent);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f10661e.a() != null) {
                Iterator it = this.f10659c.iterator();
                if (!it.hasNext()) {
                    this.f10659c.clear();
                    return;
                }
                c.a(it.next());
                this.f10660d.put((Object) null, new a((a) null));
                throw null;
            }
        }

        public void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f10657a.sendCommand(str, bundle, resultReceiver);
        }

        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.f10657a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        private static class C0201a extends a.C0203a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference f10663a;

            C0201a(a aVar) {
                this.f10663a = new WeakReference(aVar);
            }

            public void M0(boolean z10) {
                c.a(this.f10663a.get());
            }

            public void S0(boolean z10) {
            }

            public void a0(int i10) {
                c.a(this.f10663a.get());
            }

            public void p1(PlaybackStateCompat playbackStateCompat) {
                c.a(this.f10663a.get());
            }

            public void q1(String str, Bundle bundle) {
                c.a(this.f10663a.get());
            }

            public void r(int i10) {
                c.a(this.f10663a.get());
            }

            public void s() {
                c.a(this.f10663a.get());
            }
        }
    }

    interface b {
        d a();

        boolean b(KeyEvent keyEvent);

        MediaMetadataCompat getMetadata();
    }

    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static abstract class d {
        d() {
        }

        public abstract void a();
    }

    static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        protected final MediaController.TransportControls f10664a;

        e(MediaController.TransportControls transportControls) {
            this.f10664a = transportControls;
        }

        public void a() {
            this.f10664a.pause();
        }
    }

    static class f extends e {
        f(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    static class g extends f {
        g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    static class h extends g {
        h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f10654a.b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaMetadataCompat b() {
        return this.f10654a.getMetadata();
    }

    public d c() {
        return this.f10654a.a();
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f10656c = Collections.synchronizedSet(new HashSet());
            this.f10655b = token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f10654a = new c(context, token);
            } else {
                this.f10654a = new MediaControllerImplApi21(context, token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
