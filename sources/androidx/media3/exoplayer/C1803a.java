package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.a  reason: case insensitive filesystem */
final class C1803a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17592a;

    /* renamed from: b  reason: collision with root package name */
    private final C0309a f17593b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f17594c;

    /* renamed from: androidx.media3.exoplayer.a$a  reason: collision with other inner class name */
    private final class C0309a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f17595a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f17596b;

        public C0309a(Handler handler, b bVar) {
            this.f17596b = handler;
            this.f17595a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f17596b.post(this);
            }
        }

        public void run() {
            if (C1803a.this.f17594c) {
                this.f17595a.s();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.a$b */
    public interface b {
        void s();
    }

    public C1803a(Context context, Handler handler, b bVar) {
        this.f17592a = context.getApplicationContext();
        this.f17593b = new C0309a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f17594c) {
            this.f17592a.registerReceiver(this.f17593b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f17594c = true;
        } else if (!z10 && this.f17594c) {
            this.f17592a.unregisterReceiver(this.f17593b);
            this.f17594c = false;
        }
    }
}
