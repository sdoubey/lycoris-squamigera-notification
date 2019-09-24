package eu.lycoris.squamigera.notification.track;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Getter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class TrackConvertionFailedNotification implements LycorisSubjectMessage {

  public static final String SUBJECT = "TRACK_CONVERT_FAILED_NOTIFICATION";

  public static TrackConvertionFailedNotificationBuilder builder(
      @NonNull UUID id, @NonNull String reason) {
    return new TrackConvertionFailedNotificationBuilder().id(id).reason(reason);
  }

  @NonNull private UUID id;

  @NonNull private String reason;

  @JsonIgnore
  public String getSubject() {
    return SUBJECT;
  }
}
