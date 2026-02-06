package com.margelo.nitro.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/core/NullType;", "", "<init>", "()V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class NullType {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    @B7.a
    @Keep
    public static final NullType NULL = new NullType();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private NullType() {
    }

    public boolean equals(Object obj) {
        return obj instanceof NullType;
    }

    public int hashCode() {
        return 0;
    }
}
