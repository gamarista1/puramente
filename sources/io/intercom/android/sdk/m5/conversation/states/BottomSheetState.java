package io.intercom.android.sdk.m5.conversation.states;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "", "Empty", "TeammatePresence", "MediaInput", "GifSearch", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$Empty;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$GifSearch;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$MediaInput;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$TeammatePresence;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BottomSheetState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$Empty;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty implements BottomSheetState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public int hashCode() {
            return -1704299409;
        }

        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$GifSearch;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "gifs", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "<init>", "(Ljava/util/List;)V", "getGifs", "()Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GifSearch implements BottomSheetState {
        public static final int $stable = 8;
        private final List<Block> gifs;

        public GifSearch(List<? extends Block> list) {
            C6496s.h(list, "gifs");
            this.gifs = list;
        }

        public final List<Block> getGifs() {
            return this.gifs;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$MediaInput;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaInput implements BottomSheetState {
        public static final int $stable = 0;
        public static final MediaInput INSTANCE = new MediaInput();

        private MediaInput() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MediaInput);
        }

        public int hashCode() {
            return -1100907420;
        }

        public String toString() {
            return "MediaInput";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState$TeammatePresence;", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TeammatePresence implements BottomSheetState {
        public static final int $stable = 0;
        public static final TeammatePresence INSTANCE = new TeammatePresence();

        private TeammatePresence() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TeammatePresence);
        }

        public int hashCode() {
            return 298154395;
        }

        public String toString() {
            return "TeammatePresence";
        }
    }
}
