package eu.lycoris.squamigera.notification.track;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;

import eu.lycoris.squamigera.notification.common.Notification;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class TrackConvertionFailedNotification extends Notification {

  public static final String SUBJECT = "TRACK_CONVERT_FAILED_NOTIFICATION";

  public static TrackConvertionFailedNotificationBuilder builder(
      @NonNull UUID id, @NonNull String reason) {
    return new TrackConvertionFailedNotificationBuilder().subject(SUBJECT).id(id).reason(reason);
  }

  private UUID id;

  private String reason;

  @Builder
  @JsonCreator
  protected TrackConvertionFailedNotification(String subject, UUID id, String reason) {
    super(subject);
    this.id = id;
    this.reason = reason;
  }
}
