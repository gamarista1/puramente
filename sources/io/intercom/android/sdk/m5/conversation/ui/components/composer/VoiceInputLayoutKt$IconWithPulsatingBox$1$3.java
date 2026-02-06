package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import C.C1086d;
import M0.e;
import V.V;
import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.R;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class VoiceInputLayoutKt$IconWithPulsatingBox$1$3 implements q {
    final /* synthetic */ long $iconTint;
    final /* synthetic */ SpeechRecognizerState $speechRecognizerState;

    VoiceInputLayoutKt$IconWithPulsatingBox$1$3(SpeechRecognizerState speechRecognizerState, long j10) {
        this.$speechRecognizerState = speechRecognizerState;
        this.$iconTint = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        float f10;
        C6496s.h(dVar, "$this$PulsatingBox");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(dVar) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            if (this.$speechRecognizerState.isListening()) {
                f10 = (float) 18;
            } else {
                f10 = (float) 24;
            }
            V.a(e.c(R.drawable.intercom_ic_mic, mVar, 0), "Voice Input", androidx.compose.foundation.layout.q.n(dVar.e(i.f23074a, c.f23044a.e()), h.j(f10)), this.$iconTint, mVar, 56, 0);
            return;
        }
        mVar.I();
    }
}
