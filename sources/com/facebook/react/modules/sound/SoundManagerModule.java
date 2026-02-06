package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "SoundManager")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/modules/sound/SoundManagerModule;", "Lcom/facebook/fbreact/specs/NativeSoundManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Llf/M;", "playTouchSound", "()V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SoundManagerModule extends NativeSoundManagerSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "SoundManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void playTouchSound() {
        Object systemService = getReactApplicationContext().getSystemService("audio");
        C6496s.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).playSoundEffect(0);
    }
}
