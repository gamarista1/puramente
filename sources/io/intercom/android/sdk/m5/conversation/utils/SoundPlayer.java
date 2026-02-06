package io.intercom.android.sdk.m5.conversation.utils;

import Ne.C5481a;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "soundId", "loadSound", "(Landroid/content/Context;I)I", "", "loaded", "Llf/M;", "playIfLoaded", "(ZI)V", "loadSounds", "(Landroid/content/Context;)V", "release", "playMessageFailedSound", "playMessageSentSound", "playAdminMessageReceivedSound", "playOperatorMessageReceivedSound", "Landroid/media/SoundPool;", "soundPool", "Landroid/media/SoundPool;", "messageReceivedId", "I", "replyFailedId", "replySentId", "operatorReceivedId", "messageReceivedLoaded", "Z", "replyFailedLoaded", "replySentLoaded", "operatorReceivedLoaded", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SoundPlayer {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NOT_FOUND_ID = -1;
    private static final Twig TWIG = LumberMill.getLogger();
    private int messageReceivedId = -1;
    private boolean messageReceivedLoaded;
    private int operatorReceivedId = -1;
    private boolean operatorReceivedLoaded;
    private int replyFailedId = -1;
    private boolean replyFailedLoaded;
    private int replySentId = -1;
    private boolean replySentLoaded;
    private final SoundPool soundPool;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer$Companion;", "", "<init>", "()V", "TWIG", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "NOT_FOUND_ID", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SoundPlayer() {
        SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(5).build()).build();
        C6496s.g(build, "build(...)");
        this.soundPool = build;
    }

    private final int loadSound(Context context, int i10) {
        try {
            return this.soundPool.load(context, i10, 1);
        } catch (Resources.NotFoundException e10) {
            TWIG.e(e10, "Could not play sound", new Object[0]);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static final void loadSounds$lambda$0(SoundPlayer soundPlayer, SoundPool soundPool2, int i10, int i11) {
        C6496s.h(soundPlayer, "this$0");
        if (i11 != 0) {
            return;
        }
        if (i10 == soundPlayer.messageReceivedId) {
            soundPlayer.messageReceivedLoaded = true;
        } else if (i10 == soundPlayer.replyFailedId) {
            soundPlayer.replyFailedLoaded = true;
        } else if (i10 == soundPlayer.replySentId) {
            soundPlayer.replySentLoaded = true;
        } else if (i10 == soundPlayer.operatorReceivedId) {
            soundPlayer.operatorReceivedLoaded = true;
        }
    }

    private final void playIfLoaded(boolean z10, int i10) {
        if (z10 && i10 != -1) {
            this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public final void loadSounds(Context context) {
        C6496s.h(context, "context");
        this.soundPool.setOnLoadCompleteListener(new C5481a(this));
        this.messageReceivedId = loadSound(context, R.raw.intercom_received);
        this.replyFailedId = loadSound(context, R.raw.intercom_failed);
        this.replySentId = loadSound(context, R.raw.intercom_sent);
        this.operatorReceivedId = loadSound(context, R.raw.intercom_operator);
    }

    public final void playAdminMessageReceivedSound() {
        playIfLoaded(this.messageReceivedLoaded, this.messageReceivedId);
    }

    public final void playMessageFailedSound() {
        playIfLoaded(this.replyFailedLoaded, this.replyFailedId);
    }

    public final void playMessageSentSound() {
        playIfLoaded(this.replySentLoaded, this.replySentId);
    }

    public final void playOperatorMessageReceivedSound() {
        playIfLoaded(this.operatorReceivedLoaded, this.operatorReceivedId);
    }

    public final void release() {
        this.soundPool.release();
    }
}
