package io.intercom.android.sdk.ui.common;

import Y.C1500m;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider;", "", "<init>", "()V", "", "getText", "(LY/m;I)Ljava/lang/String;", "StringRes", "ActualString", "Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StringProvider {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "string", "", "<init>", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActualString extends StringProvider {
        public static final int $stable = 0;
        private final String string;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActualString(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "string");
            this.string = str;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        public final String component1() {
            return this.string;
        }

        public final ActualString copy(String str) {
            C6496s.h(str, "string");
            return new ActualString(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActualString) && C6496s.c(this.string, ((ActualString) obj).string);
        }

        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        public String toString() {
            return "ActualString(string=" + this.string + ')';
        }
    }

    public /* synthetic */ StringProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getText(C1500m mVar, int i10) {
        String str;
        mVar.T(-1160503525);
        if (this instanceof ActualString) {
            str = ((ActualString) this).getString();
        } else if (this instanceof StringRes) {
            StringRes stringRes = (StringRes) this;
            str = ActualStringOrResKt.parseString((Context) mVar.m(AndroidCompositionLocals_androidKt.g()), stringRes.getStringRes(), stringRes.getParams());
        } else {
            throw new C6535s();
        }
        mVar.M();
        return str;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "stringRes", "", "params", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getStringRes", "()I", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StringRes extends StringProvider {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StringRes(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? C6565s.n() : list);
        }

        public static /* synthetic */ StringRes copy$default(StringRes stringRes2, int i10, List<Pair<String, String>> list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = stringRes2.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = stringRes2.params;
            }
            return stringRes2.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final StringRes copy(int i10, List<Pair<String, String>> list) {
            C6496s.h(list, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            return new StringRes(i10, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringRes)) {
                return false;
            }
            StringRes stringRes2 = (StringRes) obj;
            return this.stringRes == stringRes2.stringRes && C6496s.c(this.params, stringRes2.params);
        }

        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return (Integer.hashCode(this.stringRes) * 31) + this.params.hashCode();
        }

        public String toString() {
            return "StringRes(stringRes=" + this.stringRes + ", params=" + this.params + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringRes(int i10, List<Pair<String, String>> list) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            this.stringRes = i10;
            this.params = list;
        }
    }

    private StringProvider() {
    }
}
