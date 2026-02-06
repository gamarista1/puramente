package com.facebook.react.internal.turbomodule.core;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;", "", "<init>", "()V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeModuleSoLoader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static boolean isSoLibraryLoaded;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader$Companion;", "", "<init>", "()V", "Llf/M;", "maybeLoadSoLibrary", "", "isSoLibraryLoaded", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized void maybeLoadSoLibrary() {
            if (!NativeModuleSoLoader.isSoLibraryLoaded) {
                SoLoader.t("turbomodulejsijni");
                NativeModuleSoLoader.isSoLibraryLoaded = true;
            }
        }

        private Companion() {
        }
    }

    public static final synchronized void maybeLoadSoLibrary() {
        synchronized (NativeModuleSoLoader.class) {
            Companion.maybeLoadSoLibrary();
        }
    }
}
