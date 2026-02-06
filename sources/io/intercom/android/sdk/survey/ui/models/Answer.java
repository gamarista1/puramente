package io.intercom.android.sdk.survey.ui.models;

import Ef.m;
import Re.C5511a;
import Re.b;
import Y.A1;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer;", "", "<init>", "()V", "getLength", "", "DateTimeAnswer", "SingleAnswer", "MultipleAnswer", "NoAnswer", "MediaAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Answer {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "date", "", "hours", "", "minutes", "<init>", "(JII)V", "getDate", "()J", "getHours", "()I", "getMinutes", "getLength", "getLocalTime", "", "getDateAsString", "getAnswer", "formatTime", "time", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j10, int i10, int i11) {
            super((DefaultConstructorMarker) null);
            this.date = j10;
            this.hours = i10;
            this.minutes = i11;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j10, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j10 = dateTimeAnswer.date;
            }
            if ((i12 & 2) != 0) {
                i10 = dateTimeAnswer.hours;
            }
            if ((i12 & 4) != 0) {
                i11 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j10, i10, i11);
        }

        private final String formatTime(int i10) {
            String format = new DecimalFormat("00").format(Integer.valueOf(m.d(i10, 0)));
            C6496s.g(format, "format(...)");
            return format;
        }

        public final long component1() {
            return this.date;
        }

        public final int component2() {
            return this.hours;
        }

        public final int component3() {
            return this.minutes;
        }

        public final DateTimeAnswer copy(long j10, int i10, int i11) {
            return new DateTimeAnswer(j10, i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) obj;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        public final String getAnswer() {
            return getDateAsString() + 'T' + formatTime(this.hours) + ':' + formatTime(this.minutes) + ":00Z";
        }

        public final long getDate() {
            return this.date;
        }

        public final String getDateAsString() {
            long j10 = this.date;
            if (j10 == -1) {
                return "";
            }
            String formatTimeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j10, "YYYY-MM-dd");
            C6496s.g(formatTimeInMillisAsDate, "formatTimeInMillisAsDate(...)");
            return formatTimeInMillisAsDate;
        }

        public final int getHours() {
            return this.hours;
        }

        public int getLength() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.date);
            sb2.append(this.hours);
            sb2.append(this.minutes);
            return sb2.toString().length();
        }

        public final String getLocalTime() {
            int i10;
            int i11 = this.hours;
            if (i11 == -1 || (i10 = this.minutes) == -1) {
                return "";
            }
            String formatFromUtcTime = TimeFormatter.formatFromUtcTime(i11, i10);
            C6496s.g(formatFromUtcTime, "formatFromUtcTime(...)");
            return formatFromUtcTime;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return (((Long.hashCode(this.date) * 31) + Integer.hashCode(this.hours)) * 31) + Integer.hashCode(this.minutes);
        }

        public String toString() {
            return "DateTimeAnswer(date=" + this.date + ", hours=" + this.hours + ", minutes=" + this.minutes + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\nH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "mediaItems", "", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "<init>", "(Ljava/util/List;)V", "getMediaItems", "()Ljava/util/List;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "MediaItem", "FileUploadStatus", "FileUploadError", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaAnswer extends Answer {
        public static final int $stable = 8;
        private final List<MediaItem> mediaItems;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "", "errorMessages", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "getErrorMessages", "()Ljava/util/List;", "UploadFailed", "FileLimitExceeded", "UnsupportedFileType", "FileTooLarge", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class FileUploadError {
            public static final int $stable = 8;
            private final List<StringProvider.StringRes> errorMessages;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(List<StringProvider.StringRes> list) {
                    super(list, (DefaultConstructorMarker) null);
                    C6496s.h(list, MetricTracker.Object.MESSAGE);
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public FileTooLarge(List<StringProvider.StringRes> list) {
                    super(list, (DefaultConstructorMarker) null);
                    C6496s.h(list, MetricTracker.Object.MESSAGE);
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(List<StringProvider.StringRes> list) {
                    super(list, (DefaultConstructorMarker) null);
                    C6496s.h(list, MetricTracker.Object.MESSAGE);
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public UploadFailed(List<StringProvider.StringRes> list) {
                    super(list, (DefaultConstructorMarker) null);
                    C6496s.h(list, MetricTracker.Object.MESSAGE);
                }
            }

            public /* synthetic */ FileUploadError(List list, DefaultConstructorMarker defaultConstructorMarker) {
                this(list);
            }

            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "", "<init>", "()V", "None", "Queued", "Uploading", "Success", "Error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "<init>", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;)V", "getError", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Error extends FileUploadStatus {
                public static final int $stable = 8;
                private final FileUploadError error;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Error(FileUploadError fileUploadError) {
                    super((DefaultConstructorMarker) null);
                    C6496s.h(fileUploadError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                    this.error = fileUploadError;
                }

                public static /* synthetic */ Error copy$default(Error error2, FileUploadError fileUploadError, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        fileUploadError = error2.error;
                    }
                    return error2.copy(fileUploadError);
                }

                public final FileUploadError component1() {
                    return this.error;
                }

                public final Error copy(FileUploadError fileUploadError) {
                    C6496s.h(fileUploadError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                    return new Error(fileUploadError);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && C6496s.c(this.error, ((Error) obj).error);
                }

                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;
                public static final None INSTANCE = new None();

                private None() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Success extends FileUploadStatus {
                public static final int $stable = 0;

                /* renamed from: id  reason: collision with root package name */
                private final int f70328id;

                public Success(int i10) {
                    super((DefaultConstructorMarker) null);
                    this.f70328id = i10;
                }

                public static /* synthetic */ Success copy$default(Success success, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = success.f70328id;
                    }
                    return success.copy(i10);
                }

                public final int component1() {
                    return this.f70328id;
                }

                public final Success copy(int i10) {
                    return new Success(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && this.f70328id == ((Success) obj).f70328id;
                }

                public final int getId() {
                    return this.f70328id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f70328id);
                }

                public String toString() {
                    return "Success(id=" + this.f70328id + ')';
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super((DefaultConstructorMarker) null);
                }
            }

            public /* synthetic */ FileUploadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR+\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\nR\u001b\u0010\u0007\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "data", "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "uploadStatus", "Llf/M;", "setUploadStatus", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;)V", "component1", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "copy", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "getData", "<set-?>", "_uploadStatus$delegate", "LY/r0;", "get_uploadStatus", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "set_uploadStatus", "_uploadStatus", "uploadStatus$delegate", "LY/A1;", "getUploadStatus", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MediaItem {
            public static final int $stable = 8;
            private final C1510r0 _uploadStatus$delegate = u1.d(FileUploadStatus.None.INSTANCE, (o1) null, 2, (Object) null);
            private final MediaData.Media data;
            private final A1 uploadStatus$delegate = p1.e(new C5511a(this));

            public MediaItem(MediaData.Media media) {
                C6496s.h(media, "data");
                this.data = media;
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus$delegate.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus$delegate.setValue(fileUploadStatus);
            }

            /* access modifiers changed from: private */
            public static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem mediaItem) {
                C6496s.h(mediaItem, "this$0");
                return mediaItem.get_uploadStatus();
            }

            public final MediaData.Media component1() {
                return this.data;
            }

            public final MediaItem copy(MediaData.Media media) {
                C6496s.h(media, "data");
                return new MediaItem(media);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MediaItem) && C6496s.c(this.data, ((MediaItem) obj).data);
            }

            public final MediaData.Media getData() {
                return this.data;
            }

            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus$delegate.getValue();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(FileUploadStatus fileUploadStatus) {
                C6496s.h(fileUploadStatus, "uploadStatus");
                set_uploadStatus(fileUploadStatus);
            }

            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaAnswer(List<MediaItem> list) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "mediaItems");
            this.mediaItems = list;
        }

        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List<MediaItem> list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        public final MediaAnswer copy(List<MediaItem> list) {
            C6496s.h(list, "mediaItems");
            return new MediaAnswer(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaAnswer) && C6496s.c(this.mediaItems, ((MediaAnswer) obj).mediaItems);
        }

        public int getLength() {
            return this.mediaItems.size();
        }

        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        public String toString() {
            return "MediaAnswer(mediaItems=" + this.mediaItems + ')';
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0012H×\u0001J\t\u0010\u001b\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answers", "", "", "otherAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "(Ljava/util/Set;Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;)V", "getAnswers", "()Ljava/util/Set;", "getOtherAnswer", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "copyWithAnswerToggled", "answer", "copyWithOther", "", "getLength", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "OtherAnswer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MultipleAnswer extends Answer {
        public static final int $stable = 8;
        private final Set<String> answers;
        private final OtherAnswer otherAnswer;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "", "<init>", "()V", "toString", "", "NotSelected", "SelectedNoText", "SelectedWithText", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;
                private final String text;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public SelectedWithText(String str) {
                    super((DefaultConstructorMarker) null);
                    C6496s.h(str, AttributeType.TEXT);
                    this.text = str;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final SelectedWithText copy(String str) {
                    C6496s.h(str, AttributeType.TEXT);
                    return new SelectedWithText(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SelectedWithText) && C6496s.c(this.text, ((SelectedWithText) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public String toString() {
                return "";
            }

            private OtherAnswer() {
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i10 & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer2);
        }

        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set<String> set, OtherAnswer otherAnswer2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i10 & 2) != 0) {
                otherAnswer2 = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer2);
        }

        /* access modifiers changed from: private */
        public static final CharSequence getLength$lambda$1(String str) {
            C6496s.h(str, "it");
            return str;
        }

        public final Set<String> component1() {
            return this.answers;
        }

        public final OtherAnswer component2() {
            return this.otherAnswer;
        }

        public final MultipleAnswer copy(Set<String> set, OtherAnswer otherAnswer2) {
            C6496s.h(set, "answers");
            C6496s.h(otherAnswer2, "otherAnswer");
            return new MultipleAnswer(set, otherAnswer2);
        }

        public final Answer copyWithAnswerToggled(String str) {
            C6496s.h(str, "answer");
            Set i12 = C6565s.i1(this.answers);
            if (this.answers.contains(str)) {
                i12.remove(str);
            } else {
                i12.add(str);
            }
            if (!i12.isEmpty() || !(this.otherAnswer instanceof OtherAnswer.NotSelected)) {
                return copy$default(this, i12, (OtherAnswer) null, 2, (Object) null);
            }
            return NoAnswer.ResetNoAnswer.INSTANCE;
        }

        public final Answer copyWithOther(OtherAnswer otherAnswer2) {
            C6496s.h(otherAnswer2, "otherAnswer");
            if (!this.answers.isEmpty() || !(otherAnswer2 instanceof OtherAnswer.NotSelected)) {
                return copy$default(this, (Set) null, otherAnswer2, 1, (Object) null);
            }
            return NoAnswer.ResetNoAnswer.INSTANCE;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) obj;
            return C6496s.c(this.answers, multipleAnswer.answers) && C6496s.c(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        /* renamed from: getAnswers  reason: collision with other method in class */
        public final Set<String> m471getAnswers() {
            return this.answers;
        }

        public int getLength() {
            return C6565s.x0(this.answers, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new b(), 31, (Object) null).length();
        }

        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return (this.answers.hashCode() * 31) + this.otherAnswer.hashCode();
        }

        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        public final List<String> getAnswers() {
            List c10 = C6565s.c();
            c10.addAll(C6565s.e1(this.answers));
            OtherAnswer otherAnswer2 = this.otherAnswer;
            if (!C6496s.c(otherAnswer2, OtherAnswer.NotSelected.INSTANCE)) {
                if (C6496s.c(otherAnswer2, OtherAnswer.SelectedNoText.INSTANCE)) {
                    c10.add("Other");
                } else if (otherAnswer2 instanceof OtherAnswer.SelectedWithText) {
                    c10.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                } else {
                    throw new C6535s();
                }
            }
            return C6565s.a(c10);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(Set<String> set, OtherAnswer otherAnswer2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(set, "answers");
            C6496s.h(otherAnswer2, "otherAnswer");
            this.answers = set;
            this.otherAnswer = otherAnswer2;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "<init>", "()V", "getLength", "", "InitialNoAnswer", "ResetNoAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ NoAnswer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int getLength() {
            return 0;
        }

        private NoAnswer() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\tH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "", "<init>", "(Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SingleAnswer extends Answer {
        public static final int $stable = 0;
        private final String answer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleAnswer(String str) {
            super((DefaultConstructorMarker) null);
            C6496s.h(str, "answer");
            this.answer = str;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        public final String component1() {
            return this.answer;
        }

        public final SingleAnswer copy(String str) {
            C6496s.h(str, "answer");
            return new SingleAnswer(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleAnswer) && C6496s.c(this.answer, ((SingleAnswer) obj).answer);
        }

        public final String getAnswer() {
            return this.answer;
        }

        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        public String toString() {
            return "SingleAnswer(answer=" + this.answer + ')';
        }
    }

    public /* synthetic */ Answer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLength();

    private Answer() {
    }
}
