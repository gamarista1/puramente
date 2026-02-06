package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Sg.p;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Ug.Z;
import Y.C1503n0;
import Y.C1507p0;
import Y.C1510r0;
import Y.D0;
import Y.i1;
import Y.o1;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import yf.C6798l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0012\b\u0001\u0018\u0000 \\2\u00020\u0001:\u0002\\]B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b+\u0010\u001bJ\u0019\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b-\u0010\u001bJ!\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020&2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R+\u0010B\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u000fR+\u0010F\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010\u000fR/\u0010K\u001a\u0004\u0018\u00010\u00072\b\u0010<\u001a\u0004\u0018\u00010\u00078B@BX\u0002¢\u0006\u0012\n\u0004\bG\u0010>\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0013R+\u0010S\u001a\u00020L2\u0006\u0010<\u001a\u00020L8B@BX\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR+\u0010Y\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d8B@BX\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010 R\u0011\u0010[\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bZ\u0010W¨\u0006^"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState;", "Landroid/speech/RecognitionListener;", "Landroid/speech/SpeechRecognizer;", "speechRecognizer", "", "isSpeechRecognizerAvailable", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "Llf/M;", "onStateChange", "<init>", "(Landroid/speech/SpeechRecognizer;ZLyf/l;)V", "", "text", "updateProgressText", "(Ljava/lang/String;)V", "updateEndOfSpeechText", "newState", "updateState", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;)V", "reset", "()V", "startListening", "stopListening", "Landroid/os/Bundle;", "params", "onReadyForSpeech", "(Landroid/os/Bundle;)V", "onBeginningOfSpeech", "", "rmsdB", "onRmsChanged", "(F)V", "", "buffer", "onBufferReceived", "([B)V", "onEndOfSpeech", "", "error", "onError", "(I)V", "results", "onResults", "partialResults", "onPartialResults", "eventType", "onEvent", "(ILandroid/os/Bundle;)V", "isListening", "()Z", "Landroid/speech/SpeechRecognizer;", "Z", "Lyf/l;", "LUg/K;", "scope", "LUg/K;", "LUg/w0;", "timeoutJob", "LUg/w0;", "<set-?>", "textInProgress$delegate", "LY/r0;", "getTextInProgress", "()Ljava/lang/String;", "setTextInProgress", "textInProgress", "completedText$delegate", "getCompletedText", "setCompletedText", "completedText", "speechState$delegate", "getSpeechState", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "setSpeechState", "speechState", "", "timer$delegate", "LY/p0;", "getTimer", "()J", "setTimer", "(J)V", "timer", "rms$delegate", "LY/n0;", "getRms", "()F", "setRms", "rms", "getAmplitude", "amplitude", "Companion", "SpeechState", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeechRecognizerState implements RecognitionListener {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int TIMEOUT_IN_MILLIS = 5000;
    private final C1510r0 completedText$delegate = u1.d("", (o1) null, 2, (Object) null);
    private final boolean isSpeechRecognizerAvailable;
    private final C6798l onStateChange;
    private final C1503n0 rms$delegate = D0.a(0.0f);
    private final K scope = L.a(Z.c());
    private final SpeechRecognizer speechRecognizer;
    private final C1510r0 speechState$delegate = u1.d((Object) null, (o1) null, 2, (Object) null);
    private final C1510r0 textInProgress$delegate = u1.d("", (o1) null, 2, (Object) null);
    private C5600w0 timeoutJob;
    private final C1507p0 timer$delegate = i1.a(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$Companion;", "", "<init>", "()V", "TIMEOUT_IN_MILLIS", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "", "Listening", "SpeechStarted", "SpeechEnded", "SpeechInProgress", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$Listening;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechEnded;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechInProgress;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechStarted;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SpeechState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$Listening;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Listening implements SpeechState {
            public static final int $stable = 0;
            public static final Listening INSTANCE = new Listening();

            private Listening() {
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechEnded;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "message", "", "duration", "", "<init>", "(Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpeechEnded implements SpeechState {
            public static final int $stable = 0;
            private final long duration;
            private final String message;

            public SpeechEnded(String str, long j10) {
                C6496s.h(str, MetricTracker.Object.MESSAGE);
                this.message = str;
                this.duration = j10;
            }

            public static /* synthetic */ SpeechEnded copy$default(SpeechEnded speechEnded, String str, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = speechEnded.message;
                }
                if ((i10 & 2) != 0) {
                    j10 = speechEnded.duration;
                }
                return speechEnded.copy(str, j10);
            }

            public final String component1() {
                return this.message;
            }

            public final long component2() {
                return this.duration;
            }

            public final SpeechEnded copy(String str, long j10) {
                C6496s.h(str, MetricTracker.Object.MESSAGE);
                return new SpeechEnded(str, j10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpeechEnded)) {
                    return false;
                }
                SpeechEnded speechEnded = (SpeechEnded) obj;
                return C6496s.c(this.message, speechEnded.message) && this.duration == speechEnded.duration;
            }

            public final long getDuration() {
                return this.duration;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return (this.message.hashCode() * 31) + Long.hashCode(this.duration);
            }

            public String toString() {
                return "SpeechEnded(message=" + this.message + ", duration=" + this.duration + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechInProgress;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpeechInProgress implements SpeechState {
            public static final int $stable = 0;
            private final String message;

            public SpeechInProgress(String str) {
                C6496s.h(str, MetricTracker.Object.MESSAGE);
                this.message = str;
            }

            public static /* synthetic */ SpeechInProgress copy$default(SpeechInProgress speechInProgress, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = speechInProgress.message;
                }
                return speechInProgress.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SpeechInProgress copy(String str) {
                C6496s.h(str, MetricTracker.Object.MESSAGE);
                return new SpeechInProgress(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpeechInProgress) && C6496s.c(this.message, ((SpeechInProgress) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "SpeechInProgress(message=" + this.message + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState$SpeechStarted;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/SpeechRecognizerState$SpeechState;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SpeechStarted implements SpeechState {
            public static final int $stable = 0;
            public static final SpeechStarted INSTANCE = new SpeechStarted();

            private SpeechStarted() {
            }
        }
    }

    public SpeechRecognizerState(SpeechRecognizer speechRecognizer2, boolean z10, C6798l lVar) {
        C6496s.h(speechRecognizer2, "speechRecognizer");
        C6496s.h(lVar, "onStateChange");
        this.speechRecognizer = speechRecognizer2;
        this.isSpeechRecognizerAvailable = z10;
        this.onStateChange = lVar;
    }

    private final String getCompletedText() {
        return (String) this.completedText$delegate.getValue();
    }

    private final float getRms() {
        return this.rms$delegate.c();
    }

    private final SpeechState getSpeechState() {
        return (SpeechState) this.speechState$delegate.getValue();
    }

    private final String getTextInProgress() {
        return (String) this.textInProgress$delegate.getValue();
    }

    private final long getTimer() {
        return this.timer$delegate.a();
    }

    private final void reset() {
        setSpeechState((SpeechState) null);
        setCompletedText("");
        setTextInProgress("");
    }

    private final void setCompletedText(String str) {
        this.completedText$delegate.setValue(str);
    }

    private final void setRms(float f10) {
        this.rms$delegate.l(f10);
    }

    private final void setSpeechState(SpeechState speechState) {
        this.speechState$delegate.setValue(speechState);
    }

    private final void setTextInProgress(String str) {
        this.textInProgress$delegate.setValue(str);
    }

    private final void setTimer(long j10) {
        this.timer$delegate.o(j10);
    }

    private final void updateEndOfSpeechText(String str) {
        if (getSpeechState() != null && !(getSpeechState() instanceof SpeechState.SpeechEnded)) {
            setCompletedText(getCompletedText() + getTextInProgress() + str);
            updateState(new SpeechState.SpeechEnded(getCompletedText(), System.currentTimeMillis() - getTimer()));
            reset();
        }
    }

    private final void updateProgressText(String str) {
        if (!p.d0(str)) {
            setTextInProgress(str);
            updateState(new SpeechState.SpeechInProgress(getCompletedText() + getTextInProgress()));
        }
    }

    private final void updateState(SpeechState speechState) {
        setSpeechState(speechState);
        if (speechState != null) {
            this.onStateChange.invoke(speechState);
        }
    }

    public final float getAmplitude() {
        if (getRms() < 0.0f) {
            return 0.0f;
        }
        return getRms() / 10.0f;
    }

    public final boolean isListening() {
        if (getSpeechState() == null || (getSpeechState() instanceof SpeechState.SpeechEnded)) {
            return false;
        }
        return true;
    }

    public void onBeginningOfSpeech() {
        C5600w0 w0Var = this.timeoutJob;
        if (w0Var != null) {
            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
        }
        setCompletedText(getCompletedText() + getTextInProgress());
        setTextInProgress("");
        updateState(SpeechState.SpeechStarted.INSTANCE);
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
        this.timeoutJob = C5576k.d(this.scope, (g) null, (M) null, new SpeechRecognizerState$onEndOfSpeech$1(this, (C6658d<? super SpeechRecognizerState$onEndOfSpeech$1>) null), 3, (Object) null);
    }

    public void onError(int i10) {
        if (i10 == 7) {
            stopListening();
        }
    }

    public void onEvent(int i10, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("results_recognition")) != null && (str = (String) C6565s.r0(stringArrayList, 0)) != null) {
            updateProgressText(str);
        }
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) C6565s.r0(stringArrayList, 0)) == null) {
            updateEndOfSpeechText("");
        } else {
            updateEndOfSpeechText(str);
        }
    }

    public void onRmsChanged(float f10) {
        setRms(f10);
    }

    public final void startListening() {
        if (this.isSpeechRecognizerAvailable) {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", TIMEOUT_IN_MILLIS);
            intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
            if (Build.VERSION.SDK_INT >= 34) {
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
                intent.putExtra("android.speech.extra.ENABLE_FORMATTING", "quality");
            }
            intent.putExtra("calling_package", BuildConfig.LIBRARY_PACKAGE_NAME);
            this.speechRecognizer.setRecognitionListener(this);
            this.speechRecognizer.startListening(intent);
            setTimer(System.currentTimeMillis());
            updateState(SpeechState.Listening.INSTANCE);
        }
    }

    public final void stopListening() {
        if (getSpeechState() != null) {
            this.speechRecognizer.stopListening();
            this.speechRecognizer.setRecognitionListener((RecognitionListener) null);
            updateEndOfSpeechText("");
            C5600w0 w0Var = this.timeoutJob;
            if (w0Var != null) {
                C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
            }
            setTimer(0);
            L.d(this.scope, (CancellationException) null, 1, (Object) null);
        }
    }
}
