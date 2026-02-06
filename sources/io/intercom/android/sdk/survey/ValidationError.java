package io.intercom.android.sdk.survey;

import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError;", "", "<init>", "()V", "Unchecked", "ValidationStringError", "NoValidationError", "Lio/intercom/android/sdk/survey/ValidationError$NoValidationError;", "Lio/intercom/android/sdk/survey/ValidationError$Unchecked;", "Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ValidationError {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$NoValidationError;", "Lio/intercom/android/sdk/survey/ValidationError;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoValidationError extends ValidationError {
        public static final int $stable = 0;
        public static final NoValidationError INSTANCE = new NoValidationError();

        private NoValidationError() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$Unchecked;", "Lio/intercom/android/sdk/survey/ValidationError;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unchecked extends ValidationError {
        public static final int $stable = 0;
        public static final Unchecked INSTANCE = new Unchecked();

        private Unchecked() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ ValidationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;", "Lio/intercom/android/sdk/survey/ValidationError;", "stringRes", "", "params", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getStringRes", "()I", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ValidationStringError extends ValidationError {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ValidationStringError(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? C6565s.n() : list);
        }

        public static /* synthetic */ ValidationStringError copy$default(ValidationStringError validationStringError, int i10, List<Pair<String, String>> list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = validationStringError.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = validationStringError.params;
            }
            return validationStringError.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final ValidationStringError copy(int i10, List<Pair<String, String>> list) {
            C6496s.h(list, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            return new ValidationStringError(i10, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationStringError)) {
                return false;
            }
            ValidationStringError validationStringError = (ValidationStringError) obj;
            return this.stringRes == validationStringError.stringRes && C6496s.c(this.params, validationStringError.params);
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
            return "ValidationStringError(stringRes=" + this.stringRes + ", params=" + this.params + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ValidationStringError(int i10, List<Pair<String, String>> list) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
            this.stringRes = i10;
            this.params = list;
        }
    }

    private ValidationError() {
    }
}
